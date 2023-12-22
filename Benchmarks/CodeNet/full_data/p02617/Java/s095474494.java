import java.io.*;
import java.util.*;
 
public class Main {
    static final long MOD = 1000000007L;
    static final int INF = 50000000;
    static final int NINF = -50000000;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        
        int N = sc.ni();
        int[][] edges = new int[N-1][2];
        for (int i = 0; i < N-1; i++) {
        	edges[i][0] = sc.ni();
        	edges[i][1] = sc.ni();
        	Arrays.sort(edges[i]);
        }
        edges = sort(edges);
        int e = 0;
        long sub = 0;
        long tri = 0;
        long ans = 0;
        for (int i = 1; i <= N; i++) {
        	while (e < N-1 && edges[e][1]<=i) {
        		sub += edges[e][0];
        		e++;
        	}
        	tri += i;
        	ans += (tri-sub);
        }
        pw.println(ans);
        pw.close();
    }

    public static int[][] sort(int[][] arr) {
    	//Sort an array (immune to quicksort TLE)
    	Random rgen = new Random();
    	for (int i = 0; i < arr.length; i++) {
    		int randomPosition = rgen.nextInt(arr.length);
    		int[] temp = arr[i];
    		arr[i] = arr[randomPosition];
    		arr[randomPosition] = temp;
    	}
    	Arrays.sort(arr, new Comparator<int[]>() {
    		@Override
    		public int compare(int[] arr1, int[] arr2) {
    			return arr1[1]-arr2[1];
    			//Ascending order.
    		}
    	});
    	return arr;
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
                } catch (IOException e) {
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