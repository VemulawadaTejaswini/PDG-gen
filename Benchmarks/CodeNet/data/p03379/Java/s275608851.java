import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] X = new int[n];
		int[] x = new int[n];
		int l = 0; int r = 0;

		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			X[i] = x[i];
		}

		Arrays.parallelSort(x);
		l = x[n/2-1]; r = x[n/2];

		for(int i = 0; i < n; i++) {
			if(X[i] <= l) System.out.println(r);
			else System.out.println(l);
		}

		sc.close();
	}
}