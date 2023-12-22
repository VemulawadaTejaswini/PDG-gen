import java.util.*;
public class Main {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			int r = s.nextInt();
			int c = s.nextInt();
			int q = s.nextInt();
			if (r == 0) break;
			boolean [] r_used = new boolean[r];
			boolean [] c_used = new boolean[c];
			int r_cnt = c;
			int c_cnt = r;
			int [] alst = new int[q];
			int [] blst = new int[q];
			int [] olst = new int[q];
			for (int i=0;i<q;i++) {
				alst[q - i - 1] = s.nextInt();
				blst[q - i - 1] = s.nextInt();
				olst[q - i - 1] = s.nextInt();
			}
			int ans = 0;
			for (int i=0;i<q;i++) {
				int a = alst[i];
				int b = blst[i];
				int o = olst[i];
				if (a == 0) {
					if (o == 0) {
						if (!r_used[b]) {
							r_used[b] = true;
							c_cnt -= 1;
						}
					} else {
						if (!r_used[b]) {
							ans += r_cnt;
							r_used[b] = true;
							c_cnt -= 1;
						}
					}
				} else {
					if (o == 0) {
						if (!c_used[b]) {
							c_used[b] = true;
							r_cnt -= 1;
						}
					} else {
						if (!c_used[b]) {
							ans += c_cnt;
							c_used[b] = true;
							r_cnt -= 1;
						}
					}
				}
			}
			System.out.println(ans);
			
		}
	}
}
