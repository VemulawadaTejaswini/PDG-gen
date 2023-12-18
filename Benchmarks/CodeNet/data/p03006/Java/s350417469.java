import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N==1) {
			System.out.println(1);
			return ;
		}
		Main main = new Main();
		long x[]= new long[N];
		long y[] = new long[N];
		for (int i=0;i<N;i++) {
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
		}
		int max =1;
		Map<Point,Integer> map = new HashMap<Point,Integer>();
		for (int i=0;i<N;i++) {
			for (int j=i+1;j<N;j++) {
				if (i!=j) {
					Point t = main.new Point();
					t.p=Math.abs(x[j]-x[i]);
					t.q=Math.abs(y[j]-y[i]);
					if (map.containsKey(t)==false) {
						map.put(t, 1);
					} else {
						Integer in = map.get(t);
						map.put(t, in+1);
						if (in +1>max) {
							max = in +1;
						}
					}
				}

			}
		}
		System.out.println(N-max);
	}

	public class Point extends Object{
		long p;
		long q;

		@Override
		public boolean equals(Object o) {
			Point p = (Point)o;
			if (p.p==this.p&&p.q==this.q) {
				return true;
			}
			return false;
		}

		@Override
		public int hashCode() {
			return (int)(this.p%1000000+this.q%1000000);
		}

	}

}