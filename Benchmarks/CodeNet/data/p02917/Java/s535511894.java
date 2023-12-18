import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N-1];
		for (int i=0;i<N-1;i++) {
			A[i] = sc.nextInt();
		}
		int sum =A[0];
		for (int i=0;i<N-2;i++) {
			if (A[i]>A[i+1]) {
				sum +=A[i+1];
			} else {
				sum +=A[i];
			}
		}
		sum +=A[N-2];
		System.out.println(sum);
	}
}