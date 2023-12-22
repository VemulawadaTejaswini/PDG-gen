import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		int top = 0;
		final String INSERT = "insert";
		final String FIND = "find";
		final int n = scan.nextInt();
		String[] str = new String[n];
		
		for (int i = 0; i < n; i++) {
			boolean flg = false;
			final String ord = scan.next();

			if ( ord.equals(INSERT)) {
				str[top] = scan.next();
				top++;
			} else if (ord.equals(FIND)) {
				final String word = scan.next();
				Dictionary(str, top, word);
			}
		}
		scan.close();
	}
	
	public static void Dictionary(String[] str, int top, String word) {
		boolean flg = false;
		
		for (int j = 0; j < top; j++) {
			if (word.equals(str[j])) {
				flg = true;
				break;
			}
		}
		if (flg) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}

