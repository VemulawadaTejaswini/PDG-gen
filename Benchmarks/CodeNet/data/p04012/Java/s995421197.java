import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		char[] c = w.toCharArray();
		char[] moji = new char[26];
		char a = 'a';
		int count = 0;

		 for (int i = 0; i < moji.length; i++){
		        moji[i] = a++;
		    }

		for (int j = 0; j < moji.length; j++) {
			for (int i = 0; i < c.length; i++) {
				if(c[i] == moji[j]) {
					count++;
				}
			}

			if(count % 2 != 0) {
				System.out.print("No");
				System.exit(0);
			}
		}

		System.out.print("Yes");
	}
}
