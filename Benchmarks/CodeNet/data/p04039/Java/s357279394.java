import java.util.HashMap;
import java.util.Scanner;




public class Main {
    //static int a=new int[100005];
    static int [] vis=new int[105];
   // static Long [] dp=new Long[505];

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        
        int n=in.nextInt();
        int x;
        for(int i=0;i<=9;i++)
        	vis[i]=0;
        for(int i=1;i<=n;i++)
        {
        	x=in.nextInt();
        	vis[x]++;
        }
        String ans="";
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
        	if(flag==0)
        	{
        		x=Integer.parseInt(s.charAt(i)+"");
        		if(vis[x]==0) 
        		{
        			ans+=s.charAt(i);
        			continue;
        		}
        		
        		int flag1=0;
        		for(int j=x+1;j<=9;j++)
        		{
        			if(vis[j]==0)
        			{
        				ans+=String.valueOf(j);
        				flag1=1;
        				break;
        			}
        		}
        		flag=1;
        	}
        	else
        	{
        		for(int j=0;j<=9;j++)
        		{
        			if(vis[j]==0)
        			{
        				ans+=String.valueOf(j);
        				break;
        			}
        		}
        	}
        }
          System.out.println(ans);
         System.gc();
     }
 }
