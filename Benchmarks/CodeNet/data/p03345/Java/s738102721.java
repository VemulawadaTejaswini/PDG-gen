import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = sc.nextLong();
      long c = sc.nextLong();
      long k = sc.nextLong();
      long x = (long)Math.pow(-1,k-1)*(a-b);
      System.out.println(x);
    }
}
