import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] S = sc.next().toCharArray();
		sc.close();
		String rs = String.valueOf(S);
		int num = rs.length();

		int A = 0;

		for (int i = 0; i < num-2; i++) {
			if (S[i] == 'A') {
				if (S[i + 1] == 'B') {
					if (S[i + 2] == 'C') {
						A++;
					}
				}
			}
		}
		System.out.println(A);
	}
}