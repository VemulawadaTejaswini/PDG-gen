import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		Arrays.setAll(A, i -> sc.nextInt());
		Arrays.sort(A);
		boolean[] t = new boolean[1000001];
		for(int i = 1; i < N; i++)
			if(A[i] == A[i-1])
				t[A[i]] = true;
		int ans = 0;
		for(int i = 0; i < N; i++) {
			if(!t[A[i]]) {
				ans++;
				for(int j = A[i]; j < 1000001; j+=A[i])
						t[j] = true;
			}
		}
		System.out.println(ans);
	}

}