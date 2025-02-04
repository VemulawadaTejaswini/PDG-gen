import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Main {
	public static void main(String[] args)
			throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String[] input = null;
		String[] boardData = null;
		String[] pieceData = null;
		ArrayList<Piece> list = null;
		ArrayList<Piece> selection = null;
		int numPieces = 0;
		int numCombinations = 0;
		int piecesSelected = 0;
		Board board = null;
		int height = 0;
		int width = 0;
		while (true) {
			// パズルデータ取得
			input = br.readLine().split(" ");
			height = Integer.parseInt(input[0]);
			width = Integer.parseInt(input[1]);
			if (height == 0 && width == 0)
				break;

			// 盤面データ取得
			boardData = new String[height];
			for (int i = 0; i < height; i++) {
				boardData[i] = br.readLine();
			}

			// 全ピースデータ取得
			numPieces = Integer.parseInt(br.readLine());
			list = new ArrayList<Piece>(numPieces);
			for (int i = 0; i < numPieces; i++) {
				int h = Integer.parseInt(br.readLine()
						.split(" ")[0]);
				pieceData = new String[h];
				for (int j = 0; j < h; j++) {
					pieceData[j] = br.readLine();
				}
				list.add(new Piece(pieceData));
			}
			// 選択されたピースについて正誤判定
			numCombinations = Integer.parseInt(br
					.readLine());
			for (int i = 0; i < numCombinations; i++) {
				input = br.readLine().split(" ");
				piecesSelected = Integer.parseInt(input[0]);
				selection = new ArrayList<Piece>(
						piecesSelected);
				for (int j = 0; j < piecesSelected; j++) {
					selection.add(list.get(Integer
							.parseInt(input[j + 1]) - 1));
				}
				board = new Board(boardData, selection);
				System.out.println((board.solve()) ? "YES"
						: "NO");
			}
		}
	}
}

final class Board extends Piece {
	private static final boolean debug = false;
	private static final boolean detailDebug = false;
	private Piece[] piece;
	private int matchingCounter; // for debug
	private int noMatchingCounter; // for debug

	public Board(String[] dataStr, ArrayList<Piece> list) {
		super(dataStr);
		setPiece(list);
		this.matchingCounter = 0;
		this.noMatchingCounter = 0;
	}

	public boolean solve() {
		// 盤面を埋めるのに必要十分なピース群でないなら処理しない
		if (!hasSameAreaPieces())
			return false;

		// がんばってもピースをはめられない空間があるなら処理しない
		if(isUnsolvable())
			return false;
			
		boolean matched = false;
		try {
			matched = tryMatching(this);
		} catch (CloneNotSupportedException e) {
			// DO NOTHING
		}
		return matched;
	}

	/**
	 * 枝狩り用。全ての座標に対して全てのピースをはめてみる。
	 * @return	どうがんばってもはまらないピースがあるかどうか
	 */
	private boolean isUnsolvable(){
		final boolean unsolvable = true;
		final boolean solvable = false;
		Piece subBoard = null;
		for(int height = 0; height < this.width; height++){
			for(int width = 0; width < this.width; width++){
				boolean isUnsolvable = true;
				boolean isAvailableGrid = false;
				//全てのピースがはまる
				for(Piece p: this.piece){
					if(!isUnsolvable)	break;
					Piece[] PieceRotated = p.createPiecesRotated();
					for(Piece pr: PieceRotated){
						//subBoard取得
						if(width + pr.width > width ||
								height + pr.height > height)
							continue;
						isAvailableGrid = true;
						subBoard = this.subBoard(width, height, pr.width, pr.height);
						//埋まるなら次の座標へ
						if(subBoard.isSuitable(pr)){
							isUnsolvable = false;
							break;
						}
					}
					
				}
				//全てのピースがはまらない
				if(isAvailableGrid && isUnsolvable)	return unsolvable;
			}
		}
		return solvable;
	}

	/**
	 * 指定盤面がピースを使い切って埋まるか検証する。
	 */
	private boolean tryMatching(Board board)
			throws CloneNotSupportedException {
		if (debug)
			System.out.println("\n"
					+ ++this.matchingCounter
					+ "th tryMatching"); // debug
		Board b = null;
		Piece[] p = board.getPiece();
		// 最後のピースをはめて、盤面がうまるかどうか
		if (p.length == 1) {
			b = board.match(p[0]);
			return (b != null); // 最初に面積比較しているので、最後のピースがはまれば盤面はFull
		}
		// ピースが複数あるとき
		int baseCounter = this.matchingCounter;
		for (int i = 0; i < p.length; i++) {
			// 盤面をコピーしてピースがはまれば更新して次のピースへ
			// はまらなければそのまま次のピースへ
			b = board.match(p[i]);
			ArrayList<Piece> list = null;
			if (b != null) {
				list = new ArrayList<Piece>(
						b.getData().length);
				for (Piece piece : p) {
					list.add(piece);
				}
				list.remove(i);
				// あるピースをはめた後の盤面でピースを全てはめられる
				if (tryMatching(b.createBoardWith(list))) {
					return true;
				}
				if (debug)
					System.out.println("!back to "
							+ baseCounter); // debug
			}
		}
		if (debug)
			System.out.println("!no pieces matched("
					+ ++this.noMatchingCounter + ")");
		// boardにはまるピースがない
		return false;
	}

	/**
	 * 盤面を指定されたピースで更新する 。
	 * 
	 * @return 更新された盤面。更新がなければnullを返す。
	 */
	private Board match(Piece p) {
		Piece[] pieceRotated = p.createPiecesRotated();
		Piece source;
		String[] data = this.data;
		for (Piece pr : pieceRotated) {
			for (int y = 0; y + p.height <= this.height; y++) {
				if (!data[y].contains("0"))
					continue;
				for (int x = 0; x + p.width <= this.width; x++) {
					source = subBoard(x, y, pr.width,
							pr.height);
					if (source == null)
						continue;
					if (source.isSuitable(pr)) {
						if (detailDebug) {
							System.out
									.println("!found piece matching");
							System.out.print(pr.toString());
						}
						try {
							return update(x, y,
									source.getXORPiece(pr));
						} catch (CloneNotSupportedException e) {
							// DO NOTHING
						}
					}
				}
			}
		}
		return null;
	}

	// /**
	// * 盤面が埋まっているかどうか検証する。
	// * ※最初に空白盤面とピースの合計面積の比較しているため、不要
	// */
	// public boolean isFull() {
	// boolean isFull = true;
	// String[] data = super.getData();
	// for (String line : data) {
	// if (line.contains("0")) {
	// isFull = false;
	// break;
	// }
	// }
	// return isFull;
	// }

	/**
	 * 盤面を指定座標とピースで更新する。
	 */
	private Board update(int x, int y, Piece p)
			throws CloneNotSupportedException {
		if (detailDebug) {
			System.out.println("!seted in x=" + x + " y="
					+ y);
			System.out.println("!board");
			System.out.println(this.toString());
		}
		Board b = (Board) this.clone();
		for (int i = 0; i < p.height; i++) {
			b.getData()[y + i] = super.getData()[y + i]
					.substring(0, x)
					+ p.getData()[i]
					+ super.getData()[y + i].substring(x
							+ p.width, super.width);
		}
		if (detailDebug) {
			System.out.println("!Board update!");
			System.out.println("pieces="
					+ (b.piece.length - 1));
			System.out.println(b.toString());
			System.out.println();
		}
		return b;
	}

	/**
	 * 盤面をぴったり埋められるピースの組み合わせかどうか判定する。
	 */
	private boolean hasSameAreaPieces() {
		int emptyArea = this.width * this.height
				- this.area;
		int area = 0;
		for (Piece p : this.piece) {
			area += p.area;
		}
		return (emptyArea == area) ? true : false;
	}

	/**
	 * 盤面の一部を取得する。
	 * 
	 * @return 盤面の一部。取得できない場合はnullを返す。
	 */
	private Piece subBoard(int x, int y, int width,
			int height) {
		String[] subData = new String[height];
		if (x + width > this.width
				|| y + height > this.height)
			return null;
		for (int i = 0; i < height; i++) {
			subData[i] = super.getData()[y + i].substring(
					x, x + width);
		}
		return new Piece(subData);
	}

	/**
	 * リストを更新した盤面を生成する。
	 */
	public Board createBoardWith(ArrayList<Piece> list) {
		return new Board(this.getData(), list);
	};

	@Override
	protected Object clone()
			throws CloneNotSupportedException {
		ArrayList<Piece> list = new ArrayList<Piece>(
				this.piece.length);
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
				return ((Piece) o2).area
						- ((Piece) o1).area;
			}
		});
		this.piece = new Piece[list.size()];
		for (int i = 0; i < o.length; i++) {
			this.piece[i] = (Piece) (o[i]);
		}
	}
}

class Piece {
	// ピースデータは　0,1　で保持
	static final char NOT_EXIST = '0';
	static final char EXIST = '1';
	int id;
	int area;
	int width;
	int height;
	protected String[] data;

	public Piece(String[] dataStr) {
		this.width = dataStr[0].length();
		this.height = dataStr.length;
		this.data = new String[this.height];
		setData(dataStr);
		this.area = getArea();
	}

	public void setId(int id) {
		this.id = id;
	}

	private int getArea() {
		int area = 0;
		for (String d : this.data) {
			// TODO intだと早くなる？
			for (int i = 0; i < this.data[0].length(); i++) {
				if (d.charAt(i) == EXIST)
					area++;
			}
		}
		return area;
	}

	public String[] getData() {
		return this.data;
	}

	private void setData(String[] data) {
		for (int i = 0; i < data.length; i++) {
			this.data[i] = data[i].replace('.', NOT_EXIST)
					.replace('#', EXIST);
		}
	}

	/**
	 * 0度、90度、180度、270度回転させたピースを取得する。
	 */
	protected Piece[] createPiecesRotated() {
		Piece[] piece = new Piece[4];
		piece[0] = new Piece(this.data);
		piece[1] = piece[0].rotate90();
		piece[2] = piece[1].rotate90();
		piece[3] = piece[2].rotate90();
		return piece;
	}

	/**
	 * 90度回転させる。
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
		int row = 0;
		for (int i = 0; i < p.height; i++) {
			row = Integer.parseInt(this.data[i], 2)
					^ Integer.parseInt(p.getData()[i], 2);
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
		int row = 0;
		for (int i = 0; i < p.height; i++) {
			row = Integer.parseInt(this.data[i], 2)
					& Integer.parseInt(p.getData()[i], 2);
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
			if (Integer.parseInt(this.data[i], 2) != Integer
					.parseInt(andPiece.getData()[i], 2)) {
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