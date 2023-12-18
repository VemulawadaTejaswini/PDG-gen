import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = 0;
      int p = 1;
      while(p <= n){
        p *= 2;
      }
      System.out.println(p/2);
    }
}