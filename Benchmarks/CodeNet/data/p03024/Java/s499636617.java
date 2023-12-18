import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		int count = 0;
		for(int i = 0; i < N; i++) {
			if(S.substring(i, i + 1).equals("o")) {
				count++;
			}
		}
		if((15 - N + count) >= 8) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
