import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		String s = sc.next();
		sc.close();

		boolean flag1;

		for (int times = 1; times <= K; times++) {
			flag1 = false;
			for (int i = 2; i <= N; i++) {
				if (s.charAt(i - 1) != s.charAt(i - 2)) {
					for (int j = i; j <= N; j++) {
						if (j == N || s.charAt(j) == s.charAt(i - 2)) {
							//							System.out.println(i);
							//							System.out.println(j);
							s = hanten(s, i, j);

							flag1 = true;
							break;
						}
					}
				}
				if (flag1)
					break;
			}
			if (!flag1)
				times = K + 1;
		}
		//		System.out.println(s);
		System.out.println(happy(s));

	}

	private static int happy(String s) {
		int N = s.length();
		if (N == 1)
			return 0;
		int happy = 0;

		if (s.charAt(0) == 'R' && s.charAt(1) == 'R')
			happy++;
		for (int i = 2; i <= N - 1; i++) {
			if (s.charAt(i - 1) == 'L') {
				if (s.charAt(i - 2) == 'L')
					happy++;
			} else {
				if (s.charAt(i) == 'R')
					happy++;
			}
		}
		if (s.charAt(N - 1) == 'L' && s.charAt(N - 2) == 'L')
			happy++;

		return happy;
	}

	private static String hanten(String s, int l, int r) {
		String output = s.substring(0, l - 1);

		for (int i = r; i >= l; i--) {
			output += s.charAt(i - 1) == 'L' ? "R" : "L";
		}

		output += s.substring(r);
		return output;
	}
}
