import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int q = sc.nextInt();

		String h = "";   // header
		String t = "";   // trailer
		boolean rev = false;  // reverse

		for ( int i=0; i<q; i++ ) {
			int qr = sc.nextInt();
			if ( qr == 1 ) {
				rev = !rev;
			} else {
				int f = sc.nextInt();
				String c = sc.next();
				if ( (!rev && f==1) || (rev && f==2) ) {
					h = c.concat(h);
				} else {
					t = t.concat(c);
				}
			}
		}

		s = h+s+t;
		String s1 = "";
		if ( rev ) {
			for ( int i=0; i<s.length(); i++ ) {
				char rs = s.charAt(s.length()-i-1);
				s1 = s1.concat(String.valueOf(rs));
			}
		} else {
			s1 = s;
		}
			System.out.println(s1);
	}
}