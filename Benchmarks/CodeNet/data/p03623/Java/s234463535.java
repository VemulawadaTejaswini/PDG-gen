import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int x=gi();
	    int a=gi();
	    int b=gi();


        //System.out.println(Math.min(Math.abs(x-a),Math.abs(x-b)));
        if (Math.abs(x-a)>Math.abs(x-b) ) {
        	System.out.print("B");
        }else {
            System.out.print("A");
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
}