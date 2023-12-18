import java.io.*;
import java.util.*;
//import java.math.*;
//import java.awt.Point;
 
public class Main {
	//static final long MOD = 998244353L;
	//static final long INF = -1000000000000000007L;
	static final long MOD = 1000000007L;
	//static final int INF = 1000000007;
	
	static long[] st;
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.ni();
		long[] nums = new long[N];
		for (int i = 0; i < N; i++)
			nums[i] = sc.nl();
		constructSegmentTree(nums);
		long ans = nums[0];
		for (int i = 0; i < N; i++)
			ans = gcd(ans,nums[i]);
		for (int i = 0; i < N; i++) {
			//skip index i.
			long a = 1;
			long g = 1;
			if (i == 0) {
				g = findRangeGcd(1,N-1,nums);
			} else if (i == N-1) {
				g = findRangeGcd(0,N-2,nums);
			} else {
				g = gcd(findRangeGcd(0,i-1,nums),findRangeGcd(i+1,N-1,nums));
			}
			ans = Math.max(ans,g);
		}
		pw.println(ans);
		pw.close();
	}
	
    public static long[] constructSegmentTree(long[] arr) 
    { 
        int height = (int)Math.ceil(Math.log(arr.length)/Math.log(2)); 
        int size = 2*(int)Math.pow(2, height)-1; 
        st = new long[size]; 
        constructST(arr, 0, arr.length-1, 0); 
        return st; 
    } 
  
    // A recursive function that constructs Segment 
    // Tree for array[ss..se]. si is index of current 
    // node in segment tree st 
    public static long constructST(long[] arr, int ss, 
                                  int se, int si) 
    { 
        if (ss==se) 
        { 
            st[si] = arr[ss]; 
            return st[si]; 
        } 
        int mid = ss+(se-ss)/2; 
        st[si] = gcd(constructST(arr, ss, mid, si*2+1), 
                     constructST(arr, mid+1, se, si*2+2)); 
        return st[si]; 
    }
  
    //Finding The gcd of given Range 
    public static long findRangeGcd(int ss, int se, long[] arr) 
    { 
        int n = arr.length; 
  
        if (ss<0 || se > n-1 || ss>se) 
            throw new IllegalArgumentException("Invalid arguments"); 
  
        return findGcd(0, n-1, ss, se, 0); 
    }
    
    public static long findGcd(int ss, int se, int qs, int qe, int si) 
    { 
        if (ss>qe || se < qs) 
            return 0; 
  
        if (qs<=ss && qe>=se) 
            return st[si]; 
  
        int mid = ss+(se-ss)/2; 
  
        return gcd(findGcd(ss, mid, qs, qe, si*2+1), 
                   findGcd(mid+1, se, qs, qe, si*2+2)); 
    } 
	
	public static long dist(long[] p1, long[] p2) {
		return (Math.abs(p2[0]-p1[0])+Math.abs(p2[1]-p1[1]));
	}
	
	//Find the GCD of two numbers
	public static long gcd(long a, long b) {
		if (a < b) return gcd(b,a);
		if (b == 0)
			return a;
		else
			return gcd(b,a%b);
	}
	
	//Fast exponentiation (x^y mod m)
	public static long power(long x, long y, long m) { 
		long ans = 1;
		x %= m;
		while (y > 0) { 
			if(y % 2 == 1) 
				ans = (ans * x) % m; 
			y /= 2;  
			x = (x * x) % m;
		} 
		return ans; 
	}
	
	public static int[][] shuffle(int[][] array) {
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int[] temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		return array;
	}
	
    public static int[][] sort(int[][] array) {
    	//Sort an array (immune to quicksort TLE)
 
		Arrays.sort(array, new Comparator<int[]>() {
			  @Override
        	  public int compare(int[] arr1, int[] arr2) {
				  return arr1[1]-arr2[1]; //ascending order
	          }
		});
		return array;
	}
    
    public static long[][] sort(long[][] array) {
    	//Sort an array (immune to quicksort TLE)
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    long[] temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		Arrays.sort(array, new Comparator<long[]>() {
			  @Override
        	  public int compare(long[] arr1, long[] arr2) {
				  //return 0;
				  if (arr1[0] < arr2[0]) {
					  return -1;
				  } else if (arr1[0] > arr2[0]) {
					  return 1;
				  } else {
					  return 0;
				  }
	          }
		});
		return array;
	}
    
    static class FastScanner { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastScanner() { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() { 
            while (st == null || !st.hasMoreElements()) { 
                try { 
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int ni() { 
            return Integer.parseInt(next()); 
        } 
  
        long nl() { 
            return Long.parseLong(next()); 
        } 
  
        double nd() { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() { 
            String str = ""; 
            try { 
                str = br.readLine(); 
            } catch (IOException e) {
                e.printStackTrace(); 
            } 
            return str;
        }
    }
}