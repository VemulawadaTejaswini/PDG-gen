import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long p = sc.nextLong();
      long max = 1;
      for(long i = 1;i <= Math.sqrt(p);i++){
        long q = (long)Math.pow(i,n);
        if(p%q==0)max = i;
      }
      if(n==1)max = p;
      System.out.println(max);
    }
}
