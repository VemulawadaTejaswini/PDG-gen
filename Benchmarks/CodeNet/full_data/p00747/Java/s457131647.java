
import java.util.*;

public class Main {
	static int h;
	static int w;
	static Masu[][] masu;
//	static int[][] map;
	//static int count = 0;
	static int min;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {
			String rts = sc.nextLine();
			String[] rtssp = rts.split("\\s+");
			w = Integer.parseInt(rtssp[0]);
			h = Integer.parseInt(rtssp[1]);
			if (w == 0 && h == 0) break;

			masu = new Masu[h][w];
	//		map = new int[h][w];

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					masu[i][j] = new Masu(i, j);
	//				map[i][j] = 10000;
				}
			}

			for (int i = 0; i < h; i++) {
				String str = sc.nextLine();
				String[] strsp = str.split("\\s+");
				for (int j = 0; j < w - 1; j++) {
					if (strsp[j + 1].equals("0")) {

						masu[i][j].r = 1;
						masu[i][j + 1].l = 1;
					}
				}
				if (i != h - 1) {
					String str2 = sc.nextLine();
					String[] strsp2 = str2.split("\\s+");

					for (int j = 0; j < w; j++) {
						if (strsp2[j].equals("0")) {

							masu[i][j].u = 1;
							if (i + 1 != h) masu[i + 1][j].t = 1;
						}
					}
				}
			}

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++)
					masu[i][j].setarround(masu);
			}

			int herei = 0;
			int herej = 0;
//			count = 1;
//			min = 10000;
//			masu[herei][herej].pass = true;
	//		map[herei][herej]=1;
			masu[herei][herej].my=1;
			// if (rec(herei, herej,1) != 0) System.out.println("0");
			rec(herei, herej);
			if(masu[h-1][w-1].my==10000)System.out.println("0");
			else System.out.println(masu[h-1][w-1].my);
			
/*			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					System.out.print(" "+masu[i][j].my+" ");
				}
				System.out.println();
			}
			*/
		}
	}
	public static int rec(int x,int y){
		masu[x][y].pass=true;
		for(Masu e:masu[x][y].list){
			if(e.my>masu[x][y].my+1){
				e.my=masu[x][y].my+1;
			}
		}
		for(Masu e:masu[x][y].list){
			if(!e.pass)rec(e.tate,e.yoko);
		}		
		return 0;
	}

}
class Masu{
	int t;
	int r;
	int l;
	int u;
	int tate;
	int yoko;
	int my=10000;
	int expect = 0;
	boolean pass;
	ArrayList<Masu> list=new ArrayList<Masu>();
//	PriorityQueue<Masu> queue = new PriorityQueue<Masu>();
//	PriorityQueue<Masu> queue2 = new PriorityQueue<Masu>();

	public Masu(int tt, int yy) {
		t = -1;
		r = -1;
		l = -1;
		u = -1;
		tate = tt;
		yoko = yy;
		pass = false;
	}

	public void setarround(Masu[][] map){
		if (this.t == 1) list.add(map[tate - 1][yoko]);
		if (this.r == 1) list.add(map[tate][yoko + 1]);
		if (this.l == 1) list.add(map[tate][yoko - 1]);
		if (this.u == 1) list.add(map[tate + 1][yoko]);
	}
}