import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc  = Scanner(System.in);
      int p = sc.nextInt();
      int q = sc.nextInt();
      int r = sc.nextInt();
      int mx = Math.max(p,q,r);
      System.out.println(p+q+r-mx);
      sc.close();
    }
}