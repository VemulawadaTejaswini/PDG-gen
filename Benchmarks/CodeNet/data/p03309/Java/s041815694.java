import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		long ave = 0;

		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
			A[i] -= i+1;
			ave += A[i];
		}ave /= N;

		int ans1 = 0;
		int ans2 = 0;
		int ans3 = 0;

		for(int j=0; j<N; j++) {
			ans1 += Math.abs(A[j] - ave);
			ans2 += Math.abs(A[j] - ave - 1);
			ans3 += Math.abs(A[j] - ave + 1);
		}

		System.out.println(Math.min(ans3, Math.min(ans1, ans2)));

	}

}
