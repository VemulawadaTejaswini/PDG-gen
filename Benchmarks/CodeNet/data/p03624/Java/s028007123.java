import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		boolean[]flag = new boolean[26];
		int l = S.length();
		for(int i = 0; i < l; i++) {
			int k = S.charAt(i) - 'a';
			flag[k] = true;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 26; i++) {
			if(!flag[i]) {
				char c = (char)(i + 'a');
				System.out.println(c);
				System.exit(0);
			}
		}
		System.out.println("None");
	}
}