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
      int n,x,y;
      n=input.nextInt();x=input.nextInt();y=input.nextInt();
      for(int i=1;i<=n-1;i++)
      {
    	  for(int j=i+1;j<=n;j++)
    	  {
    		  int num=Math.min(j-i, Math.abs(i-x)+Math.abs(j-y)+1);
    		  a[num]++;
    	  }
      }
      for(int i=1;i<=n-1;i++)
      {
    	  System.out.println(a[i]);
      }
}
}