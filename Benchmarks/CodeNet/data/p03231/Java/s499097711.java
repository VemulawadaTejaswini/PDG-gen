
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long n=gl();
	    long m=gl();
	    String S=gs();
	    String T=gs();

	    long l=n*m/uclid(n,m);
	    long lwn=l/n;
	    long lwm=l/m;
	    long lmk=lwn*lwm/uclid(lwn, lwm);
	    for (int i=0; lmk*i<l; i++) {
	    	char c1 = S.charAt((int)(lwm*i));
	    	char c2 = T.charAt((int)(lwn*i));
	    	if (c1!=c2) {
	    		System.out.println(-1);
	    		return;
	    	}
	    }


	    System.out.println(l);
//        if(k%2==0) {
//
//		    System.out.println(a-b);
//        } else {
//        	System.out.println(b-a);
//
//        }
	}

	 // ユークリッドの互除法
    public static long uclid(long m, long n) {
    	if (m<n) {
			m^=n;
			n^=m;
			m^=n;
		}

		while(true) {
			long t=m%n;
			if (t==0) {
				return n;
			} else {
				m=n;
				n=t;
			}
		}
    }

	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}