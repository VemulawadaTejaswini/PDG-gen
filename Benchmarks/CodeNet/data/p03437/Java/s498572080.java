import java.util.*;
public class Main
{

public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	   int x=in.nextInt();
	   int y=in.nextInt();
      int p=gcd(x,y);
      long  lcm=(long) x*y/p;
      int ok=1;
int ans=-10000;
for(int i=x;i<lcm;i+=x)
{
if(i%y==0)
ok=0;
else {ans=i;break;}
}
      if(ok==0)
      System.out.println(-1);
      else
    	  System.out.println(ans);
	    }
	static int gcd (int a,int b) {
		return b==0?a:gcd(b,a%b);
	}
}