 
import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.Stack;
 


public class Main { 
  	public static class FastReader {
		BufferedReader br;
		StringTokenizer root;
		
 
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (root == null || !root.hasMoreTokens()) {
				try {
					root = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return root.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
 
		double nextDouble() {
			return Double.parseDouble(next());
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
 
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception r) {
				r.printStackTrace();
			}
			return str;
		}
	}
// Returns LCM of arr[0..n-1]  
    static long LCM(int arr[], int n) { 
        // Find the maximum value in arr[]  
        int max_num = 0; 
        for (int i = 0; i < n; i++) { 
            if (max_num < arr[i]) { 
                max_num = arr[i]; 
            } 
        } 
  
        // Initialize result  
        long res = 1; 
  
        // Find all factors that are present in  
        // two or more array elements.  
        int x = 2; // Current factor.  
        while (x <= max_num) { 
            // To store indexes of all array  
            // elements that are divisible by x.  
            Vector<Integer> indexes = new Vector<>(); 
            for (int j = 0; j < n; j++) { 
                if (arr[j] % x == 0) { 
                    indexes.add(indexes.size(), j); 
                } 
            } 
  
            // If there are 2 or more array elements  
            // that are divisible by x.  
            if (indexes.size() >= 2) { 
                // Reduce all array elements divisible  
                // by x.  
                for (int j = 0; j < indexes.size(); j++) { 
                    arr[indexes.get(j)] = arr[indexes.get(j)] / x; 
                } 
  
                res = res * x; 
            } else { 
                x++; 
            } 
        } 
  
        // Then multiply all reduced array elements  
        for (int i = 0; i < n; i++) { 
            res = res * arr[i]; 
        } 
  
        return res; 
    } 
  
// Driver code  
    public static void main(String[] args) { 
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int[] arr = new int[n];
        int b[] = new int[arr.length]; 


        for(int i=0;i<n;++i) arr[i] = sc.nextInt();
        // Copy elements of a[] to b[] 
        for (int i=0; i<n; i++) 
            b[i] = arr[i]; 
        long lcm = LCM(arr, n);
        long counter = 0;
        for(int i=0;i<n;++i){
            counter = counter + (lcm / b[i]);
        } 
        counter %= 1000000007;
        System.out.println(counter); 
    } 
} 