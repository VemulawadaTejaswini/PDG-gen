import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int[N];
		for (int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		int res = X;
		for (int j=0; j<N; j++) {
			for (int i=1; i<=D; i++) {
				if ((i-1)%A[j] == 0) {
					res++;
				}
			}
		}
		System.out.println(res);
	}
}
