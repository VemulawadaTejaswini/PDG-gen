import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		new Main(new Scanner(System.in), System.out, System.err).exec();
	}
	public final Scanner sc;
	public final PrintStream out, err;
	public Main(final Scanner sc, final PrintStream out, final PrintStream err) {
		this.sc = sc;this.out = out;this.err = err;
	}
	static public final long pair(int a, int b) {return (((long)a) << 32) + b;}
	static public final int getPair1(long v) {return (int)(v >> 32);}
	static public final int getPari2(long v) {return (int)(v & 0xFFFFFFFF);}

	static public final long quad(long a, long b, long c, long d) {
		return ((a&0xFFFF)<< 48) + ((b&0xFFFF)<< 32) + ((c&0xFFFF)<< 16) +(d&0xFFFF);}
	static public final int getQuad1(long v) {return (int)( v >> 48          );}
	static public final int getQuad2(long v) {return (int)((v >> 32) & 0xFFFF);}
	static public final int getQuad3(long v) {return (int)((v >> 16) & 0xFFFF);}
	static public final int getQuad4(long v) {return (int)( v        & 0xFFFF);}

	static public final long record(int e, int m, int i) {
		return quad(-1, e, m, i);
	}
	static public final int re(long record) {
		return getQuad2(record);
	}
	static public final int rm(long record) {
		return getQuad3(record);
	}
	static public final int ri(long record) {
		return getQuad4(record);
	}

	//------------------------------------------

	private int p;
	private int[] inv;
	private int[] fact;
	private int[] finv;
	public final int mod(long v) {
		v %= p;
		return (int)(v < 0 ? v+p : v);
	}
	public final int mul(long a, long b) {
		return mod(a*b);
	}
	public final void initFact(double limit, double p) {
		initFact((int)limit, (int)p);
	}
	public final void initFact(int limit, int p) {
		this.p = p;
		this.inv = new int[limit+1];
		this.fact = new int[limit+1];
		this.finv = new int[limit+1];
		fact[1] = finv[1] = inv[0] = inv[1] = 1;
		for(int i=2;i<=limit;i++) {
			int a = p / i;
			int b = p % i;
			inv[i]  = mul(-a, inv[b]);
			fact[i] = mul(fact[i-1], i);
			finv[i] = mul(finv[i-1], inv[i]);
		}
	}
	public final int comb(int m, int n) {
		return mul(mul(fact[m], finv[n]), finv[m-n]);
	}
	//------------------------------------------
	static long lcm (long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (long)(c/b);
	}

	//------------------------------------------


	class Cell{
		int w;
		int h;
		boolean road;
		int cost;
	}

	public void exec() throws Exception{

		int w = 0;
		int h = 0;
		final int H = sc.nextInt();
		final int W = sc.nextInt();
		final Cell[][] maze = new Cell[H][W];
		for(int i=0;i<H;i++) {
			final String S = sc.next();
			for(int j=0;j<W;j++) {
				maze[i][j]=new Cell();
				maze[i][j].road = (S.charAt(j)=='.');
				maze[i][j].h = i;
				maze[i][j].w = j;
				if(maze[i][j].road) {
					h = i;
					w = j;
				}
			}
		}

		LinkedList<Cell> temp = new LinkedList<>();
		LinkedList<Cell> edge = new LinkedList<>();

		initCost(maze, H, W);
		maze[h][w].cost = 0;
		temp.add(maze[h][w]);
		calcCost(maze, H, W, temp);


		final int maxCost = searchMaxCost(maze, H, W);
		searchMaxCostCell(maze, H, W, maxCost, edge);

		int totalMaxCost = 0;
		while(!edge.isEmpty()) {
			Cell c = edge.remove();
			initCost(maze, H, W);
			c.cost=0;
			temp.add(c);
			calcCost(maze, H, W, temp);
			final int maxCost2 = searchMaxCost(maze, H, W);
			totalMaxCost = Math.max(totalMaxCost, maxCost2);
		}

		out.println(totalMaxCost);
	}

	public void initCost(Cell[][] maze, int H, int W) {
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				maze[i][j].cost = Integer.MAX_VALUE;
			}
		}
	}
	public void calcCost(Cell[][] maze, int H, int W, LinkedList<Cell> temp) {
		while(!temp.isEmpty()) {
			Cell cell = temp.remove();
			update(maze, cell.h, cell.w-1, cell.cost+1, H, W, temp);
			update(maze, cell.h, cell.w+1, cell.cost+1, H, W, temp);
			update(maze, cell.h-1, cell.w, cell.cost+1, H, W, temp);
			update(maze, cell.h+1, cell.w, cell.cost+1, H, W, temp);
		}
	}
	public static int searchMaxCost(Cell[][] maze, int H, int W) {
		int maxCost = 0;
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if(maze[i][j].road) {
					maxCost = Math.max(maze[i][j].cost, maxCost);
				}
			}
		}
		return maxCost;
	}
	public static void searchMaxCostCell(Cell[][] maze, int H, int W, int cost, LinkedList<Cell> edge) {
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if(maze[i][j].cost == cost) {
					edge.add(maze[i][j]);
				}
			}
		}
	}
	public void update(Cell[][] maze, int h, int w, int cost, int H, int W, LinkedList<Cell> temp) {
		// 場外または壁
		if(h<0 || w<0 || w>=W || h >=H || !maze[h][w].road) {
			return;
		}
;		//より近道があったので数値更新
		if(	maze[h][w].cost > cost) {
			maze[h][w].cost = cost;
			temp.add(maze[h][w]);
		}
		// 更新しない場合は何もしない。
	}
}
