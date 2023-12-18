import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		int a = A[0];
		for(long i=1; i<K; i++) {
			a = A[a-1];
		}
		System.out.println(a);

	}

}