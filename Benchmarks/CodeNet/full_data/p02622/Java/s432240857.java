
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String T = sc.nextLine();
		int ans = 0;

	    for(int i = 0;i<S.length();i++) {
	    	if(S.substring(i,S.length()).equals(T.substring(i,T.length()))) {
	    		ans ++;
	    	}
	    }
	    System.out.println(S.length()-ans);

	}

}
