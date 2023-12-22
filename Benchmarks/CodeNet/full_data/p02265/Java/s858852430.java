import java.util.Scanner;

class Main {
	static final String NULL = "-";
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		final int n = scan.nextInt();
		int count = n;
		String [] str = new String[n];
		
		for (int i = 0; i < n; i++) {
			final String ord = scan.next();
			final String word;
			switch (ord) {
			case "insert":
				word = scan.next();
				count--;
				str[count] = word;
				break;
			case "delete":
				word = scan.next();
				for (int j = count; j < n; j++) {
					if (str[j].equals(word)) {
						str[j] = NULL;
						break;
					}
				}
				break;
			case "deleteFirst":
				for (int j = count; j < n; j++) {
					if (str[j].equals(NULL) == false) {
						str[j] = NULL;
						break;
					}	
				}
				break;
			case "deleteLast":
				for ( int j = n - 1; j >= count; j--) {
					if (str[j].equals(NULL) == false) {
						str[j] = NULL;
						break;
					}
				}
			break;
			}
			
		}
		scan.close ();
		printArray (str, count);
	}
	
	static void printArray (String[] str, int j) {
		int n = str.length;
		int top = 0;
		
		for (int i = j; i < n; i++) {
			if (str[i].equals(NULL) == false) {
				top = i;
			}
		}
		
		for (int i = j; i <= top; i++) {
			if (str[i].equals(NULL) == false) {
				System.out.print(str[i]);
				if (i == top) System.out.println();
				else System.out.print(" ");
			}
			
		}
		
	}
}
