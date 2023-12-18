import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
	public static long sumXOR(long arr[], int n) 
    { 
    	long mod= (long)1e9+7;
        long sum = 0; 
        for (long i = 0; i < 63; i++)  
        { 
            long zc = 0;  
            long idsum = 0;  
            long k=(long)(1l << i);
            for (int j = 0; j < n; j++) 
            { 
                if ((arr[j]&k)==0) 
                    {zc++;}  
            }             
            k%=mod;
            long x=(long)zc*(n-zc);
            x%=mod;
            idsum = (long) x*k;  
            sum = (long)(sum+idsum)%mod;  
        } 
        return sum; 
    } 
public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      long[] arr=new long[n];
      for(int i=0;i<n;i++){
      	arr[i]=s.nextLong();
      } 	
      long res=sumXOR(arr,n);
      System.out.println(res);
      }
        }
    
