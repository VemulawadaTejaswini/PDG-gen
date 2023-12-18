import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
  		
      	long h = sc.nextLong();
      	long n = (int)(Math.log(h)/Math.log(2)) + 1;
      	long ans = (long)Math.pow(2,n) - 1;
      	
      	System.out.println(ans);
        
	}
}
