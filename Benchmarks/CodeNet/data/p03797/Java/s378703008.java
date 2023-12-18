import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long m = sc.nextLong();
      long x = Math.min(n,m/2);
      n -= x;
      m -= x*2;
      x += Math.max(0,m/4);
      System.out.println(x);
    }
}
