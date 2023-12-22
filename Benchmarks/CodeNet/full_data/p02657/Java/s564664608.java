import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)throws IOException
	 {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
			int n=Integer.parseInt(st.nextToken());
         int m=Integer.parseInt(st.nextToken());
		System.out.println(n*m);
	 }
	 
	//calculate (m+n)!/(m!*n!)
	static int maxPath(int m,int n)
	{
	    
	    if(m==1 || n==1)
	        return 1;
	   m--;n--;
	   if(m<n)
	   {
	       m=m+n;
	       n=m-n;
	       m=m-n;
	   }
	   int res=1,j=1;
	   for(int i=m+1;i<=(m+n);i++,j++)
	   {
	       res*=i;
	       res/=j;
	   }
	   return res;
	}
	static int modDivide(int a,int b,int m)
	{
	    a = a % m ;
        int inv = modInverse(b,m);
        System.out.println("inv "+inv);
        if(inv==-1)
            return -1;
        return (inv*a) % m;
	}
	static int modInverse(int b,int m)
	{
	    int g=gcd(b,m);
	    
	    if(g!=1)
	        return -1;
	    //If b and m are relatively prime,  
        //then modulo inverse is b^(m-2) mode 
      return power(b,m-2,m);
	}
	// a^p%m
	static int power(int x, int y, int p) 
    { 
        // Initialize result 
        int res = 1;      
         
        // Update x if it is more   
        // than or equal to p 
        x = x % p;  
  
       if (x == 0) return 0; // In case x is divisible by p;    
  
        while (y > 0) 
        { 
            // If y is odd, multiply x 
            // with result 
            if((y & 1)==1) 
                res = (res * x) % p; 
      
            // y must be even now 
            // y = y / 2 
            y = y >> 1;  
            x = (x * x) % p;  
        } 
        return res; 
    } 
    
	//Euclidean algorithms
	static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
          
        return gcd(b%a, a); 
    } 
	static int[] array(StringTokenizer st,int a)
	{
		int y[]=new int[a];
		int p=0;
		while(st.hasMoreTokens())
		{
			y[p]=Integer.parseInt(st.nextToken());
			p++;
		}
		return y;
	}
	 static int lis(int arr[])
	 {
	     int lis[]=new int[arr.length];
	     for(int i=0;i<arr.length;i++)
	        lis[i]=1;
	     for(int i=1;i<arr.length;i++)
	     {
	         for(int j=0;j<i;j++)
	         {
	             if(arr[i]>arr[j] && lis[i]<lis[j]+1)
	                lis[i]=lis[j]+1;
	         }
	     }
	     int max=1;
	     for(int i=0;i<lis.length;i++)
	        if(lis[i]>max)
	            max=lis[i];
	   return max;
	 }
	 static long max(long a)
	{
		long max=0;
		while(a>0)
		{
			if(a%10>max)
			{
				max=a%10;
			}
			a/=10;
		}
		return max;
	}
	static long min(long a)
	{
		long min=1000;
		while(a>0)
		{
			if(a%10<min)
			{
				min=a%10;
			}
			a/=10;
		}
		return min;
	}
}