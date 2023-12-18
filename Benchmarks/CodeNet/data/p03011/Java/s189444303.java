import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc  = new Scanner(System.in);
      int p = sc.nextInt();
      int q = sc.nextInt();
      int r = sc.nextInt();
	  if(p > q && p > r) System.out.println(p);
      else if(q > p && q > r) System.out.println(q);
      else System.out.println(r);
      sc.close();
    }
}
