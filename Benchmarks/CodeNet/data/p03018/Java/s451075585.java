import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char c[] = s.toCharArray();
      
		int cnt = 0;
		boolean undone = true;
      
		while ( undone ) {
			for ( int i = c.length - 1; 3 <= i; i-- ) {

				if ( c[i - 3] == 'A' && c[i - 2] == 'A' && c[i - 1] == 'B' && c[i] == 'C' ) {
					c[i - 2] = 'B';
					c[i - 1] = 'C';
					c[i] = 'A';
					cnt++;
				}
			}

			for ( int j = c.length - 1; 2 <= j; j-- ) {
				if ( c[j - 2] == 'A' && c[j - 1] == 'B' && c[j] == 'C' ) {
					c[j - 2] = 'B';
					c[j - 1] = 'C';
					c[j] = 'A';
					cnt++;
					break;
				}
			}

			undone = false;
			for ( int j = c.length - 1; 2 <= j; j-- ) {
				if ( c[j - 2] == 'A' && c[j - 1] == 'B' && c[j] == 'C' ) {
					undone = true;
				}
			}
		}
		System.out.println(cnt);
		in.close();
	}
}