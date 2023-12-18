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
    	
        String s=in.nextLine(); 
        int len1=s.length();
       
        String str="keyence";
        int len=str.length();
        int pos=s.indexOf(str);
        int pos3=s.lastIndexOf(str);
        if(pos==0||pos==len1-len)
        {
    		System.out.println("YES");
    		return ;
    		}
        for(int i=1;i<len-1;i++)
        {
        	int pos1=s.indexOf(str.substring(0,i));
        	int pos2=s.lastIndexOf(str.substring(i,len));
        	if(pos1!=-1&&pos2!=-1)
        	{
        		//System.out.println(str.substring(i,len)+" "+str.substring(0,i)+" "+pos2+" "+i);
        		if(pos2+len-i-1==len1-1&&pos1==0)
        		{
        		System.out.println("YES");
        		return ;
        		}
        	}
        }
     	
    
    		System.out.println("NO");	
     	
    }

	}
	
 
	
}