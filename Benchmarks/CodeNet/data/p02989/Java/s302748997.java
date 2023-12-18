import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] d = new int[n];
		int maxnum = 0;

		int cntarc = 0;
		int cntabc = 0;

		int cnt = 0;

		for (int i = 0; i < d.length; i++) {
			d[i] = sc.nextInt();
		}


		for (int i = 0; i < d.length; i++) {
			if (maxnum < d[i]) {
				maxnum = d[i];
			}
		}

		for (int i = 0; i < maxnum; i++) {
			for (int j = 0; j < d.length; j++) {
				if (d[j] >= i) {
					cntarc++;
				}
				if (d[j] < i) {
					cntabc++;
				}
			}
			if (cntarc == cntabc) {
				cnt++;
			}
			cntarc = 0;
			cntabc = 0;
		}

		System.out.println(cnt);

	}
}