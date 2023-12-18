import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;
 
public class Main {
	//static final long MOD = 998244353L;
	//static final long INF = -1000000000000000007L;
	static final long MOD = 1000000007L;
	//static final int INF = 1000000007;
	
	static long[] factorial;
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.ni();
		long C = sc.nl();
		long[][] forward = new long[N][2];
		long[][] backward = new long[N][2];
		for (int i = 0; i < N; i++) {
			forward[i][0] = sc.nl(); //pos
			forward[i][1] = sc.nl(); //val
			backward[N-1-i][0] = C-forward[i][0]; //pos
			backward[N-1-i][1] = forward[i][1]; //val
		}
		long[][] forwardPref = new long[N+1][4];
		for (int i = 1; i <= N; i++) {
			long p = 0;
			if (i > 1)
				p = forward[i-2][0];
			forwardPref[i][0] = forwardPref[i-1][0]+(forward[i-1][1]-(forward[i-1][0]-p));
			forwardPref[i][1] = forwardPref[i-1][1]+(forward[i-1][1]-2*(forward[i-1][0]-p));
			forwardPref[i][2] = Math.max(forwardPref[i-1][2],forwardPref[i][0]);
			forwardPref[i][3] = Math.max(forwardPref[i-1][3],forwardPref[i][1]);
		}
		long[][] backwardPref = new long[N+1][4];
		for (int i = 1; i <= N; i++) {
			long p = 0;
			if (i > 1)
				p = backward[i-2][0];
			backwardPref[i][0] = backwardPref[i-1][0]+(backward[i-1][1]-(backward[i-1][0]-p));
			backwardPref[i][1] = backwardPref[i-1][1]+(backward[i-1][1]-2*(backward[i-1][0]-p));
			backwardPref[i][2] = Math.max(backwardPref[i-1][2],backwardPref[i][0]);
			backwardPref[i][3] = Math.max(backwardPref[i-1][3],backwardPref[i][1]);
		}
		
		long ans = 0;
		for (int i = 0; i <= N; i++) {
			long cur1 = forwardPref[i][2]+backwardPref[N-i][3];
			long cur2 = backwardPref[i][2]+forwardPref[N-i][3];
			long cur = Math.max(cur1,cur2);
			ans = Math.max(ans,cur);
		}
		pw.println(ans);
		pw.close();
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
				  return arr1[0]-arr2[0]; //ascending order
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
				  if (Math.min(Math.abs(arr1[0]),Math.abs(arr1[1])) < Math.min(Math.abs(arr2[0]),Math.abs(arr2[1]))) {
					  return -1;
				  } else {
					  return 1;
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