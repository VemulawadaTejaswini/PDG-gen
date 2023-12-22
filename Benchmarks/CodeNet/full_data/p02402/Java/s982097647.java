import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long sum = 0;
		int[] x = new int[N];

		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}
		int max = x[0];
		int min = x[0];

		for (int i = 0; i < N; i++) {

			if (max < x[i]) {
				max = x[i];
			}

			if (min > x[i]) {
				min = x[i];
			}

			sum = sum + x[i];
		}
		System.out.println(min + " " + max + " " + sum);
	}
}