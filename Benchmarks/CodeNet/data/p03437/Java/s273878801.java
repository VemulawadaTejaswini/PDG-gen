import java.util.*;
public class Main
{

public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	   int x=in.nextInt();
	   int y=in.nextInt();
      int p=gcd(x,y);
      x/=p;
      y/=p;
      int ans=x*p*(y-1);
      if(ans==0)
      System.out.println(-1);
      else
    	  System.out.println(ans);
	    }
	static int gcd (int a,int b) {
		return b==0?a:gcd(b,a%b);
	}
}