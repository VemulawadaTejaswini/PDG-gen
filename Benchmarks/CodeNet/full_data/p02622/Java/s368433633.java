
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String T = sc.nextLine();
		int s = S.length();
		int ans = 0;

	    for(int i = 0;i<S.length();i++) {
	    	if(!((S.substring(i,s).equals(T.substring(i,s))))){
	    		ans ++;
	    	}
	    }
	    System.out.println(ans);

	}

}
