import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = 0;
		}
		for (int i = 0; i < A.length - 1; i++) {
			A[sc.nextInt() - 1]++;
		}
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	}

}
