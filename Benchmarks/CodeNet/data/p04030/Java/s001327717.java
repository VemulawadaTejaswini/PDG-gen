import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String S=gs();
	    StringBuilder sb= new StringBuilder();
	    for (int i=0; i<S.length();i++) {
	    	if (S.charAt(i)=='0') {
	    		sb.append('0');
	    	}else if(S.charAt(i)=='1') {
	    		sb.append('1');
	    	}else if (S.charAt(i)=='B'&&sb.length()!=0){
	    		sb.deleteCharAt(sb.length()-1);
	    	}
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