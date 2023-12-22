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
			final String ord = scan.next();

			if ( ord.equals(INSERT)) {
				str[top] = scan.next();
				top++;
			} else if (ord.equals(FIND)) {
				final String word = scan.next();
			Inner:
				for (int j = 0; j < top; j++) {
					if (word.equals(str[j])) {
						System.out.println("yes");
						break Inner;
					}else if ( j == top - 1){
						System.out.println("no");
					}
				}
						
			}
		}
		scan.close();
	}
}

