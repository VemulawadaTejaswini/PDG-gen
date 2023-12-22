import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
 
public class template
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
    public static void main (String[] args) 
	{
        //code by sushant kumar
        FastReader in=new FastReader();
        int n=in.nextInt();
        int m=in.nextInt();
        int k=in.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        for(int i=0;i<n;i++)
        {
            arr1[i]=in.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            arr2[i]=in.nextInt();
        }
        int i1=0;
        int i2=0;
        while(k>0)
        {
            if(i1<n&&i2<m)
            {
                if(arr1[i1]<=arr2[i2])
                {
                if(k>=arr1[i1])
                    {
                        
                        
                        k-=arr1[i1];
                        i1+=1;
                       
                    }
                else
                    break;
                }
            
                else if(arr1[i1]>arr2[i2])
                {
                if(k>=arr2[i2])
                    {
                        
                        
                        k-=arr2[i2];
                        i2+=1;
                        
                    }
                else
                    break;
            }

            }
            else if(i1>=n&&i2<m)
            {
                if(k>=arr2[i2])
                    {
                        k-=arr2[i2];
                        i2+=1;
                    }
                else
                    break;
            }
            else if(i2>=m&&i1<n)
            {
                if(k>=arr1[i1])
                    {
                        k-=arr1[i1];
                        i1+=1;
                    }
                else
                    break;

            }
          	else
                break;
          

        }
        System.out.println(i1+i2);
       
    }
}