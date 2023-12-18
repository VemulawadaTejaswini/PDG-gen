
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long N=gl();
	    long K=gl();


	    long ans=0;
	    if (K%2==0) {
	    	long a= Math.floorDiv(N, K/2);
	    	if (a%2==0) {
	    		ans+=(Math.pow(a, 3))*2;
	    	} else {
	    		ans+=(Math.pow((a-1)/2, 3) + Math.pow((a+1)/2, 3));
	    	}
	    } else {
	    	ans+=Math.pow(Math.floorDiv(N, K),3);
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