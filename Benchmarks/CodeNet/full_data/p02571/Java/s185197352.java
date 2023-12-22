import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();

		int ls = s.length();
		int lt = t.length();
		int ld = ls-lt;

		int chg = lt+1;
		for ( int i=0; i<=ld; i++ ) {
			int chg1 = lt;
			for ( int j=0; j<lt; j++ ) {
				if ( s.charAt(i+j)==t.charAt(j) ) chg1--;
			}
			chg = Math.min(chg, chg1);
		}
		System.out.println(chg);
	}
}