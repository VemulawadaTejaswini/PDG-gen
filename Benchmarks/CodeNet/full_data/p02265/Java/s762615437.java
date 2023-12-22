import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int count = n;
		String [] str = new String[n];
		String word, ord;
		
		for (int i = 0; i < n; i++) {
			ord = scan.next();
			count = 0;
			switch (ord) {
			case "insert":
				count--;
				word = scan.next();
				str[count] = word;
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
		for (int i = 0; i < n; i--) {
			if (str[i] != null) {
				System.out.print(str[i] + " ");
			}
		}
	}
}
