
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
public class Main{
	static long mod=1000000007;
	 static long maxProduct(long A[], int n, int k) 
	    { 
	        Arrays.sort(A); 
	        long product = 1; 
	        if (A[n - 1] == 0 && k % 2 != 0) 
	            return 0; 
	        if (A[n - 1] <= 0 && k % 2 != 0) { 
	            for (int i = n - 1; i >= n - k; i--) 
	            {
	            	product=(product*A[i]+mod)%mod; 
	            }
	            return (product+mod)%mod; 
	        } 
	        int i = 0; 
	        int j = n - 1; 
	        if (k % 2 != 0) { 
	            product=(product*A[j])%mod; 
	            j--; 
	            k--; 
	        }
	        k >>= 1; 
	        for (int itr = 0; itr < k; itr++) { 
	            long left_product = (A[i] * A[i + 1])%mod; 
	            long right_product = (A[j] * A[j - 1])%mod; 
	            if (left_product > right_product) { 
	                product=(product*left_product)%mod; 
	                i += 2; 
	            } 
	            else { 
	                product=(product*right_product)%mod; 
	                j -= 2; 
	            } 
	        } 
	        return (product+mod)%mod; 
	} 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] cmd=br.readLine().split(" ");
		int n=Integer.valueOf(cmd[0]);
		int k=Integer.valueOf(cmd[1]);
		long[] arr=new long[n];
		cmd=br.readLine().split(" ");
		for(int i=0;i<n;i++)
		{
			arr[i]=Long.valueOf(cmd[i]);
		}
		System.out.println(maxProduct(arr,n,k));
	}
}
