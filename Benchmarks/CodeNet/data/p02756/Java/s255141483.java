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

		StringBuffer sb = new StringBuffer(h+s+t);
		if ( rev ) {
			System.out.println(sb.reverse());
		} else {
			System.out.println(sb);
		}
	}
}