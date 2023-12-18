import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		long cnt = 0;
		long r = 0;
		long g = 0;
		long b = 0;

		for(int i = 0; i < s.length(); i++) {
			if('R'==s.charAt(i)) {
				r++;
			}else if('G'==s.charAt(i)) {
				g++;
			}else if('B'==s.charAt(i)) {
				b++;
			}
		}

		long num = r * g * b;
		
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < s.length(); j++) {
				if( i < j
						&& 2 * j - i < s.length()  
						&& j < 2 * j - i ) {
				
					if( s.charAt(i) != s.charAt(j) 
							&& s.charAt(i) != s.charAt(2 * j - i) 
							&& s.charAt(j) != s.charAt(2 * j - i) 
						) {
						cnt++;
					}
				}
			}
		}

		System.out.println(num - cnt);
		sc.close();
	}

}