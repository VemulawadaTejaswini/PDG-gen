import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			char[] n = sc.next().toCharArray();
			if (n[0] == n[1] && n[1] == n[2] && n[2] == n[3]) {
				if (n[0] == '0')
					break;
				else {
					System.out.println("NA");
					continue;
				}
			}
			int cnt = 0;
			for (;;) {
				if (Integer.parseInt(new String(n)) == 6174)
					break;
				int L = calcL(n);
				int S = calcS(n);
				cnt++;
				n = String.format("%04d", (L - S)).toCharArray();
			}
			System.out.println(cnt);
		}
	}

	int calcS(char[] cs) {
		char ds[] = new char[4];
		for (int i = 0; i < cs.length; i++) {
			ds[i] = cs[i];
		}
		Arrays.sort(ds);
		StringBuilder sb = new StringBuilder();
		sb.append(ds);
		return Integer.parseInt(sb.toString());
	}

	int calcL(char[] cs) {
		char ds[] = new char[4];
		for (int i = 0; i < cs.length; i++) {
			ds[i] = cs[i];
		}
		Arrays.sort(ds);
		StringBuilder sb = new StringBuilder();
		sb.append(ds);
		return Integer.parseInt(sb.reverse().toString());
	}

	public static void main(String[] args) {

		new Main().run();
	}
}