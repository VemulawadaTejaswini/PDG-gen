import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuffer str = new StringBuffer();
		char table[] = new char['z' - '0' + 1];
		int n, ln;
		
		for (char i = '0'; i <= 'z'; i++) {
			table[i - '0'] = i;
		}
		
		n = scanner.nextInt();
		while (n != 0) {
			str.setLength(0);
			
			for(int i = 0; i < n; i++) {
				char fromChar = scanner.next().toCharArray()[0];
				char toChar = scanner.next().toCharArray()[0];
				table[fromChar - '0'] = toChar;
			}

			ln = scanner.nextInt();
			
			for(int i = 0; i < ln; i++) {
				char inputChar = scanner.next().toCharArray()[0];
				str.append(table[inputChar - '0']);
			}
			
			System.out.println(str.toString());
			n = scanner.nextInt();
		}
	}
}