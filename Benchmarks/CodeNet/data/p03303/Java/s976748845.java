import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] s = sc.next().toCharArray();
		int n = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length; i += n) {
			sb.append(s[i]);
		}

		System.out.println(sb);

		sc.close();
	}

}
