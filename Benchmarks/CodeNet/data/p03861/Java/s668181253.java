import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long a=gl();
	    long b=gl();
	    long x=gl();
	    
	    long c=a%x;
	    long d=b%x;
        long e =((b-d)-(a-c)) / x;
        if(c==0)e++;

        System.out.println(e);
//        if (xo>w || yo>h) {
//        	System.out.print(0);
//        }else {
//        	System.out.print((h-yo)*(w-xo));
//        }


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