import java.util.*;
 import java.io.*;
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
public class Main {
    public static void main(String args[] ) throws Exception {
     
        Scanner s = new Scanner(System.in);
 
	int n=s.nextInt();
      long a[]=new long[n];
      for(int i=0;i<n;i++)
        a[i]=s.nextLong();
      System.out.println(pair(a,n));
    }
static long pair(long arr[], int n) 
{ 
    long ans = 0; // Initialize result 
  
    // Consider all pairs (arr[i], arr[j) such that 
    // i < j 
    for (int i = 0; i < n; i++) 
        for (int j = i + 1; j < n; j++) 
            ans = (ans+((arr[i]%1000000007) ^ (arr[j]%1000000007))%1000000007); 
  
    return (ans%1000000007); 
}
}