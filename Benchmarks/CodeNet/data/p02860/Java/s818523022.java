import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args)   {
        
    	Scanner sc1= new Scanner(System.in);
    	int n=sc1.nextInt();
    	
    	Scanner sc2= new Scanner(System.in);
    	String s = sc2.nextLine();
    	String s_half = s.substring(0, n/2);
    	String s_half2 = s.substring(n/2, n);
    	if(s_half.equals(s_half2)) {
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}
    	
    }
}