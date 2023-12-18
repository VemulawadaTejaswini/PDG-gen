import java.util.*;

public class Main 
{
	    public static void main(String[] args) 
        {
        	Scanner scanner = new Scanner(System.in);
        	String S = scanner.next();
        	Long countA = 0L;
        	Long countB = 0L;
        	for (int i = 0; i < S.length(); i++) 
            {
            	if(S.charAt(i) == '0')
                  	countA++;
            	if(S.charAt(i) == '1') 
                  	countB++;
        	}
        	countA = Math.min(countA, countB) * 2;
        	System.out.println(countA);
    	}
}
