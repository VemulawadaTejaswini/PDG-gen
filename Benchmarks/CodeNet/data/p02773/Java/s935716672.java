import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class atco160b
{
	static void merge(int arr[], int l, int m, int r) 
    { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
        int i = 0, j = 0; 
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
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
    static void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            int m = (l+r)/2; 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
            merge(arr, l, m, r); 
        } 
    } 
    static int gcd(int a, int b) 
    { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    } 
    static long power(long n,long m)
    {
    	if(m==0)
    		return 1;
    	long ans=1;
    	while(m>0)
    	{
    		ans=ans*n;
    		m--;
    	}
    	return ans;
    }
    static int binarySearch(int arr[], int x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
            if (arr[m] == x) 
                return m; 
            if (arr[m] < x) 
                l = m + 1; 
            else
                r = m - 1; 
        } 
        return -1; 
    } 
	public static void main(String args[])throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		long n=Long.parseLong(br.readLine());
		HashMap <String,Integer> mp=new HashMap<String,Integer> ();
		ArrayList<String> arrli=new ArrayList<String>();
		int max=0;
	    for(int i=0;i<n;i++)
	    {
	        String s;
	        s=br.readLine();
	        if(!mp.containsKey(s))
	        {
	             mp.put(s,1);
	             continue;
	        }
	        else
	        {
	            int temp=mp.get(s);
	            temp++;
	            mp.put(s,temp);
	            if(temp==max)
	            	arrli.add(s);
	            else
	            {
	            	max=temp;
	            	arrli.clear();
	            	arrli.add(s);
	            }
	        }
	    }
	    Collections.sort(arrli);
	    int t=arrli.size();
	    for(int i=0;i<t;i++)
	    System.out.println(arrli.get(i));
	}
}
