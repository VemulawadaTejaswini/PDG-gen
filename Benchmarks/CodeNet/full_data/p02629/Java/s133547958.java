
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long n = sc.nextLong();
		char[] s = new char[26];

		for (int i = 0; i < 26; i++) {
			s[i] = (char) ('a' + i);
			// System.out.print(i+1+" ");
			// System.out.println((char) ('a'+i));
		}

		//ArrayList<Character> q = new ArrayList<>();
		StringBuilder q =new StringBuilder();

		while (n > 0) {
			long k = n % 26;
			//System.out.println(k);

			if (k != 0) {
				int y = (int) k;
				q.append(s[y - 1]);

				n = n / 26;

			} else {
				q.append(s[25]);
				n = n / 26;
				n = n - 1;
			}
		}

		q.reverse();
		System.out.println(q);
		sc.close();
	}
}
