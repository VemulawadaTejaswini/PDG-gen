import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner SC=new Scanner(System.in);
	     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     PrintWriter pw=new PrintWriter(System.out);
	     int t=0;
	     
	     /*if(SC.hasNext())
	     t=SC.nextInt();
	     
	     for(int i=0;i<t;i++)
	     {
	          
	     }*/
	     
	     int n;
	     int a,b;
	     
	     String s;
	     
	     
	     s=br.readLine();
	     
	     n=Integer.parseInt(s.substring(0,s.indexOf(" ")));
	     s=s.substring(s.indexOf(" ")+1);
	     a=Integer.parseInt(s.substring(0,s.indexOf(" ")));
	     b=Integer.parseInt(s.substring(s.indexOf(" ")+1));
	     int x=0;
	     int max=0;
	     
	     int arr[]=new int[n];
	     String inp2=br.readLine();
	         for(int j=0;j<n-1;j++)
     	    {
     	         arr[j]=Integer.parseInt(inp2.substring(0,inp2.indexOf(" ")));
     	         inp2=inp2.substring(inp2.indexOf(" ")+1);
     	    }
     	    arr[(int)n-1]=Integer.parseInt(inp2);
	     
	     int min=0;
	     for(int i=1;i<n;i++)
	     {
	         int temp=arr[i]-arr[i-1];
	         min=min+(int)(Math.min(b,(temp*a)));
	     }
	     //x=(int)Math.max(0,x);
	     pw.println(min);
	     
	     //code for reading n long from bfreader in one line
	    /* String inp2=br.readLine();
	         for(int j=0;j<n-1;j++)
     	    {
     	         arr[j]=Long.parseLong(inp2.substring(0,inp2.indexOf(" ")));
     	         inp2=inp2.substring(inp2.indexOf(" ")+1);
     	    }
     	    arr[(int)n-1]=Long.parseLong(inp2);*/
	     
	     pw.close();     
		
}
}
