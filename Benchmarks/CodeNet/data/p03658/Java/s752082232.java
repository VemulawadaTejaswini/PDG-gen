import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
        int K=gi();
        int[] L=new int[N];
        for(int i=0; i<N;i++) {
           L[i]=gi();
        }
        
        Arrays.sort(L);
        int s=0;
        for(int i=0; i<N;i++) {
            s+=L[N-i-1];
         }

	   
	    System.out.print(s);

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