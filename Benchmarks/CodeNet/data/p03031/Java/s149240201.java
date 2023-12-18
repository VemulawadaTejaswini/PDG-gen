import java.io.*;
import java.math.*;
import java.security.KeyStore.Entry;
import java.util.*;

public class Main {
	private static boolean[] vis;
	private static long[] dist;
	public static void merge(long arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        long L[] = new long [n1]; 
        long R[] = new long [n2]; 
  
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
	 public static void sort(long arr[], int l, int r) 
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
	 public static void dfs(ArrayList<Pair>[] gr,int v)
	    {
	         vis[v]=true;
	         ArrayList<Pair> arr=gr[v];
	         for(int i=0;i<arr.size();i++)
	         {
	             if(!vis[arr.get(i).v])
	             {  
	            	 dfs(gr,arr.get(i).v);
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
	            	return this.v-arg0.v;
	            }
	        }
	    }
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<Integer>[] arr=new ArrayList[m+1];
		for(int i=0;i<=m;i++)	arr[i]=new ArrayList<>();
		int[] p=new int[m];
		for(int i=1;i<=m;i++)
		{
			int s=sc.nextInt();
			for(int j=0;j<s;j++)
				arr[i].add(sc.nextInt());
		}
		for(int i=0;i<m;i++)	p[i]=sc.nextInt();
		int cc=0;
		for(int mask=0;mask<(1<<n);mask++)
		{
			boolean flag=true;
			for(int i=1;i<=m;i++)
			{
				int count=0;
				for(int j=0;j<arr[i].size();j++)
				{
					if((mask&(1<<(arr[i].get(j)-1)))!=0)
						{count++;}
				}
				//System.out.println(i+" "+mask+" "+count);
				if(count%2!=p[i-1])
					flag=false;
			}
			if(flag)
				cc++;
		}
		System.out.println(cc);
	}
}
