import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;
 
public class Main {
	static final long MOD = 998244353L;
	//static final long INF = 1000000000000000007L;
	//static final long MOD = 1000000007L;
	//static final int INF = 1000000007;
	
	//static long[] factorial;
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		String s = sc.next();
		int x = sc.ni()+8000;
		int y = sc.ni()+8000;
		ArrayList<Integer> Xs = new ArrayList<Integer>();
		ArrayList<Integer> Ys = new ArrayList<Integer>();
		int a = 0;
		int size = 0;
		for (char c: s.toCharArray()) {
			if (c=='T') {
				if (a==0)
					Xs.add(size);
				else
					Ys.add(size);
				size = 0;
				a = 1-a;
			} else {
				size++;
			}
		}
		if (a==0)
			Xs.add(size);
		else
			Ys.add(size);
		
		
		boolean[] Xdp = new boolean[16001];
		Xdp[8000] = true;
		boolean[] Xc = new boolean[16001];
		boolean first = true;
		for (int n: Xs) {
			for (int i = 0; i <= 16000; i++)
				Xc[i] = false;
			for (int i = 0; i <= 16000; i++) {
				if (!Xdp[i]) continue;
				if (!first && i-n >= 0)
					Xc[i-n] = true;
				if (i+n <= 16000)
					Xc[i+n] = true;
			}
			first = false;
			for (int i = 0; i <= 16000; i++)
				Xdp[i] = Xc[i];
		}
		
		boolean[] Ydp = new boolean[16001];
		Ydp[8000] = true;
		boolean[] Yc = new boolean[16001];
		for (int n: Ys) {
			for (int i = 0; i <= 16000; i++)
				Yc[i] = false;
			for (int i = 0; i <= 16000; i++) {
				if (!Ydp[i]) continue;
				if (i-n >= 0)
					Yc[i-n] = true;
				if (i+n <= 16000)
					Yc[i+n] = true;
			}
			for (int i = 0; i <= 16000; i++)
				Ydp[i] = Yc[i];
		}
		
		if (Xdp[x] && Ydp[y])
			pw.println("Yes");
		else
			pw.println("No");
		
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
				  //return a[0]-b[0]; //ascending order
				  if (a[1] != b[1]) {
					  return (a[1]-b[1]);
				  } else {
					  return (a[0]-b[0]);
				  }
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