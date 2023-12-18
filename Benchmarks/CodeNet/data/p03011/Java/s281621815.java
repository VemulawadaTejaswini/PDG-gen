import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int[] P=new int[3];
	    P[0]=gi();
	    P[1]=gi();
	    P[2]=gi();
	    Arrays.parallelSort(P);
//	    int a=gi();
//	    int p=gi();



	   
	    System.out.print(P[1]+P[0]);

//        if (a>12) {
//        	System.out.print(b);
//        }else if(a>5){
//        	System.out.print(b/2);
//        } else {
//        	System.out.print(0);
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