import java.util.*;
 
public class Main{
 
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long k = s.nextLong();
		
		if(n%k==0)
          System.out.println(n%k);
      	else
          System.out.println((n+k)%k);
		
	}
 
}