import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;
 
public class Main {
	//static final long MOD = 998244353L;
	//static final long INF = -1000000000000000007L;
	//static final long MOD = 1000000007L;
	static final int INF = 1000000007;
	static int[][] perms;
	static int v;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.ni();
		int[] A = new int[N];
		int[] B = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.ni();
		}
		for (int i = 0; i < N; i++) {
			B[i] = sc.ni();
		}
		int nfac = factorial(N);
		perms = new int[nfac][N];
		v = 0;
		int[] shuf = new int[N];
		for (int i = 0; i < N; i++)
			shuf[i] = i+1;
		heap(N,shuf);
		shuffle(perms);
		perms = sort(perms);
		
		int aIndex = 0;
		for (int i = 0; i < nfac; i++) {
			boolean equal = true;
			for (int j = 0; j < N; j++) {
				if (perms[i][j] != A[j]) {
					equal = false;
					break;
				}
			}
			if (equal) {
				aIndex = i;
				break;
			}
		}
		
		int bIndex = 0;
		for (int i = 0; i < nfac; i++) {
			boolean equal = true;
			for (int j = 0; j < N; j++) {
				if (perms[i][j] != B[j]) {
					equal = false;
					break;
				}
			}
			if (equal) {
				bIndex = i;
				break;
			}
		}
		pw.println(Math.abs(aIndex-bIndex));
		pw.close();
	}
	public static int factorial(int n) {
		if (n > 1) {
			return n*factorial(n-1);
		} else {
			return 1;
		}
	}
	
	public static void heap(int n, int[] elements) {

		if(n == 1) {
			for (int i = 0; i < elements.length; i++) {
				perms[v][i] = elements[i];
			}
			v++;
		} else {
			for(int i = 0; i < n-1; i++) {
				heap(n - 1, elements);
				if(n % 2 == 0) {
					swap(elements, i, n-1);
				} else {
					swap(elements, 0, n-1);
				}
			}
			heap(n - 1, elements);
		}
	}
	
	public static void swap(int[] input, int a, int b) {
	    int tmp = input[a];
	    input[a] = input[b];
	    input[b] = tmp;
	}
	
	//Find the GCD of two numbers
	public static long gcd(long a, long b) {
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
				  //return arr1[1]-arr2[1]; //ascending order
				  for (int i = 0; i < arr1.length; i++) {
					  if (arr1[i] != arr2[i]) {
						  return arr1[i]-arr2[i];
					  }
				  }
				  return 0;
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