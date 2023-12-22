/*
    Arnab Chanda 
*/

// All imports here

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

// Template code starts here //

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Debugger debug = new Debugger(out);
        Objectify objectify = new Objectify(debug);
        Task solver = new Task();
        int test = 1;
        while(test-->0){
            solver.solve(1, in, out, debug, objectify);
        }
		out.close();
	}
}

class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;
 
    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }
 
    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }
 
    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public Double nextDouble() {
        return Double.parseDouble(next());
    }

    public float nextFloat() {
        return Float.parseFloat(next());
    }
 
}

class Debugger{
    PrintWriter out;

    Debugger(PrintWriter out){    
        this.out = out;
    }

    public <T> void printList(List<T> arrayList){
        for( Object ob: arrayList){
            out.print(ob+" ");
        }
        out.println();
    }

    public <T> void printSet(Set<T> set){
        for(Object ob: set){
            out.print(ob+" ");
        }
        out.println();
    }

    public <T> void printMap(Map<?,?> map){
        for(Object ob: map.keySet()){
            System.out.println(ob+" : "+map.get(ob));
        }
    }
}

class Objectify{
    
    Debugger debug;

    Objectify(Debugger ob){ debug = ob; }

    public void printArr(int[] arr){ debug.printList(Arrays.stream(arr).boxed().collect(Collectors.toList())); }
    public void printArr(double[] arr){ debug.printList(Arrays.stream(arr).boxed().collect(Collectors.toList())); }
    public void printArr(long[] arr){ debug.printList(Arrays.stream(arr).boxed().collect(Collectors.toList())); }
    public void printArr(char[] arr){ debug.printList( String.valueOf(arr).chars().mapToObj(c -> (char) c).collect(Collectors.toList())); }
    public void printArr(String[] arr){ debug.printList(Arrays.asList(arr)); }

    public void printMatrix(int[][] arr){ for(int a[]:arr) printArr(a); }
    public void printMatrix(double[][] arr){ for(double a[]:arr) printArr(a); }
    public void printMatrix(long[][] arr){ for(long a[]:arr) printArr(a); }
    public void printMatrix(char[][] arr){ for(char a[]:arr) printArr(a); }
    public void printMatrix(String[][] arr){ for(String a[]:arr) printArr(a); }

}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Template code ends here


class Task {

    final long MOD = (int)Math.pow(10,9)+7;

    public void solve(int testNumber, InputReader sc, PrintWriter out, Debugger debug, Objectify objectify) {
        
        // write your code here
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        long ans = maxProductSubarrayOfSizeK(arr, n, k);
        if (ans < 0){
            out.println(ans+MOD);
        }else{
            out.println(ans);
        }
        
    }

    public long maxProductSubarrayOfSizeK(int A[], int n, int k) 
    { 
        // sorting given input array 
        Arrays.sort(A); 
  
        // variable to store final product of all element 
        // of sub-sequence of size k 
        long product = 1; 
  
        // CASE I 
        // If max element is 0 and 
        // k is odd then max product will be 0 
        if (A[n - 1] == 0 && k % 2 != 0) 
            return 0; 
  
        // CASE II 
        // If all elements are negative and 
        // k is odd then max product will be 
        // product of rightmost-subarray of size k 
        if (A[n - 1] <= 0 && k % 2 != 0) { 
            for (int i = n - 1; i >= n - k; i--) 
                product = (product * (A[i]%MOD))%MOD; 
            return product; 
        } 
  
        // else 
        // i is current left pointer index 
        int i = 0; 
  
        // j is current right pointer index 
        int j = n - 1; 
  
        // CASE III 
        // if k is odd and rightmost element in 
        // sorted array is positive then it 
        // must come in subsequence 
        // Multiplying A[j] with product and 
        // correspondingly changing j 
        if (k % 2 != 0) { 
            product = (product * (A[j]%MOD))%MOD; 
            j--; 
            k--; 
        } 
  
        // CASE IV 
        // Now k is even 
        // Now we deal with pairs 
        // Each time a pair is multiplied to product 
        // ie.. two elements are added to subsequence each time 
        // Effectively k becomes half 
        // Hence, k >>= 1 means k /= 2 
        k >>= 1; 
  
        // Now finding k corresponding pairs 
        // to get maximum possible value of product 
        for (int itr = 0; itr < k; itr++) { 
            // product from left pointers 
            long left_product = (A[i]%MOD * A[i + 1]%MOD)%MOD; 
  
            // product from right pointers 
            long right_product = (A[j]%MOD * A[j - 1]%MOD)%MOD; 
  
            // Taking the max product from two choices 
            // Correspondingly changing the pointer's position 
            if (left_product > right_product) { 
                product = (product * left_product)%MOD; 
                i += 2; 
            } 
            else { 
                product = (product * right_product)%MOD; 
                j -= 2; 
            } 
        } 
  
        // Finally return product 
        return product; 
    } 
}