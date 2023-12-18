import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char[] s = scn.nextLine().toCharArray();
		char[] t = scn.nextLine().toCharArray();
		int N = s.length;
		boolean[] se = new boolean[26], te = new boolean[26];
		for(int i = 0;i < s.length;i++) {
			int a = 'a';
			se[s[i]-a] = true;
		}
		for(int i = 0;i < t.length;i++) {
			int a = 'a';
			te[t[i]-a] = true;
		}
		boolean can = true;
		for(int i = 0;i < 26;i++) {
			can = se[i] || !te[i];
			if(!can)break;
		}

		long[][] next = new long[N][26];

		if(can) {

			for(int i = 0;i < 26;i++) {
				int now = 'a'+i;
				int count = 0;
				boolean first = false;
				for(int j = 0;j < N;j++) {
					if(s[j] == now) {
						if(j == 0) {
							first = true;
							count++;
							continue;
						}else {
							for(int k = j-count;k < j;k++) {
								next[k][i] = j-k;
							}
							count=1;
						}
					}else {
						count++;
					}
				}
				if(first) {
					for(int k = N-count;k < N;k++) {
						next[k][i] = N-k;
					}
				}else {
					for(int k = N-count;k < N;k++) {
						next[k][i] = N-k+next[0][i];
					}
				}
			}
			long ans = 0;
			int i = 0;
			if(t[0]==s[0])i=1;
			for(;i < t.length;i++) {
				int a = 'a';
				ans += next[(int)((ans)%N)][t[i]-a];
			}

			System.out.println(ans+1);

		}else {
			System.out.println(-1);
		}
	}

}
