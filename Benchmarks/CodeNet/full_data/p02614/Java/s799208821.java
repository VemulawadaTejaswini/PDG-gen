import java.util.Scanner;

public class Main {
	public static long H;
	public static long W;
	public static long K;
	public static String[][] C;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextLong();
		W = sc.nextLong();
		K = sc.nextLong();
		C = new String[(int) (1 + H)][(int) (1 + W)];
		for (int h = 1; h <= H; h++) {
			String inh = sc.next();
			for (int w = 1; w <= W; w++) {
				C[h][w] = String.valueOf(inh.charAt((int)(w-1)));
			}
		}

		long res = 0;
		long hmax = (long) Math.pow(2, H);
		long wmax = (long) Math.pow(2, W);
		for (long eh = 0; eh < hmax; eh++) {
			for (long ew = 0; ew < wmax; ew++) {
				if (isKuroK(eh, ew))
					res++;
			}
		}
		System.out.println(res);
	}

	static boolean isKuroK(long eh, long ew) {
		long black = 0;
		for (int h = 1; h <= H; h++) {
			long ph = (long) Math.pow(2, h-1);
			if ((eh & ph) == ph) {
				continue;
			}
			for (int w = 1; w <= W; w++) {
				long pw = (long) Math.pow(2, w-1);
				if ((ew & pw) == pw) {
					continue;
				}
				if (C[h][w].equals("#")) {
					black++;
				}
			}
		}
		return black == K;
	}
}
