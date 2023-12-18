import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
	public static long sumXOR(long arr[], int n) 
    { 
    	long mod= (long)1e9+7;
        long sum = 0; 
        for (int i = 0; i < 64; i++)  
        { 
            // Count of zeros and ones 
            int zc = 0, oc = 0;  
              
            // Individual sum at each bit position 
            long idsum = 0;  
              
            for (int j = 0; j < n; j++) 
            { 
                if (arr[j] % 2 == 0) 
                    zc++; 
                      
                else
                    oc++; 
                arr[j] /= 2; 
            } 
              
            // calculating individual bit sum  
            long k=(long)(1 << i);
            k%=mod;
            idsum = (long) oc * zc * k;  
      
            // final sum  
            sum = (sum+idsum)%mod;  
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
      //long res=sumXOR(arr,n);
      long res=0;
      if(n<10000){
      	long mod= (long)1e9+7;
      for(int i=0;i<n;i++){
      	for(int j=i+1;j<n;j++){
      		long k=arr[i]^arr[j];
      		res=(res+k)%mod;
      	}
      }
      }
      else{res=sumXOR(arr,n);}
      System.out.println(res);
      }
        }
    
