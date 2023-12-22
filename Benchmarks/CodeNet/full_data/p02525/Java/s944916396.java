import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if (n == 0) break;
			int scr[];
			scr = new int[n];
			for (int i = 0; i < n; i++) {
				scr[i] = sc.nextInt();
			}
			double ave = calcAve (n, scr);
			double dev = Math.sqrt( calcDev(n,scr,ave) );
			System.out.println( dev );
		}
	}

	public static double calcAve(int n, int scr[]) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += scr[i];
		}
		return (double) sum / n;
	}

	public static double calcDev(int n, int scr[], double ave) {
		double var = 0;
		for (int i = 0; i < n; i++) {
			var += Math.pow( (scr[i] - ave), 2 );
		}
		return (double) var / n;
	}
}