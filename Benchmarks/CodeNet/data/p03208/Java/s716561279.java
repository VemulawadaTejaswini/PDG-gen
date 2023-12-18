import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力
		int N = sc.nextInt();                
		int K = sc.nextInt();

		Integer[] h = new Integer[N];
		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}
		Integer[] m = new Integer[N-1];
        Arrays.sort(h);
		for (int i = 0; i < N-1; i++) {
			m[i] = h[i+1] - h[i];
		}
		// 答えを出力
        int ans = 0;
        int sum = 0;
        boolean first = true;
        Arrays.sort(m);
		for (int i = 0; i < N-K; i++) {
          sum = m[i+K-1] - m[i];
          if (first || sum < ans) {
            ans = sum;
            first = false;
          } 
		}
		System.out.println(ans);
	}
}
