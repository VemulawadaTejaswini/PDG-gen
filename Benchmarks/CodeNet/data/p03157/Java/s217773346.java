import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

	private static final char BLACK = '#';
	private static final char WHITE = '.';

	private int H;
	private int W;

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		sc.nextLine();
		Cell[][] board = new Cell[H][W];
		ArrayList<Cell> blacks = new ArrayList<>();
		ArrayList<Cell> whites = new ArrayList<>();
		UFCell uf = new UFCell();

		for (int i = 0; i < H; i++) {
			String line = sc.nextLine();
			for (int j = 0; j < W; j++) {
				char c = line.charAt(j);
				Cell cell;
				switch (c) {
				case BLACK:
					cell = new Cell(i, j, BLACK);
					board[i][j] = cell;
					blacks.add(cell);
					uf.add(cell);
					break;
				case WHITE:
					cell = new Cell(i, j, WHITE);
					board[i][j] = cell;
					whites.add(cell);
					uf.add(cell);
					break;
				default:
					throw new IllegalArgumentException();
				}
			}
		}
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				Cell c = board[i][j];
				if (i > 0 && c.Color != board[i - 1][j].Color) {
					uf.union(c, board[i - 1][j]);
				}
				if (j > 0 && c.Color != board[i][j - 1].Color) {
					uf.union(c, board[i][j - 1]);
				}
				if (i < H - 1 && c.Color != board[i + 1][j].Color) {
					uf.union(c, board[i + 1][j]);
				}
				if (j < W - 1 && c.Color != board[i][j + 1].Color) {
					uf.union(c, board[i][j + 1]);
				}
			}
		}

		int cnt = 0;
		for (Cell b : blacks) {
			for (Cell w : whites) {
				if (uf.find(b, w)) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		sc.close();
	}

	class Cell {
		public final int id;
		public final char Color;
		public final int x;
		public final int y;

		public Cell(int x, int y, char color) {
			this.x = x;
			this.y = y;
			this.Color = color;
			this.id = H * y + x;
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			if (obj instanceof Cell) {
				Cell that = (Cell) obj;
				return (this.x == that.x) && (this.y == that.y);
			} else {
				return false;
			}
		}

		@Override
		public int hashCode() {
			return Objects.hash(this.x, this.y);
		}

	}

	class UFCell {
		private int parents[] = new int[H * W];

		public void add(Cell c) {
			parents[c.id] = c.id;
		}

		private int rootID(int cid) {
			if (parents[cid] == cid) {
				return cid;
			} else {
				int pid = parents[cid];
				int root = rootID(pid);
				parents[cid] = root;
				return root;
			}
		}

		public void union(Cell c1, Cell c2) {
			int r1 = rootID(c1.id);
			int r2 = rootID(c2.id);
			if (r1 == r2) {
				return;
			} else {
				parents[r1] = r2;
			}
		}

		public boolean find(Cell c1, Cell c2) {
			return rootID(c1.id) == rootID(c2.id);
		}
	}

}
