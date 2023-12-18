import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();

		try {
			System.out.println(getResFast(a, b, 0));
		} finally {
			System.out.println("time:" + (System.currentTimeMillis() - start));
		}


	}

	private static long getResFast(long a, long b, long cut) {
		long resA = -1;
		long resB = 0;
		long diff = b-a;

		if(a == 0) {
			if(b % 4 == 1) {
				return 1 + cut;
			} else if (b % 4 == 2) {
				return b + 1;
			} else if (b % 4 == 3) {
				return cut;
			} else if (b % 4 == 0) {
				return b;
			}
		}

		if (diff > 5000000000L) {
			// この変から性能厳しいので対策

			if(a < 1) {
				resA = 0;
			} else if(a < 2) {
				resA = getRes(0, a, cut);
			} else if(a < 4) {
				resA = getRes(0, a, cut);
			} else if(a < 8) {
				resA = getRes(0, a, cut);
			} else if(a < 16) {
				resA = getRes(0, a, cut);
			} else if(a < 32) {
				resA = getRes(0, a, cut);
			} else if(a < 64) {
				resA = getRes(0, a, cut);
			} else if(a < 128) {
				resA = getRes(0, a, cut);
			} else if(a < 256) {
				resA = getRes(0, a, cut);
			} else if(a < 512) {
				resA = getRes(0, a, cut);
			} else if(a < 1024) {
				resA = getRes(0, a, cut);
			} else if(a < 2048) {
				resA = getRes(0, a, cut);
			} else if(a < 4096) {
				resA = getRes(0, a, cut);
			} else if(a < 8192) {
				resA = getRes(0, a, cut);
			} else if(a < 16384) {
				resA = getRes(0, a, cut);
			} else if(a < 32768) {
				resA = getRes(0, a, cut);
			} else if(a < 65536) {
				resA = getRes(0, a, cut);
			} else if(a < 131072) {
				resA = getRes(0, a, cut);
			} else if(a < 262144) {
				resA = getRes(0, a, cut);
			} else if(a < 524288) {
				resA = getRes(0, a, cut);
			} else if(a < 1048576) {
				resA = getRes(0, a, cut);
			} else if(a < 2097152) {
				resA = getRes(0, a, cut);
			} else if(a < 4194304) {
				resA = getRes(0, a, cut);
			} else if(a < 8388608) {
				resA = getRes(0, a, cut);
			} else if(a < 16777216) {
				resA = getRes(0, a, cut);
			} else if(a < 33554432) {
				resA = getRes(0, a, cut);
			} else if(a < 67108864) {
				resA = getRes(0, a, cut);
			} else if(a < 134217728) {
				resA = getRes(0, a, cut);
			} else if(a < 268435456) {
				resA = getRes(0, a, cut);
			} else if(a < 536870912) {
				resA = getRes(0, a, cut);
			} else if(a < 1073741824) {
				resA = getRes(0, a, cut);
			} else if(a < 2147483648L) {
				resA = getResFast(0, a, cut);
			} else if(a < 4294967296L) {
				resA = getResFast(0, a, cut);
			}
			if (resA >= 0) {
				if (b > 549755813887L) {
					resB = getResFast(0, b - 549755813888L, 549755813888L);
				} else if(b > 274877906943L) {
					resB = getResFast(0, b - 274877906944L, 274877906943L);
				} else if(b > 137438953471L) {
					resB = getResFast(0, b - 137438953472L, 137438953472L);
				} else if(b > 68719476735L) {
					resB = getResFast(0, b - 68719476736L, 68719476736L);
				} else if(b > 34359738367L) {
					resB = getResFast(0, b - 34359738367L, 34359738367L);
				} else if(b > 17179869183L) {
					resB = getResFast(0, b - 17179869183L, 17179869183L);
				} else if(b > 8589934591L) {
					resB = getResFast(0, b - 8589934592L, 8589934591L);
				} else {
					resB = b;
				}
				return resA^resB;
			}

		}

		return getRes(a, b, 0);
	}

	private static long getRes(long a, long b, long cut) {
		long res = a;

		for(long l = a + 1; l <= b; l++) {
			res = res ^ l;
		}

		if ((b - a + 1) % 2 == 1) {
			res += cut;
		}

		return res;
	}

}
