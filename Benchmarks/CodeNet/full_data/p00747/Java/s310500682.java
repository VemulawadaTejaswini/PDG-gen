import java.util.*;

public class Main {
	static int h;
	static int w;
	static Masu[][] masu;

	static int min;
	static LinkedList<Masu> queue=new LinkedList<Masu>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String rts = sc.nextLine();
			String[] rtssp = rts.split("\\s+");
			w = Integer.parseInt(rtssp[0]);
			h = Integer.parseInt(rtssp[1]);
			if (w == 0 && h == 0) break;

			masu = new Masu[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					masu[i][j] = new Masu(i, j);
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

			masu[herei][herej].my=1;
			int x=0;
			int y=0;
			queue.offer(masu[x][y]);
			while(!queue.isEmpty()){
				Masu sub=queue.poll();
		//		System.out.println(sub.tate+" "+sub.yoko);
			//	sub.pass=true;
				for(Masu e:sub.list){
					if(!e.pass){
						if(e.my>sub.my+1)e.my=sub.my+1;	
						e.pass=true;
						queue.offer(e);			
					}
				}	
			}	
	
			if(masu[h-1][w-1].my==10000)System.out.println("0");
			else System.out.println(masu[h-1][w-1].my);
		
		}
	}
}
class Masu {
	int t;
	int r;
	int l;
	int u;
	int tate;
	int yoko;
	int my=10000;
	boolean pass;
	ArrayList<Masu> list=new ArrayList<Masu>();
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
		if (this.r == 1) list.add(map[tate][yoko + 1]);
		if (this.u == 1) list.add(map[tate + 1][yoko]);
		if (this.t == 1) list.add(map[tate - 1][yoko]);
		if (this.l == 1) list.add(map[tate][yoko - 1]);

	}
	
}