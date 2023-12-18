import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long K = sc.nextLong();
		long count = 0;
		char c = ' ';
		long ans = 0;
		if (K == 1) {
			String SSS = S;
			for (int i = 0; i < SSS.length(); i++) {
					if (SSS.charAt(i) == c) {
						count++;
						i++;
					}
					if (i >= SSS.length())
						break;
					c = SSS.charAt(i);
			}
			System.out.println(count * K / 2);
		} else if (K == 2) {
			String SSS = S+S;
			for (int i = 0; i < SSS.length(); i++) {
					if (SSS.charAt(i) == c) {
						count++;
						i++;
					}
					if (i >= SSS.length())
						break;
					c = SSS.charAt(i);
			}
			System.out.println(count * K / 2);
		} else {
			String SSS = S+S+S;
			for (int i = 0; i < SSS.length(); i++) {
					if (SSS.charAt(i) == c) {
						count++;
						i++;
					}
					if (i >= SSS.length())
						break;
					c = SSS.charAt(i);
			}
			if (K % 3 == 0) 
				ans = count * K / 3;
			else if (K % 3 == 1)
				ans = count * K / 3 + count;
			else 
				ans = count * K / 3 + count + count;
			System.out.println(ans);
		}
	}
}