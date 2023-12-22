public class Main {
	private static int h;
	private static int w;
	private static int k;
	private static boolean[][] c;
	private static int[][] redmemo;

	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		k = sc.nextInt();
		String[] cTmp = new String[h];
		c = new boolean[h][];
		redmemo = new int[h][];
		int sousu = 0;
		for (int i = 0; i < cTmp.length; i++) {
			cTmp[i] = sc.next();
		}

		for (int i = 0; i < h; i++) {
			c[i] = new boolean[w];
			redmemo[i] = new int[w];
			for (int j = 0; j < w; j++) {
				if ((cTmp[i].charAt(j) == '#')) {
					sousu++;
					c[i][j] = true;
				}
			}
		}
		int ret = 0;
		if (sousu == k) {
			ret++;
		}
		ret += count(0, sousu);
		System.out.println(ret);
	}

	public static int count(int index, int midSu) {

		if (midSu < k) {
			return 0;
		} else if (index >= w + h) {
			return 0;
		}
		int ret = 0;
		ret += count(index + 1, midSu);

		if (index < h) {
			for (int j = 0; j < w; j++) {
				if (redmemo[index][j] == 0 && c[index][j]) {
					midSu--;
				}
				redmemo[index][j]++;
			}
		} else {
			for (int i = 0; i < h; i++) {
				if (redmemo[i][index - h] == 0 && c[i][index - h]) {
					midSu--;
				}
				redmemo[i][index - h]++;
			}
		}
		if (midSu == k) {
			ret++;
		}
		ret += count(index + 1, midSu);
		if (index < h) {
			for (int j = 0; j < w; j++) {
				redmemo[index][j]--;
				if (redmemo[index][j] == 0 && c[index][j]) {
					midSu++;
				}
			}
		} else {
			for (int i = 0; i < h; i++) {
				redmemo[i][index - h]--;
				if (redmemo[i][index - h] == 0 && c[i][index - h]) {
					midSu++;
				}
			}
		}
		return ret;
	}

}