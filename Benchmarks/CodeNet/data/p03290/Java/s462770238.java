import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int G = sc.nextInt();
		int p[] = new int[D];
		int c[] = new int[D];
		for(int i = 0; i < D; i++) {
			p[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		
		int ans = Integer.MAX_VALUE;
		out : for (int i = 0; i < (Math.pow(2, D)); i++) {
			int cnt = 0;
			int point = 0;
			boolean flag[] = new boolean[D];
			Arrays.fill(flag, false);
			for (int j = 0; j < D; j++) {
				if ((1&i>>j) == 1) {
					cnt += p[j];
					point = point + p[j] * (j + 1) * 100 + c[j];
					flag[j] = true;
				}
			}
			if(point >= G) {
				ans = Math.min(ans, cnt); 
			} else {
				in : for(int j = D - 1; j >= 0; j--) {
					if(!flag[j]) {
						for(int k = 0; k < p[j] - 1; k++) {
							cnt++;
							point = point + (j + 1) * 100;
							if(point >= G) {
								break in;
							}
						}
						continue out;
					}
				}
			ans = Math.min(ans, cnt);
			}
		}
		System.out.println(ans);
	}
}
