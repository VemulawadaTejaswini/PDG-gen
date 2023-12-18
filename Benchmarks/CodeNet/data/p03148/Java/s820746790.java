import java.io.*;
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
		int K = sc.ni();
		int[][] sushis = new int[N][2];
		for (int i = 0; i < N; i++) {
			sushis[i][0] = sc.ni()-1;
			sushis[i][1] = sc.ni();
		}
		sushis = sort(sushis);
		int[] used = new int[100000];
		int numUsed = 0;
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>(){
			public int compare(int[] a, int[] b) {
				return a[1] - b[1];
			}
		});
		long[] ans = new long[100001];
		long val = 0;
		for (int i = 0; i < K; i++) {
			pq.add(sushis[i]);
			used[sushis[i][0]] += 1;
			if (used[sushis[i][0]] == 1)
				numUsed++;
			val += sushis[i][1];
		}
		ans[numUsed] = val;
		for (int i = K; i < N; i++) {
			if (used[sushis[i][0]] > 0) {
				continue;
			}
			while (!pq.isEmpty() && used[pq.peek()[0]] == 1) {
				pq.poll();
			}
			if (! pq.isEmpty()) {
				int[] poll = pq.poll();
				used[poll[0]] -= 1;
				val -= poll[1];
				used[sushis[i][0]] = 1;
				val += sushis[i][1];
				numUsed++;
				ans[numUsed] = val;
			}
		}
		long finalAns = 0;
		for (int i = 0; i < 100001; i++) {
			if (ans[i]==0) continue;
			finalAns = Math.max(finalAns,ans[i]+(i+0L)*i);
		}
		pw.println(finalAns);
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
				  return arr2[1]-arr1[1]; //descending order
				  //return arr1[1]-arr2[1]; //ascending order
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