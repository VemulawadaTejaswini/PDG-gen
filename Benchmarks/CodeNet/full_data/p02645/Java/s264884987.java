//package atcoder;
 
import java.util.*;
//import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String str[] = new String[S.length()-2];
		for(int i=0;i<S.length()-2;i++) {
		 str[i] = S.substring(i,i+3);
		// System.out.println(str[i]);
	}
		
		
		System.out.println(getRandom(str));
	//System.out.println(generateRandomChars(
	//            str,3));	

		
	}
/*	public static String generateRandomChars(String candidateChars, int length) {
	    StringBuilder sb = new StringBuilder();
	    Random random = new Random();
	    for (int i = 0; i < length; i++) {
	        sb.append(candidateChars.charAt(random.nextInt(candidateChars
	                .length())));
	    }

	    return sb.toString();
	}*/

	
	
	public static String getRandom(String[] array) {
	    int rnd = new Random().nextInt(array.length);
	    return array[rnd];
	}
	
}