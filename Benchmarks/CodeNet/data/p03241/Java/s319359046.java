import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long N=gl();
	    long M=gl();
        List<Long> l=new ArrayList<Long>();

	    for(long i=1; i<=Math.sqrt(M);i++) {
	    	if(M%i==0) {
	    		l.add(i);
	    		l.add(M/i);
	    	}
	    }
	    Collections.sort(l);
	    long ans=1;
	    for(int i=0; i<l.size();i++) {
	    	long v=l.get(i);
	    	if(v>=N) {
	    		ans=M/v;
	    		break;
	    	}
	    }

	    System.out.print(ans);
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