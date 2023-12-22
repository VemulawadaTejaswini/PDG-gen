import java.util.*;
import java.math.*;

public class Main{

	public static void main(String[] args) {
		solver();

	}

	static void solver() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			char[] c = sc.next().toCharArray();
			if (c.length == 1 && c[0] == '0')
				break;

			int[] dp = new int[80010];
			Arrays.fill(dp, -1);

			long ans = 0;
			// dp[i]=j i????????????j?????????11????????° ???????????????0-origin
			for (int i = 0; i < c.length; i++) {
				int q = 0;
				int d = 0;
				for (int j = i; j < c.length - 1; j++) {
					d = (c[j] - '0') * 10 + (c[j + 1] - '0');
					if ((d - q * 10) % 11 != 0) {
						q = d / 11;
					} else if ((d - q * 10) % 11 == 0) {
						dp[i] = j + 1;
						if (c[i] - '0' != 0) {
							ans++;
						}
						if(c[i+1]-'0'==0){
							q=d/11;
						}else{
							break;
						}
					}

				}
			}
			for (int i = 0; i < 80000; i++) {
				if (dp[i] != -1 && (c[i] - '0' != 0)) {
					int d = dp[dp[i] + 1];
					while (d != -1) {
						ans++;
						if(dp[d]==-1){
							break;
						}else{
							d = dp[dp[d] + 1];
						}
					}
				}
			}
			System.out.println(ans);
		}
	}

	static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}