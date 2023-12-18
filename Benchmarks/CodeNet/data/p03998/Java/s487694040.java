import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		String ans = "";
		char player = 'a';
		
		int inta = 0;
		int intb = 0;
		int intc = 0;
		
		while(inta < a.length() && intb < b.length() && intc < c.length()) {
			switch(player) {
				case 'a':
					player = a.charAt(inta);
					inta++;
					ans = "a";
					break;
				case 'b':
					player = b.charAt(intb);
					intb++;
					ans = "b";
					break;
				case 'c':
					player = c.charAt(intc);
					intc++;
					ans = "c";
					break;
 			}
		}
		System.out.println(ans);
	}
}
