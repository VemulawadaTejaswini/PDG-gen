import java.util.*;

public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long n=sc.nextLong();
      for(long i=n; i>0L; i--){
        double sqrtOf=Math.sqrt(i);
        if(sqrtOf==Math.floor(sqrtOf)){
        	System.out.println(i);
            return;
        }
      }
    }
}