import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H = sc.nextInt();
		int[] B = new int[N];
		int Amax = 0, ans = 0;
		for(int i = 0; i < N; i++) {
			int A = sc.nextInt();
			Amax = Math.max(Amax, A);
			B[i] = sc.nextInt();
		}
		Arrays.sort(B);
		for(int i = N-1; i >= 0; i--) {
			if(B[i] < Amax)
				break;
			H -= B[i];
			ans++;
			if(H < 0) {
				System.out.println(ans);
				return;
			}
		}
		System.out.println(ans + (H + Amax - 1) / Amax);
	}

}