import java.io.*; 
import java.math.*;
import java.util.*;
 
public class Main {
	static final long MOD = 998244353;
	//static final long MOD = 1000000007;
	static boolean[] visited;
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int Q = sc.nextInt();
        TreeSet<Long> shrines = new TreeSet<Long>();
        TreeSet<Long> temples = new TreeSet<Long>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < A; i++) {
        	shrines.add(sc.nextLong());
        }
        for (int i = 0; i < B; i++) {
        	temples.add(sc.nextLong());
        }
        for (int q = 0; q < Q; q++) {
        	long x = sc.nextLong();
        	long bestDist = Long.MAX_VALUE;
        	Long leftS = shrines.floor(x);
        	if (leftS != null) {
        		Long lt = temples.floor(leftS);
        		Long rt = temples.ceiling(leftS);
        		if (lt != null) {
        			bestDist = Math.min(bestDist,Math.abs(x-leftS)+Math.abs(leftS-lt));
        		}
        		if (rt != null) {
        			bestDist = Math.min(bestDist,Math.abs(x-leftS)+Math.abs(leftS-rt));
        		}
        	}
        	
        	Long rightS = shrines.ceiling(x);
        	if (rightS != null) {
        		Long lt = temples.floor(rightS);
        		Long rt = temples.ceiling(rightS);
        		if (lt != null) {
        			bestDist = Math.min(bestDist,Math.abs(x-rightS)+Math.abs(rightS-lt));
        		}
        		if (rt != null) {
        			bestDist = Math.min(bestDist,Math.abs(x-rightS)+Math.abs(rightS-rt));
        		}
        	}
        	
        	Long leftT = temples.floor(x);
        	if (leftT != null) {
        		Long ls = shrines.floor(leftT);
        		Long rs = shrines.ceiling(leftT);
        		if (ls != null) {
        			bestDist = Math.min(bestDist,Math.abs(x-leftT)+Math.abs(leftT-ls));
        		}
        		if (rs != null) {
        			bestDist = Math.min(bestDist,Math.abs(x-leftT)+Math.abs(leftT-rs));
        		}
        	}
        	
        	Long rightT = temples.ceiling(x);
        	if (rightT != null) {
        		Long ls = shrines.floor(rightT);
        		Long rs = shrines.ceiling(rightT);
        		if (ls != null) {
        			bestDist = Math.min(bestDist,Math.abs(x-rightT)+Math.abs(rightT-ls));
        		}
        		if (rs != null) {
        			bestDist = Math.min(bestDist,Math.abs(x-rightT)+Math.abs(rightT-rs));
        		}
        	}
        	ans.append(bestDist + "\n");
        }
        System.out.print(ans);
    }
    
    public static int[][] sort(int[][] array) {
    	//Sort an array (immune to quicksort TLE)
		Random rgen = new Random();
		for (int i = 0; i< array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int[] temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		Arrays.sort(array, new Comparator<int[]>() {
			  @Override
			  public int compare(int[] arr1, int[] arr2) {
				  //Ascending order
				  if (arr1[0] != arr2[0])
					  return arr1[0]-arr2[0];
				  else
					  return arr2[1]-arr1[1];
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
  
        int nextInt() { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() { 
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