import java.util.Scanner;

public class Main {
	static int[] T, A;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		T = new int[N];
		A = new int[N];
		for(int i=0; i<N;i++) {
			T[i] = scanner.nextInt();
			A[i] = scanner.nextInt();
		}
		long t = T[0];
		long a = A[0];

		for(int i=1; i<N;i++) {
			long nt = t/T[i];
			long na = a/A[i];
			if(t%T[i]!=0) nt++;
			if(a%A[i]!=0) na++;

			if(nt>na) {
				t = nt * T[i];
				a = nt * A[i];
			}
			else {
				t = na * T[i];
				a = na * A[i];
			}
		}
		System.out.println(t+a);
		scanner.close();
	}
}
