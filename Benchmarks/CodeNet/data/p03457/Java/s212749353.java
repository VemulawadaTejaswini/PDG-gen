import java.util.*;
import static java.lang.System.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C(sc);
	}
	
	public static void A(Scanner sc) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		if((a*b)%2==1) out.println("Odd");
		else out.println("Even");
	}
	
	public static void B(Scanner sc) {
		String s1 = sc.next();
		String s2 = sc.next();
		int x = Integer.parseInt(s1+s2);
		for(int i=0;Math.pow(i,2)<=x;i++) {
			if(Math.pow(i, 2)==x) {
				out.println("Yes");
				return;
			}
		}
		out.println("No");
	}
	
	public static void C(Scanner sc) {
		int N = sc.nextInt();
		Point[] lis = new Point[N+1];
		lis[0] = new Point(0,0,0);
		for(int i=1;i<=N;i++) lis[i]=new Point(sc.nextInt(),sc.nextInt(),sc.nextInt());
		Arrays.sort(lis, new Comparator<Point>() {
			public int compare(Point d1, Point d2) {
				return d1.t-d2.t;
			}
		});
		for(int i=0;i<N;i++) {
			if((lis[i+1].t-lis[i].t-Math.abs(lis[i].x-lis[i+1].x)-Math.abs(lis[i].y-lis[i+1].y))%2==1 ||
					(lis[i+1].t-lis[i].t-Math.abs(lis[i].x-lis[i+1].x)-Math.abs(lis[i].y-lis[i+1].y))<0) {
				out.println("No");
				return;
			}
		}
		out.println("Yes");
	}
	
	public static class Point{
		int t;
		int x;
		int y;
		public Point(int t, int x, int y) {
			this.t = t;
			this.x = x;
			this.y = y;
		}
	}
}
