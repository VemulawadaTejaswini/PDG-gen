import java.util.*;
import java.io.*;

 public class Main{
// taking inputs
static BufferedReader s1;
static BufferedWriter out;
static String read() throws IOException{String line="";while(line.length()==0){line=s1.readLine();continue;}return line;}
static int int_v (String s1){return Integer.parseInt(s1);}
static long long_v(String s1){return Long.parseLong(s1);}
static int[] int_arr() throws IOException{String[] a=read().split(" ");int[] b=new int[a.length];for(int i=0;i<a.length;i++){b[i]=int_v(a[i]);}return b;}
static long[] long_arr() throws IOException{String[] a=read().split(" ");long[] b=new long[a.length];for(int i=0;i<a.length;i++){b[i]=long_v(a[i]);}return b;}
static void assign(){s1=new BufferedReader(new InputStreamReader(System.in));out=new BufferedWriter(new OutputStreamWriter(System.out));}
static long Modpow(long a,long p,long m){long res=1;while(p>0){if((p&1)!=0){res=(res*a)%m;}p >>=1;a=(a*a)%m;}return res;}
static long Modmul(long a,long b,long m){return ((a%m)*(b%m))%m;}
static long ModInv(long a,long m){return Modpow(a,m-2,m);}
static long nck(int n,int r,long m){if(r>n){return 0l;}return Modmul(f[n],ModInv(Modmul(f[n-r],f[r],m),m),m);}
static long[] f;
static long mod=(long)1e9+7;
//......................................@uthor_Alx..............................................
static HashSet<Integer>[] segment; 
  
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
    static HashSet<Integer> query(int node, int l,  
                                int r, int a, int b) 
    { 
        HashSet<Integer> left = new HashSet<>(); 
        HashSet<Integer> right = new HashSet<>(); 
        HashSet<Integer> result = new HashSet<>(); 
  
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
        segment = new HashSet[h]; 
        for (int i = 0; i < h; i++) 
            segment[i] = new HashSet<>(); 
    } 
  
    // Function to get the result for the 
    // subarray from arr[l] to arr[r] 
    static int getDistinct(int l, int r, int n) 
    { 
  
        // Query for the range set 
        HashSet<Integer> ans = query(1, 0, n - 1, l, r); 
  
        return ans.size(); 
    }
   public static void main(String[] args) throws  IOException{
				assign();
				int t=1;//int_v(read()),cn=1;
				while(t--!=0){
					int[] x=int_arr();
					int n=x[0],q=x[1];
					segment=new HashSet[4*n];
					for(int i=0;i<4*n;i++){segment[i]=new HashSet<>();}
					int[] arr=int_arr();
					build(1, 0, n - 1, arr); 
					while(q--!=0){
						int[] y=int_arr();
						out.write(getDistinct(y[0]-1,y[1]-1, n)+"\n");
					}
				}
			    
			    out.flush();

	}
}




	       

	       
