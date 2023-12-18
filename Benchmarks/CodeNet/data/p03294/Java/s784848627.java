import java.util.Scanner;
/** 復習用 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		// 解くべき問題が間違っていた。
		// f(m) = 0となるようなmは、 mがすべてのaの倍数になるようなm
		// つまり m0 = a1 * a2 *...* aN と定めれば良い
		// このとき、m%aiの各項が最大になるようなmは、m0-1
		// なぜなら m mod ai のすべての項が ai-1になるから
		// よってf(m)の最大値は f(m0-1) = (a1 - 1) + (a2 - 1) +..+ (aN - 1)
		int fm_max = 0;
		for (int i = 0; i < N; i++) {
			int ai = sc.nextInt();
			fm_max += ai - 1;
		}
		System.out.println(fm_max);
	}
}
