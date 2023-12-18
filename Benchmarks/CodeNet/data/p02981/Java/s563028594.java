								//package Dynamic;
import java.io.*;
import java.util.*;
class Main 
{
    static public void main(String[] args) throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        //int t=Integer.parseInt(br.readLine());
        //long n=Long.parseLong(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        long a=Long.parseLong(st.nextToken());
        long b=Long.parseLong(st.nextToken());
        long c=Long.parseLong(st.nextToken());
//        int ar[]=new int[n];
//        for(int x=0;x<n;x++)
//        {
//        	
//        }
        //long d=Long.parseLong(br.readLine());
//        while(st.hasMoreTokens())
//        {
//        	long aa=Long.parseLong(st.nextToken());
//        	
//        }
        System.out.println(Math.min(a*b,c));
    }
}