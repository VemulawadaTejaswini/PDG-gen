import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String t = sc.next();
		String p = "";
		
		
		for(int i = 0; i < t.length(); i++) {
			if( i == 0 ) {
				if(t.charAt(i) == '?') {
					p+= 'D';
				}else {
					p+= t.charAt(i);
				}
			}else if(t.charAt(i) == 'P') {
				p+= 'P';
			}
			else if(t.charAt(i-1) == 'P') {
				p+= 'D';
			}else {
				p+= 'D';
			}
	
		}
		System.out.println(p);
	}
}
