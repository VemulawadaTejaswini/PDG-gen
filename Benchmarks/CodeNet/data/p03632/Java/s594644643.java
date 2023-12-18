import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = sc.nextInt();
      int x = Math.max(a,c);
      int y = Math.min(b,d);
      if(b < c||d < a) System.out.println(0);
      else System.out.println(y-x);
    }
}