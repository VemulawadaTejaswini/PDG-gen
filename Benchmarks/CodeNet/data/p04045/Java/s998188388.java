import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] d = new int[k];
		for (int i = 0; i < k; i++) {
			d[i] = sc.nextInt();
		}

		int have = haveNoD(n, d);
		while (have != -1) {
			n += Math.pow(10, have - 1);
			if (have != 1) {
				n -= Integer.parseInt(String.valueOf(n).substring(String.valueOf(n).length() - have + 1));
			}
			have = haveNoD(n, d);
		}

		System.out.println(n);
		sc.close();

	}

	public static int haveNoD(int n, int[] d) {
		String ns = String.valueOf(n);
		for (int i = 0; i < ns.length(); i++) {
			for (int j = 0; j < d.length; j++) {
				if (Integer.parseInt(ns.substring(i, i + 1)) == d[j]) {
					return ns.length() - i;
				}
			}
		}
		return -1;
	}
}
