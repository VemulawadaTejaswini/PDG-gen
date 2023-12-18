import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      long k = sc.nextInt();
      long x = (long)Math.pow(-1,k-1)*(a-b);
      System.out.println(x);
    }
}