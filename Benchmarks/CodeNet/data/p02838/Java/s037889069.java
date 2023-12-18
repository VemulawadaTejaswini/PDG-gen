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
      System.out.println(findXor(a,n));
    }
static long findXor(long arr[], int n) 
    { 
      
        // Calculate xor of all the 
        // elements 
        long xoR = 0; 
        for (int i = 0; i < n; i++) { 
            xoR = (xoR ^ arr[i])%1000000007; 
        } 
      
        // Return twice of xor value 
        return (xoR * 2)%1000000007; 
    }
}