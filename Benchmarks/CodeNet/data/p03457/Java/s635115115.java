import java.util.Scanner;

/**
 * http://abc086.contest.atcoder.jp/tasks/abc086_c
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Point[] points = new Point[N+1];
		points[0] = new Point(0, 0, 0);
		for(int i=1; i<=N; i++){
			points[i] = new Point(sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		sc.close();
		
		String ans = "Yes";
		for(int i=1; i<=N; i++){
			Point p1 = points[i-1];
			Point p2 = points[i];
			int d = Math.abs(p1.x-p2.x)+Math.abs(p1.y-p2.y);
			int t = p2.t-p1.t;
			if(d<=t && d%2==t%2) continue;
			ans = "No";
			break;
		}
		
		System.out.println(ans);
		

	}
	
	static class Point{
		int x;
		int y;
		int t;
		Point(int t, int x, int y){
			this.t = t;
			this.x = x;
			this.y = y;
		}
	}

}