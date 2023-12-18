
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int K=gi();

       System.out.print(NsinKeta(N,K));

//        if (f) {
//    	    System.out.print("Yes");
//        }else{
//        	 System.out.print("No");
//        }
	}
	
	public static int NsinKeta(int n, int s) {
		if(n==0) return 1;
		
		int i=0;
		while(n!=0) {
			n=Math.floorDiv(n, s);
			i++;
		}
		
		return i;
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