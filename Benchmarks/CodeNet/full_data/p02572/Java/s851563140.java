//package hiougyf;
import java.io.*;
import java.util.*;

public class Main {
	  public static void main(String[] args) throws IOException
	    {
		 Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		long cs=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			cs=(cs+a[i]);
		}
		long ans=0;
		for(int i=0;i<(n-1);i++) {
			cs-=a[i];
			ans=(ans+(a[i]*cs))%1000000007;
			
		}
		System.out.println(ans%(1000000007));
	    }
		static int div(int n,int b) {
			int g=-1;
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0&&i!=b) {
					g=i;
					break;
				}
			}
			return g;
		}
	    
	  
	  public static int gcd(int a, int b) 
	    { 
	        if (a == 0) 
	            return b; 
	          
	        return gcd(b%a, a); 
	    } 
	   public static int lcm(int a, int b)  
	  {  
	     return (a*b)/gcd(a, b);  
	  }  
	   public static boolean isPrime1(int n) {
           if (n <= 1) {
               return false;
           }
           if (n == 2) {
               return true;
           }
           for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
               if (n % i == 0) {
                   return false;
               }
           }
           return true;
       }
       public static boolean isPrime(int n) {
           if (n <= 1) {
               return false;
           }
           if (n == 2) {
               return true;
           }
           if (n % 2 == 0) {
               return false;
           }
           for (int i = 3; i <= Math.sqrt(n) + 1; i = i + 2) {
               if (n % i == 0) {
                   return false;
               }
           }
           return true;
       }
	      
	
}

  
