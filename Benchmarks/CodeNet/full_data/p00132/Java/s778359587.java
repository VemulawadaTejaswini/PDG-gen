import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input;
		String[] data;
		while(true){
		// パズルデータ取得
		input = br.readLine().split(" ");
		int height = Integer.parseInt(input[0]);
		int width = Integer.parseInt(input[1]);
		if( height + width <= 0)	break;
		data = new String[height];
		for (int i = 0; i < height; i++) {
			data[i] = br.readLine();
		}
		//全ピースデータ取得
		int numPieces = Integer.parseInt(br.readLine());
		ArrayList<Piece> list = new ArrayList<Piece>(numPieces);
		for (int i = 0; i < numPieces; i++) {
			int h = Integer.parseInt(br.readLine().split(" ")[0]);
			data = new String[h];
			for (int j = 0; j < h; j++) {
				data[j] = br.readLine();
			}
			list.add(new Piece(data));
		}
		//選択されたピースについて正誤判定
		int numCombinations = Integer.parseInt(br.readLine());
		ArrayList<Piece> selection;
		for (int i = 0; i < numCombinations; i++) {
			input = br.readLine().split(" ");
			int piecesSelected = Integer.parseInt(input[0]);
			selection = new ArrayList<Piece>(piecesSelected);
			for (int j = 0; j < piecesSelected; j++) {
				selection.add(list.get(Integer.parseInt(input[j + 1]) - 1));
			}
			Board board = new Board(data, selection);
			System.out.println((board.solve()) ? "YES" : "NO");
		}
		}
	}
}

final class Board extends Piece {
	private Piece[] piece;

	public Board(String[] dataStr, ArrayList<Piece> list) {
		super(dataStr);
		setPiece(list);
	}

	public boolean solve() {
		if (!hasSameAreaPieces())	return false;
		boolean matched = false;
		try {
			matched = tryMatching(this);
		} catch (CloneNotSupportedException e) {
			System.exit(1);
		}
		return matched;
	}

	/**
	 * 	指定盤面がピースを使い切って埋まるか検証する。
	 */
	private boolean tryMatching(Board board) throws CloneNotSupportedException {
		Board b;
		Piece[] p = board.getPiece();
		//最後のピースをはめて、盤面がうまるかどうか
		if (p.length == 1) {
			b = board.match(p[0]);
			return ((b != null) && b.isFull());
		}
		// ピースが複数あるとき
		for (int i = 0; i < p.length; i++) {
			// 盤面をコピーしてピースがはまるか検証する
			b = board.match(p[i]);
			if ((b != null)) {
				ArrayList<Piece> list = new ArrayList<Piece>(b.getData().length);
				for (Piece piece : p) {
					list.add(piece);
				}
				list.remove(i);
				// あるピースをはめた後の盤面でピースを全てはめられる
				if (tryMatching(b.createBoardWith(list))) {
					return true;
				}
			}
		}
		// boardにはまるピースがない
		return false;
	}

	/**
	 *	盤面を指定されたピースで更新する 。
	 * @return	更新された盤面。更新がなければnullを返す。
	 */
	private Board match(Piece p)
			throws CloneNotSupportedException {
		Piece[] pieceRotated = p.getPiecesRotated();
		Piece source;
		for (Piece pr : pieceRotated) {
			for (int y = 0; y + p.height <= this.height; y++) {
				for (int x = 0; x + p.width <= this.width; x++) {
					source = subBoard(x, y, pr.width, pr.height);
					if (source == null)	continue;
					if (source.isSuitable(pr))	return update(x, y,	source.getXORPiece(pr));
				}
			}
		}
		return null;
	}

	/**
	 * 	盤面が埋まっているかどうか検証する。
	 */
	public boolean isFull() {
		String[] data = super.getData();
		for (String row : data) {
			if (row.contains("0"))	return false;
		}
		return true;
	}

	/**
	 * 盤面を指定座標とピースで更新する。
	 */
	private Board update(int x, int y, Piece p)
			throws CloneNotSupportedException {
		Board b = (Board) this.clone();
		for (int i = 0; i < p.height; i++) {
			b.getData()[y + i] = super.getData()[y + i]
					.substring(0, x)
					+ p.getData()[i]
					+ super.getData()[y + i].substring(x + p.width, super.width);
		}
		return b;
	}

	/**
	 * 	盤面をぴったり埋められるピースの組み合わせかどうか判定する。
	 */
	private boolean hasSameAreaPieces() {
		int emptyArea = this.width * this.height - this.area;
		int area = 0;
		for (Piece p : this.piece) {
			area += p.area;
		}
		return (emptyArea == area) ? true : false;
	}

	/**
	 * 盤面の一部を取得する。
	 * @return 盤面の一部。取得できない場合はnullを返す。
	 */
	private Piece subBoard(int x, int y, int width,
			int height) {
		String[] subData = new String[height];
		if (x + width > this.width || y + height > this.height)
			return null;
		for (int i = 0; i < height; i++) {
			subData[i] = super.getData()[y + i].substring(x, x + width);
		}
		return new Piece(subData);
	}
	
	/**
	 *  リストを更新した盤面を生成する。
	 */
	public Board createBoardWith(ArrayList<Piece> list) {
		return new Board(this.getData(), list);
	};

	@Override
	protected Object clone() throws CloneNotSupportedException {
		ArrayList<Piece> list = new ArrayList<Piece>(this.piece.length);
		for (Piece p : this.piece) {
			list.add(p);
		}
		return new Board(this.getData(), list);
	};
	
	public Piece[] getPiece() {
		return this.piece;
	}
	
	public void setPiece(ArrayList<Piece> list) {
		Object[] o = list.toArray();
		Arrays.sort(o, new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((Piece) o2).area - ((Piece) o1).area;
			}
		});
		this.piece = new Piece[list.size()];
		for (int i = 0; i < o.length; i++) {
			this.piece[i] = (Piece) (o[i]);
		}
	}
}

class Piece {
	static final char NOT_EXIST = '0';
	static final char EXIST = '1';
	int area;
	int width;
	int height;
	private String[] data;

	public Piece(String[] dataStr) {
		this.width = dataStr[0].length();
		this.height = dataStr.length;
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < this.width; i++) {
			buf.append(EXIST);
		}
		this.data = new String[this.height];
		setData(dataStr);
		this.area = getArea();
	}

	private int getArea() {
		int area = 0;
		for (String d : this.data) {
			for (int i = 0; i < this.data[0].length(); i++) {
				if (d.charAt(i) == EXIST)	area++;
			}
		}
		return area;
	}

	public String[] getData() {
		return this.data;
	}

	private void setData(String[] data) {
		for (int i = 0; i < data.length; i++) {
			this.data[i] = data[i].replace('.', NOT_EXIST).replace('#', EXIST);
		}
	}

	/**
	 * 	0度、90度、180度、270度回転させたピースを取得する。
	 */
	public Piece[] getPiecesRotated() {
		Piece[] piece = new Piece[4];
		piece[0] = new Piece(this.data);
		piece[1] = piece[0].rotate90();
		piece[2] = piece[1].rotate90();
		piece[3] = piece[2].rotate90();
		return piece;
	}

	/**
	 * 	90度回転させる。
	 */
	private Piece rotate90() {
		String[] dataRotated = new String[this.width];
		int c = 0;
		StringBuffer sbuf;
		for (int row = this.width - 1; row >= 0; row--) {
			sbuf = new StringBuffer();
			for (int line = 0; line < this.height; line++) {
				sbuf.append(this.data[line].charAt(row));
			}
			dataRotated[c++] = sbuf.toString();
		}
		return new Piece(dataRotated);
	}

	/**
	 * 判定のためのXORピース生成。
	 */
	public Piece getXORPiece(Piece p) {
		String[] xorPiece = new String[p.getData().length];
		StringBuffer buf;
		for (int i = 0; i < p.height; i++) {
			int row = Integer.parseInt(this.data[i], 2)	^ Integer.parseInt(p.getData()[i], 2);
			xorPiece[i] = Integer.toBinaryString(row);
			buf = new StringBuffer();
			for (int j = xorPiece[i].length(); j < p.width; j++) {
				buf.append(NOT_EXIST);
			}
			buf.append(xorPiece[i]);
			xorPiece[i] = buf.toString();
		}
		return new Piece(xorPiece);
	}

	/**
	 * 判定のためのANDピース生成。
	 */
	private Piece getANDPiece(Piece p) {
		String[] andPiece = new String[p.getData().length];
		StringBuffer buf;
		for (int i = 0; i < p.height; i++) {
			int row = Integer.parseInt(this.data[i], 2)	& Integer.parseInt(p.getData()[i], 2);
			andPiece[i] = Integer.toBinaryString(row);
			buf = new StringBuffer();
			for (int j = andPiece[i].length(); j < p.width; j++) {
				buf.append(NOT_EXIST);
			}
			buf.append(andPiece[i]);
			andPiece[i] = buf.toString();
		}
		return new Piece(andPiece);
	}

	/**
	 * ピースが盤面にはめられるか判定する。
	 */
	public boolean isSuitable(Piece p) {
		// 自身とpのXOR演算結果を取得
		Piece xorPiece = getXORPiece(p);
		// 自身とXOR演算結果のAND演算結果を取得
		Piece andPiece = getANDPiece(xorPiece);
		// 上の演算結果と自身が等しければはまる
		for (int i = 0; i < p.height; i++) {
			if (this.data[i].compareTo(andPiece.getData()[i]) != 0) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < this.data.length; i++) {
			buf.append(this.data[i].toString()
					.replace(NOT_EXIST, '.')
					.replace(EXIST, '#'));
			buf.append("\n");
		}
		return buf.toString();
	}
}