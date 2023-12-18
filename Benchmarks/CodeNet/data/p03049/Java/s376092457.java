

public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int N = sc.nextInt();
		String[] s = new String[N];

		int result = 0;

		int tailA = 0;
		int initB = 0;

		int tmp = 0;
		for (int i = 0; i < N; i++) {
			s[i] = sc.next();
			if (s[i].startsWith("B")) {
				initB++;
			}
			if (s[i].endsWith("A")) {
				tailA++;
			}
			tmp = s[i].split("AB").length - 1;
			if (tmp == -1) {
				result += s[i].length()/2;
			} else {
				result += tmp;
			}
		}

		result += Math.min(tailA, initB);

		System.out.println(result);
	}
}