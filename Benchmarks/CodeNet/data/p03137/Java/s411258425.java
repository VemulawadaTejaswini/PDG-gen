import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] x = new int[m];
		for(int i = 0; i < m; i ++) {
			x[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(x);
		int[] y = new int[m-1];
		for(int i = 0; i < m-1; i ++) {
			y[i] = x[i + 1] - x[i];
		}
		Arrays.sort(y);
		int sum = 0;
		for(int i = 0; i < m-n; i ++) {
			sum += y[i];
		}
		System.out.println(sum);
	}
}
