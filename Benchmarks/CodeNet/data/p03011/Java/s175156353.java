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
	 private static int gcd(int n, int l) {
	        if (l == 0)
	            return n;
	        return gcd(l, n % l);
	    }
//	 public static void dfs(ArrayList<Integer>[] gr,int v,int[] ans,HashMap<Integer,HashMap<Integer,Integer>> map)
//	    {
//	         vis[v]=true;
//	         ArrayList<Integer> arr=gr[v];
//	         for(int i=0;i<arr.size();i++)
//	         {
//	             if(!vis[arr.get(i)])
//	             {  
//	            	 
//	            	 dfs(gr,arr.get(i));
//	             }
//	         }
//	    }
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
	            	return this.v-arg0.v;
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
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();int q=sc.nextInt();int r=sc.nextInt();
		System.out.println(Math.min(p+q, Math.min(q+r, p+r)));
	}
}
