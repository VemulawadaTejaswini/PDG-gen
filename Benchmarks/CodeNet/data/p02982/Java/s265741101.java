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
        long n=Long.parseLong(st.nextToken());
        long d=Long.parseLong(st.nextToken());
        
        long ar[][]=new long[(int)n][(int)d];
        for(int x=0;x<n;x++)
        {
        	st=new StringTokenizer(br.readLine());
        	for(int y=0;y<d;y++)
        	{
        		ar[x][y]=Long.parseLong(st.nextToken());
        	}
        }
        for(int x=0;x<n-1;x++)
        {
        	//st=new StringTokenizer(br.readLine());
        	
        	for(int y=x+1;y<n;y++)
        	{
        		double s=0.0;
        		for(int z=0;z<d;z++)
            	{
            	s+=(ar[x][z]-ar[y][z])*(ar[x][z]-ar[y][z]);
            	}
        		s=Math.sqrt(s);
        		if(s==(double)((int)s))
        		{
        			c++;
        		}
        	}
        }
        //long d=Long.parseLong(br.readLine());
//        while(st.hasMoreTokens())
//        {
//        	long aa=Long.parseLong(st.nextToken());
//        	
//        }
        System.out.println(c);
    }
}