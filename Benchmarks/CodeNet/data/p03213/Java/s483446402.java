import java.io.*;
import java.math.BigInteger;
import java.util.*;
//import java.math.*;
//import java.awt.Point;
 
public class Main {
	//static final long MOD = 998244353L;
	//static final long INF = -1000000000000000007L;
	static final long MOD = 1000000007L;
	//static final int INF = 1000000007;

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.ni();
		boolean[] sieve = new boolean[N+1];
		Arrays.fill(sieve,true);
		sieve[0] = false;
		sieve[1] = false;
		for (int i = 2; i <= N; i++) {
			for (int j = Math.min(2*i,N); j <= N; j += i) {
				sieve[j] = false;
			}
		}
		ArrayList<Integer> pows = new ArrayList<Integer>();
		for (int i = 2; i <= N; i++) {
			if (sieve[i]) {
				int cnt = 0;
				int num = N/i;
				while (num > 0) {
					cnt += num;
					num /= i;
				}
				pows.add(cnt);
			}
		}
		
		int ans = 0;
		int P = pows.size();
		//Case 1: p^74
		for (int i = 0; i < P; i++) {
			if (pows.get(i) >= 74) {
				ans++;
			}
		}
		//Case 2: p^24 * q^2
		for (int i = 0; i < P; i++) {
			for (int j = 0; j < P; j++) {
				if (i != j && pows.get(i)>=24&&pows.get(j)>=2) {
					ans++;
				}
			}
		}
		//Case 3: p^14 * q^4
		for (int i = 0; i < P; i++) {
			for (int j = 0; j < P; j++) {
				if (i != j && pows.get(i)>=14&&pows.get(j)>=4) {
					ans++;
				}
			}
		}
		//Case 4: p^4 * q^2 * r^2
		for (int i = 0; i < P; i++) {
			for (int j = i+1; j < P; j++) {
				for (int k = 0; k < P; k++) {
					if (i != j && j != k && i != k && pows.get(i)>=4&&pows.get(j)>=4 &&pows.get(k)>=2) {
						ans++;
					}
				}
			}
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