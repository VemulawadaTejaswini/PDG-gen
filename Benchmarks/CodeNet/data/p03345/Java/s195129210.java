import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = sc.nextLong();
      long c = sc.nextLong();
      long k = sc.nextLong();
      long x = 0;
      if(k%2==0)x = a-b;
      else x = b-a;
      System.out.println(x);
    }
}
