import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] map = new int[200001];
		int[] ppcount = new int[200001];
		map[0] = 0;
		map[1] = 1;
		ppcount[0] = 0;
		ppcount[1] = 1;
		for (int i = 2; i < 200001; i++) {
			ppcount[i] = ppcount[i / 2] + i % 2;
			map[i] = map[i % ppcount[i]] + 1;
		}

		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		String n = sc.next();

		char[] array = n.toCharArray();
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '1') {
				count++;
			}
		}
		int oneMod = 0;
		int zeroMod = 0;
		int oneCount = count + 1;
		int zeroCount = count - 1;
		for (int i = 0; i < array.length; i++) {
			int i1 = Integer.parseInt(String.valueOf(array[i]));
			oneMod = ((oneMod * 2) + i1) % oneCount;
			if (zeroCount > 0) {
				zeroMod = ((zeroMod * 2) + i1) % zeroCount;
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] == '0') {
				int mode = expMod(2, array.length - 1 - i, oneCount);
				int temp = (oneMod + mode) % oneCount;
				System.out.println(map[temp] + 1);
			} else {
				if (zeroCount == 0) {
					System.out.println(0);
				} else {
					int mode = expMod(2, array.length - 1 - i, zeroCount);
					int temp = (zeroMod - mode) % zeroCount;
					if (temp < 0) {
						temp += zeroCount;
					}
					System.out.println(map[temp] + 1);
				}
			}
		}

	}

	private static int binaryMod(String binaryString, int mod) {
		if (mod == 0) {
			return -1;
		}
		int temp = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			temp = temp % mod;
			temp = (temp * 2) + Integer.valueOf(String.valueOf(binaryString.charAt(i)));
		}
		return temp % mod;
	}


	private static int expMod(int a, int n, int mod) {
		int t;
		if (n == 0) return 1 % mod;
		if (n == 1) return a % mod;
		t = expMod(a, n / 2, mod);
		t = (t * t) % mod;
		if ((n & 1) == 1) t = (t * a) % mod;
		return t;
	}
}
