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
        int c=0;
        long l=Long.parseLong(st.nextToken());
        long r=Long.parseLong(st.nextToken());
        long aa=l%2019;
        long bb=r%2019;
        long min=99999l;
        long val=l;
        int cc=0;
        for(long x=l;x<r;x++)
        {
        	cc++;
        	if(cc==2021)
        		break;
        	if((x%2019)<min)
        	{
        		min=(x%2019);
        		val=x;
        	}
        }
        long min2=99999l;
        cc=0;
        for(long x=val+1;x<=r;x++)
        {
        	cc++;
        	if(cc==2021)
        		break;
        	if((x%2019)<min2)
        	{
        		min2=(x%2019);
        		
        	}
        }
        
        //long d=Long.parseLong(br.readLine());
//        while(st.hasMoreTokens())
//        {
//        	long aa=Long.parseLong(st.nextToken());
//        	
//        }
        System.out.println((min*min2)%2019);
    }
}