import java.util.*;
public class Main { 
	final static int maxn=(int)2e5+10;
	static int vis[]=new int [maxn];
	static int a[]=new int [maxn];
	static int b[]=new int [maxn];
	static int f[][]=new int [maxn][3];
 public static void main(String args[])
 {
	 Scanner input=new Scanner(System.in);
     String s=input.next();
     if(s.charAt(2)==s.charAt(3)&&s.charAt(4)==s.charAt(5))
    	 System.out.println("Yes");
     else
    	 System.out.println("No");
}
}