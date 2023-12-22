import java.math.BigDecimal;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		stdIn.useDelimiter("\n");
		int n = stdIn.nextInt();
		for(int i = 0; i < n; i++) {
			String pp = stdIn.next();
			pp = pp.replaceAll("Hoshino", "Hoshina");
			System.out.println(pp);
			
		}
		
	}
	public static char[] sorv(String pp) {
		int np1 = 0;
		int np2 = 0;
		int sp1 = 0;
		char[] t = pp.toCharArray();
		char[] m = new char[] {'H','o','s','h','i','n','o'};
		while(t.length > np1) {
			if(t[np1] == m[np2]) {
				np1++;
				np2++;
				if(np1 == m.length-1) {
					t[np1] = 'a';
					sp1++;
					np1 = sp1;
					np2 = 0;
				}
			}
			else {
				sp1++;
				np1 = sp1;
				np2 = 0;
			}
		}
		return t;
		
	}
	
}