import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		int cnt = 0;
		for(int i = 1; i < S.length(); i++) {
			if(S.charAt(i - 1) != S.charAt(i)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}