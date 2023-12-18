
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		double[] a = new double[n];
		double sum = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextDouble();
			sum += a[i];
		}
		int ans = 0;
		for(int i = 0; i < n; i++) {
			if(sum / (4 * m) <= a[i])
				ans++;
		}
		System.out.println(ans >= m ? "Yes" : "No");

	}

}
