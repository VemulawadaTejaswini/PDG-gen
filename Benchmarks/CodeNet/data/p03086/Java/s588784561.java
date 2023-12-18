import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		int a = 0;
		int max = 0;

		char[] c = S.toCharArray();
		for (int i = 0; i < S.length(); i++) {
			if (c[i] == 'A' || c[i] == 'C' || c[i] == 'G' || c[i] == 'T') {
				a++;
			} else {
				if (max < a) {
					max = a;
				}
				a = 0;
			}
		}
		System.out.println(max);
	}
}
