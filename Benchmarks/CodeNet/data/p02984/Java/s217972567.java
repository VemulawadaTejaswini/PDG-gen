import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		B[0] = A[0] - A[N - 1];
		for(int i = 1; i < N; i++) {
			B[i] = A[i] - A[i - 1];
		}
		
		int next = 0;
		for(int i = 0; i < N - 2; i += 2) {
			next += B[i + 2] - B[i];
		}
		
		int b0 = 0;
		int b1 = 0;
		if(next > 0) {
			b1 = next;
		} else {
			b0 = next;
		}
		//System.out.println(b0);
		//System.out.println(b1);
		for(int i = 0; i < 2 * A[0]; b0 += 2, b1 += 2) {
			if(b0 / 2 + b1 / 2 == A[0]) {
				break;
			}
		}
		int b[] = new int[N];
		b[0] = b0;
		b[1] = b1;
		for(int i = 2; i < N; i++) {
			b[i] = (A[i - 1] - b[i - 1] / 2) * 2;
		}
		for(int i = 0; i < N - 1; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println(b[N - 1]);
	}
}
