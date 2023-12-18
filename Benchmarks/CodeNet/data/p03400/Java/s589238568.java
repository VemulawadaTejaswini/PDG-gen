import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double D = sc.nextInt();
		double X = sc.nextInt();
		int[] A = new int[N];
		int count = 0;
		count += X;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			System.out.println(count);
			count += Math.ceil(D / A[i]);
		}
		
		System.out.println(count);
	}

}