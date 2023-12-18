import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0;i < N;i++) {
			A[i] = sc.nextInt();
		}
		sc.close();

		int[] S = new int[N+1];
		S[0] = 0;
		for(int i = 1;i <= N;i++) {
			S[i] = S[i-1] + A[i-1];
		}
		Arrays.sort(S);
		int cnt = 1;
		int res = 0;
		int prev = S[0];
		for(int i = 1;i <=N;i++) {
			if(prev == S[i]) {
				cnt++;
			}else {
				prev = S[i];
				res += cnt * (cnt - 1) / 2;
				cnt = 1;
			}
		}
		res += cnt * (cnt - 1) / 2;
		System.out.println(res);
	}
}