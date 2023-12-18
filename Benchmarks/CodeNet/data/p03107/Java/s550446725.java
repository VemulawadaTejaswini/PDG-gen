
import java.util.Scanner;

public class Main {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		scan.close();

		System.out.println(count(S)*2);

		
		
	}
	public static int count(String S) {
		int c=0;
		String T="";

		for(int i=0; i<S.length()-1; i++) {
			if(S.charAt(i+1) != S.charAt(i)) {
				c++;
				i++;
				if(i==S.length()-2) {
					T=T+S.charAt(i+1);
				}
			} else {
				T=T+S.charAt(i+1);
				if(i+1==S.length()) {
					T=T+S.charAt(i);
				}
			}
		}
		if(c==0) {
			return 0;
		}
		c+=count(T);
		return c;
		
	}

}