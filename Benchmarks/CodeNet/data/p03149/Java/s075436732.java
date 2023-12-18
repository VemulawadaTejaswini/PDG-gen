import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	 static Scanner in = new Scanner(System.in);
	 
   
	public static void main(String args[])throws IOException  {
    while(in.hasNext())
    {
    	
  
    	int []a=new int[4+1];
    	int []vis=new int[11];
    	for(int i=1;i<=4;i++)
    	{
          a[i]=in.nextInt();
          vis[a[i]]++;
    	}
    	if(vis[1]==1&&vis[7]==1&&vis[9]==1&&vis[4]==1)
     	System.out.println("YES");
    	else
    		System.out.println("NO");	
     	
    }

	}
	
 
	
}