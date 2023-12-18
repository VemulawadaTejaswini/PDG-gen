import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		StringBuilder sb = new StringBuilder(s);
		
		int count = 0;
		
		while(true) {
			boolean b = false;
			for(int i = 1; i < s.length(); i++) {
				if(s.charAt(i-1) == 'B' && s.charAt(i) == 'W') {
					sb.setCharAt(i-1, getRev(s.charAt(i-1)));
					sb.setCharAt(i, getRev(s.charAt(i)));
					
					s = sb.toString();
					
					count++;
					b = true;
					break;
				}
			}
			if(b == false) {
				break;
			}
		}
		
		System.out.println(count);
	}
	
	public static char getRev(char c) {
		switch(c) {
		case 'B':
			return 'W';
		case 'W':
			return 'B';
		}
		return c;
	}
}
