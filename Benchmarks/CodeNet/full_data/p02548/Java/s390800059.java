import java.io.*;
import java.util.*;
class Main
{
	 public static void  main (String[] args) throws IOException
    {
       try{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int a=0;
       a=Integer.parseInt(br.readLine());
       long sum=0;int c=1;
       for(int i=1;i<=a;i++)
       {
       	sum+=(a-1)/i;
       }
       System.out.println(sum);
   }
    catch(Exception e){}
}}
