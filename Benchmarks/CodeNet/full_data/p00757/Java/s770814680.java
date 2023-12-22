import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int n = nextInt();
			if (n == 0) {
				break;
			}

			int[][] cir = new int[n][4];
			int[] above = new int[n];// テ、ツクツ甘」ツ?ォテゥツ?催」ツ?ェテ」ツ?」テ」ツ?ヲテ」ツつ凝・ツ??ァツ崢、

			int[] bitDP = new int[1 << n];

			for (int i = 0; i < n; i++) {
				int x = nextInt();
				int y = nextInt();
				int r = nextInt();
				int c = nextInt();
				cir[i][0] = x;
				cir[i][1] = y;
				cir[i][2] = r;
				cir[i][3] = c;

				for (int j = 0; j < i; j++) {
					// テゥツ?催」ツ?ェテ」ツ?」テ」ツ?ヲテ」ツ??」ツつ凝・ツ??ァツ崢、テ」ツ?古」ツ?づ」ツつ凝」ツ?凝」ツ?ョテ・ツ按、テ・ツョツ?
					int jx = cir[j][0] - x;
					int jy = cir[j][1] - y;
					int jr = cir[j][2];
					double dist = Math.sqrt(jx * jx + jy * jy);
					if (dist < r + jr) {
						above[i] += (1 << j);
					}
				}
			}

			int max = 0;
			for (int bit = 0; bit < bitDP.length; bit++) {
				// テ・ツ按ーテゥツ?氾」ツ?療」ツ??」ツつ凝ゥツ?キテァツァツサテ」ツ??
				if (bit != 0 && bitDP[bit] == 0) {
					continue;
				}
				for (int i = 0; i < n; i++) {
					// テ・ツ??テ」ツ?ィjテ」ツ?古・ツ渉姪」ツつ甘ゥツ卍、テ」ツ?凝」ツつ古」ツ?ヲテ」ツ??」ツ?ェテ」ツ??」ツ?凝」ツδ?」ツつァテ」ツδε」ツつッ
					if ((bit & (1 << i)) != 0) {
						continue;
					}
					for (int j = i + 1; j < n; j++) {
						// テ・ツ??テ」ツ?ィjテ」ツ?古・ツ渉姪」ツつ甘ゥツ卍、テ」ツ?凝」ツつ古」ツ?ヲテ」ツ??」ツ?ェテ」ツ??」ツ?凝」ツδ?」ツつァテ」ツδε」ツつッ
						if ((bit & ((1 << i) + (1 << j))) != 0) {
							continue;
						}
						// iテ」ツ?ィjテ」ツ?ョテ、ツクツ甘」ツ?ォティツシツ嘉」ツ?」テ」ツ?ヲテ」ツ??」ツつ凝・ツ??」ツ?古・ツ?ィテゥツδィテ・ツ渉姪」ツつ甘ゥツ卍、テ」ツ?凝」ツつ古」ツ?ヲテ」ツ??」ツつ?
						if ((above[i] & bit) != above[i] || (above[j] & bit) != above[j]) {
							continue;
						}
						// ティツ可イテ」ツ?古、ツクツ?ァツキツ津」ツ?凝」ツ?ゥテ」ツ??」ツ??
						if (cir[i][3] == cir[j][3]) {
							int newbit = bit + (1 << i) + (1 << j);
							bitDP[newbit] = Math.max(bitDP[newbit], bitDP[bit] + 2);
							max = Math.max(max, bitDP[newbit]);
						}
					}
				}
			}

			System.out.println(max);
			System.gc();
		}
	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

}