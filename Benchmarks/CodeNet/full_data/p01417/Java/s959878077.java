import java.util.*;
public class Main { 
	static ArrayList<Data> list = new ArrayList<Data>();
	static int n;
	static int q;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		 n = stdIn.nextInt();
		 q = stdIn.nextInt();
		for(int i = 0; i < n; i++) {
			double a = stdIn.nextDouble();
			double b = stdIn.nextDouble();
			double c = stdIn.nextDouble();
			list.add(new Data(a,b,c));
		}
		double ans = solv(0,0,new ArrayList<Data>());
		System.out.println(ans);
	}
	public static double solv(int a, int b, ArrayList<Data> c) {
		if(b == q) {
			double data = 0;
			for(int i = 0; i < q; i++) {
				for(int j = i+1; j < q; j++) {
					Data ad = c.get(i);
					Data bd = c.get(j);
					data += (bd.x-ad.x)*(bd.x-ad.x) + (bd.y-ad.y)*(bd.y-ad.y) + (bd.z-ad.z)*(bd.z-ad.z);
				}
			}
			return data;
		}
		if(a == n) return 0.0;
		double ret = 0.0;
		ArrayList<Data> b1 = new ArrayList<Data>();
		ArrayList<Data> b2 = new ArrayList<Data>();
		b1.addAll(c);
		b1.add(list.get(a));
		b2.addAll(c);
		double a1 = solv(a+1,b+1,b1);
		double a2 = solv(a+1,b,b2);
		
		return((a1 > a2)?a1:a2);
	}
}

class Data {
	double x;
	double y;
	double z;
	Data(double a, double b, double c) {
		x = a;
		y = b;
		z = c;
	}
}

	