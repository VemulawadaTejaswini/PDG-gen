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
    	
        String s=in.next(); 
        String str="keyence";
        int len=str.length();
      
        for(int i=1;i<len;i++)
        {
        	
        	if(s.indexOf(str.substring(0,i))!=-1&&s.indexOf(str.substring(i+1,len))!=-1)
        	{
        		System.out.println("YES");
        		return ;
        	}
        }
     	
    
    		System.out.println("NO");	
     	
    }

	}
	
 
	
}