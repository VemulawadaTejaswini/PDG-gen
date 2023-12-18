import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N= gi();
	    int L= gi();
	    String[] S= new String[N];
	    
	    for (int i=0; i<N;i++) {
	    	S[i]=gs();
	    }

	    Arrays.parallelSort(S);

	    StringBuilder sb= new StringBuilder();
	    for (int i=0; i<N;i++) {
	    	sb.append(S[i]);
	    }	    
        System.out.print(sb.toString());
//        if (a<=c&&c<=b) {
//        	System.out.print("Yes");
//        }else{
//        	System.out.print("No");
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