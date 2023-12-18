import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] canUse = new int[10];
		for (int i = 0; i < K; i++) {
			int tmp = sc.nextInt();
			canUse[tmp] = -1;
		}
		for (int i = N; i <= 10000; i++) {
			boolean judge = true;
			for (int j = 0; j < 10; j++) {
				if (canUse[j] == 0) {
					continue;
				}
				if (String.valueOf(i).contains(String.valueOf(j))) {
					judge = false;
					break;
				}
			}
			if (judge) {
				System.out.print(i);
				break;
			}
		}
	}
}