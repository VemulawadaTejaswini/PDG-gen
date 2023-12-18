import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		char c = s.charAt(0);
		int d = 1;
		for(int i=1; i<n; i++) {
			char x = s.charAt(i);
			if ( x != c ) {
				c = x;
				d++;
			}
		}
		
		
		System.out.println(d);
		sc.close();
	}
	
}