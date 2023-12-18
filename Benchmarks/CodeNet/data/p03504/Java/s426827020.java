import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		int[] s = new int[N], t = new int[N], c = new int[N];
		int sm[] = new int[200002], tt[] = new int[200002];

		for(int i = 0; i < N; i++) {
			s[i] = sc.nextInt();
			t[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}

		for(int i = 1; i <= C; i++) {//チャンネル数だけ回す
			//	i = チャンネル番号
			Arrays.fill(tt, 0);//初期化
			//以下imos法
			for(int j = 0; j < N; j++) {
				if(c[j]==i) {//チャンネル番号が同じ
					tt[s[j]*2-1]++;
					tt[t[j]*2]--;
				}
			}
			for(int j = 1; j < 200002; j++) {
				tt[j]+=tt[j-1];
			}
			//imos終了
			for(int j = 0; j < 200002; j++) {
				if(tt[j] > 0) {
					sm[j]++;
				}
			}
		}

		int max = 0;
		for(int j = 0; j < sm.length; j++) {
			if(max < sm[j]) {
				max = sm[j];
			}
		}
		System.out.println(max);
	}
}