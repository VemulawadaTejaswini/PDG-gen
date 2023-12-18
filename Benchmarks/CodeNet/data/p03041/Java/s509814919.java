import java.io.*;
import java.math.*;
import java.security.KeyStore.Entry;
import java.util.*;
public class Main {
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
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int k=sc.nextInt()-1;
		sc.nextLine();
		String s=sc.nextLine();
		for(int i=0;i<n;i++)
		{
			if(i!=k)
				System.out.print(s.charAt(i));
			else
				System.out.print(Character.toLowerCase(s.charAt(i)));
		}
	}
}
