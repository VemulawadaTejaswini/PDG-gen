import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int d = sc.nextInt();
      int n = sc.nextInt();
      int x = (int) Math.pow(100,d);
      if(n <= 99)
      System.out.println(x*n);
      else
        System.out.println(x*101)
    }
}
