import java.math.BigInteger;
import java.util.*;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		

		String s = sc.next();
		
		char[] cs = s.toCharArray();
		
		for(int i=1; i<cs.length ; i++ ) {
			if(cs[i-1] == cs[i]) {
				System.out.println("Bad");
				return;
			}
		}
		
		System.out.println("Good");

		
		
	}
	
}