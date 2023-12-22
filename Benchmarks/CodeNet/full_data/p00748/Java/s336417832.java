import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);
	int n;
	int[] pollock = new int[180];
	int[] cnt = new int[1000001];
	int[] cnt2 = new int[1000001];
	
	void initPollock() {
		for (int i = 1; i <= pollock.length; i++) {
			pollock[i-1] = (i * (i+1) * (i+2)) / 6;
		}
	}
	
	public Main() {
		initPollock();
		Arrays.fill(cnt, 1000000);
		Arrays.fill(cnt2, 1000000);
		cnt[0] = 0; cnt2[0] = 0;
		for (int i = 0; i < pollock.length; i++) {
			int pol = pollock[i];
			if (pol % 2 == 0) {
				for (int j = pol; j <= 1000000; j++) {
					cnt[j] = Math.min(cnt[j], cnt[j - pol] + 1);
				}
			} else {
				for (int j = pol; j <= 1000000; j++) {
					cnt[j] = Math.min(cnt[j], cnt[j - pol] + 1);
					cnt2[j] = Math.min(cnt2[j], cnt2[j - pol] + 1);
				}
			}
		}
		while (true) {
			n = in.nextInt();
			if (n == 0) break;
			System.out.println(cnt[n] + " " + cnt2[n]);
		}
	}
	
	public static void main(String args[]) {
		new Main();
	}
}