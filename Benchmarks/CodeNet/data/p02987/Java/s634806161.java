import java.io.*;
import java.math.*;
import java.security.KeyStore.Entry;
import java.util.*;

public class Main {
	private static boolean[] vis;
	private static long[] dist;
	private static long mod = 1000000000 + 7;
	public static void merge(int arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
	 public static void sort(int arr[], int l, int r) 
	    { 
	        if (l < r) 
	        { 
	            // Find the middle point 
	            int m = (l+r)/2; 
	  
	            // Sort first and second halves 
	            sort(arr, l, m); 
	            sort(arr , m+1, r); 
	  
	            // Merge the sorted halves 
	            merge(arr, l, m, r); 
	        } 
	    } 
	 private static long gcd(long n, long l) {
	        if (l == 0)
	            return n;
	        return gcd(l, n % l);
	    }
	 private static int gcd(int n, int l) {
	        if (l == 0)
	            return n;
	        return gcd(l, n % l);
	    }
	 public static void dfs(ArrayList<Integer>[] gr,int v)
	    {
	         vis[v]=true;
	         ArrayList<Integer> arr=gr[v];
	         for(int i=0;i<arr.size();i++)
	         {
	             if(!vis[arr.get(i)])
	             {  
	            	 
	            	 dfs(gr,arr.get(i));
	             }
	         }
	    }
	 private static class Pairs implements Comparable<Pairs>{
	        String v;int i;int j;
	        public Pairs(String a,int b,int c){
	            v=a;
	            i=b;
	            j=c;
	        }
	        @Override
	        public int compareTo(Pairs arg0) {
	            {
	            	if(!this.v.equals(arg0.v))
	            		return this.v.compareTo(arg0.v);
	            	else
	            		return arg0.i-this.i;
	            }
	        }
	    }
	 private static class Pair implements Comparable<Pair>{
	        int v,i;Pair j;
	        public Pair(int a,int b){
	            v=a;
	            i=b;
	        }
	        public Pair(int a,Pair b)
	        {
	            v=a;
	            j=b;
	        }
	        @Override
	        public int compareTo(Pair arg0) {
	            {
	            	if(this.i!=arg0.i)
	            		return this.i-arg0.i;
	            	else
	            		return arg0.v-this.v;
	            }
	        }
	    }
	 public static long mmi(long a, long m) 
	    { 
	        long m0 = m; 
	        long y = 0, x = 1; 
	      
	        if (m == 1) 
	          return 0; 
	      
	        while (a > 1) 
	        { 
	            // q is quotient 
	            long q = a / m; 
	            long t = m; 
	      
	            // m is remainder now, process same as 
	            // Euclid's algo 
	            m = a % m; a = t; 
	            t = y; 
	      
	            // Update y and x 
	            y = x - q * y; 
	            x = t; 
	        } 
	      
	        // Make x positive 
	        if (x < 0) 
	           x += m0; 
	      
	        return x; 
	    }
	private static long pow(long a, long b, long c) {
	        if (b == 0)
	            return 1;
	        long p = pow(a, b / 2, c);
	        p = (p * p) % c;
	        return (b % 2 == 0) ? p : (a * p) % c;
	    }
	public static int ub(ArrayList<Integer> array, int low,int high, int value) {
        while (low < high) {
            final int mid = (low + high) / 2;
            if (value >= array.get(mid)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
	}
	public static long fun(long r,long p)
	{
		long ans=0;
		if(r%4==0)
		{
			long x=(r-2)/2;
			long[][] f= {{3,0},{3,1}};
			long[][] m= {{3,0},{3,1}};
			long odd=power(f,x,m,p);
			long et=r/4;
			long twot=(2*(et%p))%p;
			long[][] g= {{9,0},{9,1}};
			long[][] h= {{9,0},{9,1}};
			long maint=power(g,et-1,h,p);
			maint=(6*maint)%p; 
			maint=(maint+twot)%p;
			ans=(maint+odd)%p;
		}
		if(r%4==1)
		{
			long x=(r-1)/2;
			long odd=pow(3,x,p);
			long main=fun(r-1,p);
			ans=(main+odd)%p;
		}
		if(r%4==2)
		{
			if(r==2)
				ans=2;
			else
			{
				long main=fun(r-1,p);
				long x=(r-2)/4;
				long[][] u= {{9,0},{9,1}};
				long[][] v= {{9,0},{9,1}};
				long odd1=power(u,x-1,v,p);long odd2=odd1;
				odd1=(odd1*18)%p;
				odd2=(odd2*6)%p;
				long odd=(odd1-odd2+p)%p;
				odd=(odd+1)%p;
				ans=(odd+main)%p;
			}
		}
		if(r%4==3)
		{
			long main=fun(r-1,p);
			long odd=pow(3,(r-1)/2,p);
			ans=(main+odd)%p;
		}
		return ans;
	}
	static void multiply(long a[][], long b[][],long p) 
    { 
        // Creating an auxiliary matrix to  
        // store elements of the  
        // multiplication matrix 
        long mul[][] = new long[2][2]; 
        for (int i = 0; i < 2; i++) 
        { 
            for (int j = 0; j < 2; j++) 
            { 
                mul[i][j] = 0; 
                for (int k = 0; k < 2; k++) 
                    mul[i][j] =(mul[i][j]+ (a[i][k] 
                                * b[k][j])%p)%p; 
            } 
        }
        for (int i=0; i<2; i++) 
            for (int j=0; j<2; j++) 
              
                // Updating our matrix 
                a[i][j] = mul[i][j];  
    } 
	static long power(long F[][], long n,long M[][],long p) 
    { 
		if(n==0)
			return 1;
        if (n == 1) 
            return F[1][0] + F[1][1]; 
      
        power(F, n/2,M,p); 
      
        multiply(F, F,p); 
      
        if (n%2 != 0) 
            multiply(F ,M,p); 
        return F[1][0] + F[1][1];
    } 
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		if(set.size()==2)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
