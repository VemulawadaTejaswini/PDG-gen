import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String str = reader.next();
		int ans = 0;
		int s = 0;
		int tmp = 0;
		while (s < str.length()) {
			char b = str.charAt(s);
			if (b == 'A' || b == 'T' || b == 'C' || b == 'G') {
				tmp++;
				if (tmp > ans) {
					ans = tmp;
				}
			} else {
				tmp = 0;
			}
			s++;
		}

		reader.close();
		System.out.println(ans);
	}
}



