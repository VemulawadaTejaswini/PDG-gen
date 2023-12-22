import java.util.*;
import java.io.*;
import java.math.*;

public class Main
{
    //Code referenced from : https://www.geeksforgeeks.org/queries-for-number-of-distinct-elements-in-a-subarray-set-2/
    static TreeSet<Integer>[] segment; 
    static int arr[];

    // Build the segment tree 
    // i denotes current node, s denotes start and 
    // e denotes the end of range for current node 
    static void build(int i, int s, int e, int[] arr) 
    { 
  
        // If start is equal to end then 
        // insert the array element 
        if (s == e) 
        { 
            segment[i].add(arr[s]); 
            return; 
        } 
  
        // Else divide the range into two halves 
        // (start to mid) and (mid+1 to end) 
        // first half will be the left node 
        // and the second half will be the right node 
        build(2 * i, s, (s + e) / 2, arr); 
        build(1 + 2 * i, 1 + (s + e) / 2, e, arr); 
  
        // Insert the sets of right and left 
        // node of the segment tree 
        segment[i].addAll(segment[2 * i]); 
        segment[i].addAll(segment[2 * i + 1]); 
    } 
  
    // Query in an range a to b 
    static TreeSet<Integer> query(int node, int l,  
                                int r, int a, int b) 
    { 
        TreeSet<Integer> left = new TreeSet<>(); 
        TreeSet<Integer> right = new TreeSet<>(); 
        TreeSet<Integer> result = new TreeSet<>(); 
  
        // If the range is out of the bounds 
        // of this segment 
        if (b < l || a > r) 
            return result; 
  
        // If the range lies in this segment 
        if (a <= l && r <= b) 
            return segment[node]; 
  
        // Else query for the right and left 
        // leaf node of this subtree 
        // and insert them into the set 
        left = query(2 * node, l, (l + r) / 2, a, b); 
        result.addAll(left); 
  
        right = query(1 + 2 * node, 1 + (l + r) / 2, r, a, b); 
        result.addAll(right); 
  
        // Return the result 
        return result; 
    } 
  
    // Initialize the segment tree 
    @SuppressWarnings("unchecked") 
    static void init(int n)  
    { 
  
        // Get the height of the segment tree 
        int h = (int) Math.ceil(Math.log(n) / Math.log(2)); 
        h = (int) (2 * Math.pow(2, h)) - 1; 
  
        // Initialize the segment tree 
        segment = new TreeSet[h]; 
        for (int i = 0; i < h; i++) 
            segment[i] = new TreeSet<>(); 
    } 
  
    // Function to get the result for the 
    // subarray from arr[l] to arr[r] 
    static void getDistinct(int l, int r, int n) 
    { 
  
        // Query for the range set 
        TreeSet<Integer> ans = query(1, 0, n - 1, l, r); 
        pn(ans.size());
    } 

    public static void process(int test_number)throws IOException
    {
        int n = ni(), q = ni();
        arr = new int[n + 1];
        for(int i = 1; i <= n; i++)
            arr[i-1] = ni();


        init(n+1);
        build(1, 0, n - 1, arr); 

        while(q-- > 0){
            int l = ni(), r = ni();
            getDistinct(l-1, r-1, n);
        }
    }
 
    static final long mod = (long)1e9+7l;
    
    static FastReader sc;
    static PrintWriter out;
    public static void main(String[]args)throws IOException
    {
        out = new PrintWriter(System.out);
        sc = new FastReader();
 
        long s = System.currentTimeMillis();
        int t = 1;
        //t = ni();
        for(int i = 1; i <= t; i++)
            process(i);
 
        out.flush();
        System.err.println(System.currentTimeMillis()-s+"ms");
    }

    static void trace(Object... o){ System.err.println(Arrays.deepToString(o)); };
    static void pn(Object o){ out.println(o); }
    static void p(Object o){ out.print(o); }
    static int ni()throws IOException{ return Integer.parseInt(sc.next()); }
    static long nl()throws IOException{ return Long.parseLong(sc.next()); }
    static double nd()throws IOException{ return Double.parseDouble(sc.next()); }
    static String nln()throws IOException{ return sc.nextLine(); }
    static long gcd(long a, long b)throws IOException{ return (b==0)?a:gcd(b,a%b);}
    static int gcd(int a, int b)throws IOException{ return (b==0)?a:gcd(b,a%b); }
    static int bit(long n)throws IOException{ return (n==0)?0:(1+bit(n&(n-1))); }
    
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 
    } 
}
