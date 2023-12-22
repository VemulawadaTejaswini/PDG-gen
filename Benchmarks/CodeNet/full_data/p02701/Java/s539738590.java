import java.util.*;
import java.io.*;
import java.math.*;
class Main
{
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
    public static void main(String args[])
    {
    	FastReader sc=new FastReader();
        int n=sc.nextInt();
        String a[]=new String[n];
        String a2[]=new String[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            String s=sc.nextLine();
            a[i]=s;          
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i].equalsIgnoreCase(a[j]))
                {
                    sum=sum+1;
                }
            }
        }
        if((n-sum)>0)
        {
            System.out.println(n-sum);
        }
        else
        {
            System.out.println("1");
        }
    }
}