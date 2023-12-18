import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    int m=n/2;
    String a=s.substring(0,m);
    System.out.println(a);
    String b=s.substring(m,s.length());
    System.out.println(b);
    String ans=a+a;
    if(s.equals(ans)) {
      System.out.println("Yes");
    } else {
      System.out.println("NO");
    }

	}
}