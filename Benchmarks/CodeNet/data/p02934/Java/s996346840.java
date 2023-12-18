import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N];
		double total = 0.0;

		for (int i = 0; i < A.length; i++) {
			A[i] = scan.nextInt();

		}


		for(int i = 0; i<N; i++) {
			total += (double)1/A[i];
		}

		System.out.println(1/total);

	}




}
