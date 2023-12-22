import java.util.Scanner;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();
 
	public static void main(String[] args) {
 
		double A = in.nextInt();
		double B = in.nextInt();
		double H = in.nextInt();
		double M = in.nextInt();

		double mS = 360.0 / 60 * M;
		double hS = (360.0 / 12 * H) + (360.0 / 12 / 60 * M);

		hS = s(hS);
		mS = s(mS);

		hS = Math.toRadians(hS);
		mS = Math.toRadians(mS);

		double answer = Math.sqrt(
				Math.pow(B*Math.cos(mS) - A*Math.cos(hS),2) +
				Math.pow(B*Math.sin(mS) - A*Math.sin(hS), 2)
				);


		System.out.println(answer);
 
	}

	public static double s(double d) {
		if(d <= 90) {
			return 90 - d;
		}else {
			return 90 + 360 - d;
		}
	}
 
	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}