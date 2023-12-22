import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		
		int min = 1001;
		for (int i = 0; i <= s.length - t.length; i++) {
			int cnt = 0;
			for (int j = 0; j < t.length; j++) {
				if (s[i + j] != t[j]) cnt++;
			}
			min = Math.min(min, cnt);
		}
		
		System.out.println(min);

		sc.close();
	}
}


