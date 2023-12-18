import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long x = 0;
      for(long i = (long)Math.sqrt(n);i > 0;i--){
      	if(n%i==0){
        	x = n/i;
          break;
        }
      }
      System.out.println(String.valueOf(x).length());
    }
}
