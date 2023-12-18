import java.util.*;
import java.io.*;

class Main
{
  	static int gcd(int a, int b)
    {
      	int c = 0;
      while(b>0)
      {
        c = a;
        a = b;
        b = c%b;
      }
      return a;
    }
  	public static void main(String[] args)
    {
		Scanner s = new Scanner(System.in);
      	int n = s.nextInt();
      	int[] a = new int[n];
      	int[] b = new int[n];
      	int[] c = new int[n];
      	for(int i = 0 ; i<n ; i++)a[i] = s.nextInt();
      	int sum = 0;
      	b[0] = a[0];
      	for(int i = 1 ;  i<n ;i++)
        {
        	b[i] = gcd(b[i-1], a[i]); 	
        }
      	c[n-1] = a[n-1];
      	for(int i = n-2 ;  i>=0 ;i--)
        {
        	c[i] = gcd(c[i+1], a[i]); 	
        }
      	
      	int ans = 0;
		ans = Math.max(ans, c[1]);
      	ans = Math.max(ans, b[n-2]);
      	for(int i = 1 ;  i<n-1 ;i++)
        {
          	
        	ans = Math.max(ans, gcd(b[i-1], c[i+1]));
        }
      
      	System.out.println(ans);
    }
}