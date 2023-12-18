
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long X=gl();
	    long yen=100;
	    int y=0;
	    while (yen<X) {
	    	yen=(long)Math.floor(((double)yen) *1.01);
	    	y++;
	    }
        System.out.print(y);

//        if (2*X<=Y&& Y<=4*X && Y%2==0) {
//        	System.out.println("Yes");
//        }else{
//        	System.out.println("No");
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