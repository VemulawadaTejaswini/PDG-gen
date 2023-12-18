import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;
 
public class Main {
	//static final long MOD = 998244353L;
	//static final long INF = 1000000000000000007L;
	static final long MOD = 1000000007L;
	static final int INF = 1000000007;
	
	static int N;
	static int M;
	static int Q;
	static int ans;
	static int[][] queries;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		N = sc.ni();
		M = sc.ni();
		Q = sc.ni();
		ans = 0;
		queries = new int[Q][4];
		for (int i = 0; i < Q; i++)
			queries[i] = new int[]{sc.ni()-1,sc.ni()-1,sc.ni(),sc.ni()};
		
		int[] blank = new int[N];
		recursive(blank,0,0);
		pw.println(ans);
		pw.close();
	}
	
	public static void recursive(int[] arr, int size, int val) {
		if (size == N) {
			int guess = 0;
			for (int q = 0; q < Q; q++) {
				if (arr[queries[q][1]]-arr[queries[q][0]]==queries[q][2])
					guess += queries[q][3];
			}
			ans = Math.max(guess,ans);
		} else {
			for (int j = val; j < M; j++) {
				int[] nums = arr;
				nums[size] = j;
				recursive(nums,size+1,j);
			}
		}
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
		if (y < 0) return 0L;
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
	
	public static int[] shuffle(int[] array) {
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		return array;
	}
	
	public static long[] shuffle(long[] array) {
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    long temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		return array;
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
        	  public int compare(int[] a, int[] b) {
				  return a[0]-b[0]; //ascending order
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
        	  public int compare(long[] a, long[] b) {
				  if (a[0] < b[0])
					  return -1;
				  else if (a[0] > b[0])
					  return 1;
				  else
					  return 0;
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