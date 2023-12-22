import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String line = sc.next();
			if (line.equals(".")) {
				sc.close();
				break;
			}
			int ans = 0;
			for (int p = 0; p <= 2; p++) {
				for (int q = 0; q <= 2; q++) {
					for (int r = 0; r <= 2; r++) {
						String tmp = line.replaceAll("P", String.valueOf(p));
						tmp = tmp.replaceAll("Q", String.valueOf(q));
						tmp = tmp.replaceAll("R", String.valueOf(r));
						while (tmp.length() > 1) {
							while (true) {
								int k = tmp.length();
								tmp = tmp.replaceAll("-0", "2");
								tmp = tmp.replaceAll("-1", "1");
								tmp = tmp.replaceAll("-2", "0");
								if (tmp.length() == k) {
									break;
								}
							}
							while (true) {
								int k = tmp.length();
								tmp = tmp.replaceAll("\\(2\\*2\\)", "2");
								tmp = tmp.replaceAll("\\([12]\\*1\\)", "1");
								tmp = tmp.replaceAll("\\(1\\*[12]\\)", "1");
								tmp = tmp.replaceAll("\\([012]\\*0\\)", "0");
								tmp = tmp.replaceAll("\\(0\\*[012]\\)", "0");
								tmp = tmp.replaceAll("\\(0\\+0\\)", "0");
								tmp = tmp.replaceAll("\\(1\\+[01]\\)", "1");
								tmp = tmp.replaceAll("\\([01]\\+1\\)", "1");
								tmp = tmp.replaceAll("\\([012]\\+2\\)", "2");
								tmp = tmp.replaceAll("\\(2\\+[012]\\)", "2");
								if (tmp.length() == k) {
									break;
								}
							}
						}

						if (tmp.equals("2")) {
							ans++;
						}
					}
				}
			}
			System.out.println(ans);
		}

	}

}