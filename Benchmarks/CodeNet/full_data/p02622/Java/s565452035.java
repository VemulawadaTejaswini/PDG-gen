import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    String s =scanner.next();
	    String t =scanner.next();
	    int c=0;
	    for (int i=0; i<s.length(); i++) {
	    	if (s.charAt(i) != t.charAt(i)) {
	    		c++;
	    	}
	    }



	    System.out.println(c);
	}

	public static int uclid(int m, int n) {
		if (m<n) {
			m ^= n;
			n^=m;
			m^=n;
		}

		while (true) {
			int t=m%n;
			if (t==0) {
				return n;
			} else {
				m=n;
				n=t;
			}
		}
	}

}