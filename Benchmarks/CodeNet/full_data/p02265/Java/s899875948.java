import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		final int n = scan.nextInt();
		int count = n;
		String [] str = new String[n + 1];
		String word;
		
		for (int i = 0; i < n; i++) {
			final String ord = scan.next();
			switch (ord) {
			case "insert":
				word = scan.next();
				str[count] = word;
				count--;
				break;
			case "delete":
				word = scan.next();
				for (int j = n; j > count; j--) {
					if (str[j] == word) {
						str[j] = null;
						break;
					}
				}
				break;
			case "deleteFirst":
				for (int j = n; j > count; j--) {
					if (str[j] != null) {
						str[j] = null;
						break;
					}
				}
				break;
			case "deleteLast":
				for ( int j = count; j < n; j++) {
					if (str[j] != null) {
						str[j] = null;
						break;
					}
				}
			break;
			default:
				break;
			}
		}
		scan.close();
		for (int i = count; i < n; i++) {
			if (str[i] != null) {
				System.out.print(str[i] + " ");
			}
		}
	}
}

