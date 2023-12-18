import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		String str1 = scanner.next();
		String str2 = str1;
		String str3 = str1;
		int answer = 0;

		int k = 0;
		int j = 0;
		int i = 0;

		while (true) {
			k = str1.lastIndexOf("R");
			if (k == -1) break;

			str1 = str1.substring(0, k);
			String str11 = str1;
			String str12 = str1;

			while (true) {
				j = str11.lastIndexOf("G");
				if (j == -1) break;

				str11 = str11.substring(0, j);
				String str111 = str11;

				while (true) {
					i = str111.lastIndexOf("B");
					if (i == -1) break;

					str111 = str111.substring(0, i);
					if (j - i != k - j) answer++;
				}
			}

			while (true) {
				j = str12.lastIndexOf("B");
				if (j == -1) break;

				str12 = str12.substring(0, j);
				String str121 = str12;

				while (true) {
					i = str121.lastIndexOf("G");
					if (i == -1) break;

					str121 = str121.substring(0, i);
					if (j - i != k - j) answer++;
				}
			}
		}

		while (true) {
			k = str2.lastIndexOf("G");
			if (k == -1) break;

			str2 = str2.substring(0, k);
			String str21 = str2;
			String str22 = str2;

			while (true) {
				j = str21.lastIndexOf("R");
				if (j == -1) break;

				str21 = str21.substring(0, j);
				String str211 = str21;

				while (true) {
					i = str211.lastIndexOf("B");
					if (i == -1) break;

					str211 = str211.substring(0, i);
					if (j - i != k - j) answer++;
				}
			}

			while (true) {
				j = str22.lastIndexOf("B");
				if (j == -1) break;

				str22 = str22.substring(0, j);
				String str221 = str22;

				while (true) {
					i = str221.lastIndexOf("R");
					if (i == -1) break;

					str221 = str221.substring(0, i);
					if (j - i != k - j) answer++;
				}
			}
		}

		while (true) {
			k = str3.lastIndexOf("B");
			if (k == -1) break;

			str3 = str3.substring(0, k);
			String str31 = str3;
			String str32 = str3;

			while (true) {
				j = str31.lastIndexOf("R");
				if (j == -1) break;

				str31 = str31.substring(0, j);
				String str311 = str31;

				while (true) {
					i = str311.lastIndexOf("G");
					if (i == -1) break;

					str311 = str311.substring(0, i);
					if (j - i != k - j) answer++;
				}
			}

			while (true) {
				j = str32.lastIndexOf("G");
				if (j == -1) break;

				str32 = str32.substring(0, j);
				String str321 = str32;

				while (true) {
					i = str321.lastIndexOf("R");
					if (i == -1) break;

					str321 = str321.substring(0, i);
					if (j - i != k - j) answer++;
				}
			}
		}


		System.out.println(answer);
	}
}
