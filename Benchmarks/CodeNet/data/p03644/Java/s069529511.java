import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();

	    int m= 0;
	    int m2=0;
        for(int i=1; i<=N;i++) {
        	int c=0;
        	int a=i;
           while(true) {
        	   if(a%2!=0) {
        		   break;
        	   }
        	   a/=2;
        	   c++;
           }
           if (c>m) {
        	   m=c;
        	   m2=i;
           }
        }

	   
	    System.out.print(m2);

//        if (t.equals("Sunny")) {
//        	System.out.print("Cloudy");
//        }else if(t.equals("Cloudy")){
//        	System.out.print("Rainy");
//        } else {
//        	System.out.print("Sunny");
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