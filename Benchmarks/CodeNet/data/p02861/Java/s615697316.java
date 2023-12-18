import java.util.Scanner;
public class Main {
	public static int N;
	public static int[] x;
	public static int[] y;
	public static double distance;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.next());
		x = new int[N];
		y = new int[N];
		for (int i = 0;i < N ;i++ ) {
				x[i] = Integer.parseInt(scan.next());
				y[i] = Integer.parseInt(scan.next());
		}
		System.out.println(sumdistance());
	}

	private static double sumdistance() {
		distance = 0;
		double ans = 0;

		for (int i = 0;i < N ;i++ ) {
			for (int j = i + 1;j < N ;j++ ) {
				 double X = Math.pow(x[i] - x[j],2);
				 double Y = Math.pow(y[i] - y[j],2);
				 distance += Math.sqrt(X + Y);
			}
		}
		ans = distance*2/N;

		return ans;
	}

}
