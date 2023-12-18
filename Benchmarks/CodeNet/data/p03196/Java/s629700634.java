import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long p = sc.nextLong();
      long g = 1;
      for(long i = 2;i <= (long)Math.sqrt(p);i++){
        if((long)Math.pow(i,n)>p){
          g = i;
          break;
        }
      }
      long max = 0;
      for(long i = 1;i <= g;i++){
        long q = (long)Math.pow(i,n);
        if(p%q==0)max = i;
      }
      System.out.println(max);
    }
}