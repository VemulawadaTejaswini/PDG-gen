import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		String T = sc.next();
		
		for(int i = 0; i < T.length(); i++) {
			System.out.print((T.charAt(i) == '?')?'D':T.charAt(i));
		}
		System.out.println();
		sc.close();
	}
}