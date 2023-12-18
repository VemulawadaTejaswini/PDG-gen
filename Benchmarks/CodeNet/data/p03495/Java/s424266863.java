
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int cnt[] = new int[N+1];
		for(int i=0; i<N; i++) {
			int v = sc.nextInt();
			cnt[v]++;
		}
		Arrays.sort(cnt);
		int kcnt = 0;
		for(int i=0; i<K; i++) {
			kcnt += cnt[N-i];
		}
		int ans = N-kcnt;
		System.out.println(ans);
		sc.close();
	}
}
