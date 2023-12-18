import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h= sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		Point [] p=  new Point[n];
		HashMap<Point, Integer> map = new HashMap<Point, Integer>();
		for(int i=0;i<n;i++) {
			int a= sc.nextInt()-1;
			int b = sc.nextInt()-1;
			p[i] = new Point(a,b);
			for(int x=a-1;x<=a+1;x++) {
				for(int y=b-1;y<=b+1;y++) {
					if(x>=1 && x<(h-1) && y>=1 && y<(w-1))
					map.put(new Point(x,y),map.getOrDefault(new Point(x,y),0)+1);
				}
			}
		}
		long ret[] = new long[10];
		long tot =0;
		for(Point key : map.keySet()) {
//			System.out.println(map.get(key) + " " + key.a + " " + key.b);
			ret[map.get(key)]++;
			tot++;
		}
		StringBuilder sb = new StringBuilder();
		ret[0] = (long) (h-2)*(w-2)-tot;

		for(int i=0;i<10;i++) {
			sb.append(ret[i]);
			sb.append("\n");
			
		}
		System.out.println(sb.toString());
		
	}
	static class Point{
		int a;
		int b;
		public Point(int a,int b) {
			this.a = a;
			this.b = b;
		}
		@Override
		public int hashCode() {
			return 1297273*a+1299827*b;
		}
		@Override
		public boolean equals(Object o) {
			Point c = (Point)o;
			return (c.a==a && c.b==b);
		}
	}

}
