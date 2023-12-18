import java.util.*;
import static java.lang.System.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		D(sc);
	}
	
	public static void A(Scanner sc) {
		int N = sc.nextInt();
		int A = sc.nextInt();
		if(N%500 <=A) out.println("Yes");
		else out.println("No");
	}
	
	public static void B(Scanner sc) {
		int N = sc.nextInt();
		int ret = 0;
		Integer[] a = new Integer[N];
		for(int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a,Collections.reverseOrder());
		for(int i=0;i<N;i++) {
			if(i%2==0) ret+=a[i];
			else ret-=a[i];
		}
		out.println(ret);
	}
	
	public static void C(Scanner sc) {
		int[][] c = new int[4][4];
		for(int i=1;i<4;i++) {
			for(int j=1;j<4;j++) {
				c[i][j] = sc.nextInt();
			}
		}
		if(c[1][1]-c[1][2]==c[2][1]-c[2][2] && c[2][1]-c[2][2]==c[3][1]-c[3][2] &&
				c[1][2]-c[1][3]==c[2][2]-c[2][3] && c[2][2]-c[2][3]==c[3][2]-c[3][3] &&
				c[1][1]-c[1][3]==c[2][1]-c[2][3] && c[2][1]-c[2][3]==c[3][1]-c[3][3]) out.println("Yes");
		else out.println("No");
	}
	
	public static void D(Scanner sc) {
		int h = sc.nextInt();
		int w = sc.nextInt();
		boolean cango[][] = new boolean[h][w];
		int firstblack = 0;
		for(int i=0;i<h;i++) {
			String s = sc.next();
			for(int j=0;j<w;j++) {
				if(s.charAt(j)=='.') cango[i][j]=true;
				else firstblack++;
			}
		}
		int dist = mindist(cango);
		if(dist<0) {
			out.println(dist);
			return;
		}
		out.println(h*w - (dist+1) - firstblack);
	}
	
	// 最短距離を返す cango:通ることができる   到達できない場合は、-1を返す
	public static int mindist(boolean[][] cango) {
		int h = cango.length;
		int w = cango[0].length;
		
		Point start = new Point(0,0,0);
		start.passlength = 0;
		
		boolean[][] visit = new boolean[h][w];
		visit[0][0] = true;
		
		LinkedList<Point>  que = new LinkedList<Point>();
		que.add(start);
		
		while(!que.isEmpty()) {
			Point p = que.removeFirst();
			for(Point np : p.makeneigh(h, w, visit, cango)) {
				if(np.i==h-1 && np.j==w-1) return np.passlength;
				visit[np.i][np.j] = true;
				que.add(np);
			}
		}
		return -1;
	}
	
	public static class Point{
		int i;
		int j;
		int passlength;
		
		public Point(int i, int j, int pl) {
			this.i = i;
			this.j = j;
			this.passlength = pl;
		}
		// Pointの周囲４マスについて、存在して、unvisitかつcangoなら作成して返す。
		public ArrayList<Point> makeneigh(int h, int w, boolean[][] visit, boolean[][] cango){
			ArrayList<Point> ret = new ArrayList<Point>();
			if(i-1>=0 && !visit[i-1][j] && cango[i-1][j]) ret.add(new Point(i-1,j,passlength+1));
			if(i+1<h && !visit[i+1][j] && cango[i+1][j]) ret.add(new Point(i+1,j,passlength+1));
			if(j-1>=0 && !visit[i][j-1] && cango[i][j-1]) ret.add(new Point(i,j-1,passlength+1));
			if(j+1<w && !visit[i][j+1] && cango[i][j+1]) ret.add(new Point(i,j+1,passlength+1));
			return ret;
		}

	}
}
