import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long W = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long dp_old[] = new long[(int)W];
		long dp_new[] = new long[(int)W];
		dp_new[0] = 1;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(i >= H - A && j < B) continue;
				if(i != 0) {
					dp_new[j] = (dp_new[j] + dp_old[j]) % 1000000007;
				}
				if(j != 0) {
					dp_new[j] = (dp_new[j] + dp_new[j - 1]) % 1000000007;
				}
				//System.out.println("i:" + i + ", j:" + j + ", dp:" + dp_new[j]);
			}
			dp_old = dp_new.clone();
			Arrays.fill(dp_new, 0);
		}
		System.out.println(dp_old[(int)W - 1]);
	}
}
