
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long a=gl();
	    long b=gl();
	    long c=gl();

	    long v=0;
	    long ad=a;
	    long bd=b;
	    long cd=c;
        while(true) {
        	if(ad%2==1 || bd%2==1 || cd%2==1) {
        		break;
        	} else if((a==ad && b==bd && c==cd && v!=0)) {
        		System.out.println(-1);
        		return;
        	}
        	long adb=ad;
        	long bdb=bd;
        	long cdb=cd;
        	ad=bdb/2+cdb/2;
        	bd=cdb/2+adb/2;
        	cd=adb/2+bdb/2;
        	v++;
        }

		System.out.println(v);
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