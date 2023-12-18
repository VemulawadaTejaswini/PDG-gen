

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] X = new int[N];
		for(int i=0; i<N; i++) {
			X[i] = scan.nextInt();
		}
		scan.close();

		Arrays.sort(X);

		int sum = 0;
		for(int i=0; i<X.length-1; i++) {
			sum+=X[i];
		}
		sum+=X[X.length-1]/2;
		System.out.println(sum);
	}
}
