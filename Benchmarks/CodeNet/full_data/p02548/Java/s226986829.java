/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
// import java.math.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            PrintWriter ot=new PrintWriter(System.out);
            int n=Integer.parseInt(br.readLine().trim());
            int total=0;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n/i;j++)
                {
                    for(int k=1;k<=n-(i*j);k++)
                    {
                        int temp=i*j+k;
                        if(temp==n)
                        total++;
                    }
                }
            }
            ot.println(total);

            // while(t-->0)
            // {
                
            // }
            br.close();
            ot.close();
                        
        } catch(Exception e){
            System.err.println("ERROR");
            return;
        }
    }
}
    