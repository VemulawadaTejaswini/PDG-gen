import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int[N];
		for (int i=0;i<M;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			A[a-1]++;
			A[b-1]++;
		}
		for (int i =0;i<N;i++) {
			System.out.println(A[i]);
		}
	}
}