import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws java.io.IOException {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int t = sc.nextInt();
			int p = sc.nextInt();
			int r = sc.nextInt();
			if ((t | p | r) == 0)
				break;
			int[][] wa = new int[t + 1][p + 1];
			final int[] pena = new int[t + 1];
			final int[] ac = new int[t + 1];
			Integer[] num = new Integer[t];
			for (int i = 0; i < t; i++) {
				num[i] = i + 1;
			}
			for (int i = 0; i < r; i++) {
				int tld = sc.nextInt();
				int pld = sc.nextInt();
				int time = sc.nextInt();
				String msg = sc.next();
				if (msg.equals("CORRECT")) {
					ac[tld]++;
					pena[tld] += wa[tld][pld] * 1200 + time;
				} else {
					wa[tld][pld]++;
				}
			}
			Arrays.sort(num, new Comparator<Integer>() {
				public int compare(Integer a, Integer b) {
					if (ac[a] != ac[b])
						return ac[b] - ac[a];
					else {
						if (pena[a] != pena[b]) {
							return pena[a] - pena[b];
						} else
							return a - b;
					}
				}
			});
			for (int i = 0; i < t; i++) {
				System.out.println(num[i] + " " + ac[num[i]] + " "
						+ pena[num[i]]);
			}
		}

	}
}