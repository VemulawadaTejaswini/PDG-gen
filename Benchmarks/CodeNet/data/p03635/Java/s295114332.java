import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int a=gi();
	    int b=gi();
	    //int c=gi();



        System.out.println((a-1)*(b-1));
//        if (a%3==0 || b%3==0 || ((a+b)%3==0) ) {
//        	System.out.print("Possible");
//        }else {
//            System.out.print("Impossible");
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
}