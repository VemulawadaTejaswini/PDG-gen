
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long N=gl();
	    long M=gl();

	    long ans=1;
	    long tmp=2;
	    while(tmp*N<=M) {
            long a=M-tmp*N;
            if(a%tmp==0) {
            	ans=tmp;
            }
            tmp++;
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