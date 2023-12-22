import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		String ans = "Yes";
		
		if (S.length()+1!=T.length()) {
			ans = "No";	
		}
		if (S.equals(T.substring(0, T.length()-1))) {	
		}
		else{
		ans = "No";}
		System.out.println(ans);
		

    }
}