import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		double[] arr = new double[N];
		Arrays.setAll(arr, i -> Double.parseDouble(sc.next()));

		double ans = 0;
		for(double a : arr) {
			ans += 1/a;
		}
		System.out.println(1/ans);
	}
}