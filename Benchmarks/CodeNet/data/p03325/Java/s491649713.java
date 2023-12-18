import java.util.Scanner;

public class Main {
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int[] A = new int[N];
		
		
		int count = 0;
		for (int i = 0; i < N; i ++) {
			A[i] = sc.nextInt();
			while (A[i] % 2 == 0) {
				count++;
				A[i] /= 2;
			}
		}
		System.out.println(count);
	}
}
jflkdasj
