import java.util.*;
import java.math.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	
        
      	int k = sc.nextInt();
      	int x = sc.nextInt();
      	
      	if (500 * x >= k)
          System.out.println("Yes");
      	else
          System.out.println("No");
    }
}