import java.io.*; 
import java.math.*;
import java.util.*;
 
public class Main {
	static final long MOD = 998244353;
	//static final long MOD = 1000000007;
	static int pow;
	static boolean[] visited;
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        pow = (int)Math.pow(2, N);
        int[] nums = new int[pow];
        for (int i = 0; i < pow; i++)
        	nums[i] = sc.nextInt();
        nums = sort(nums);
        boolean ans = true;
        boolean[] hit = new boolean[pow];
        hit[pow-1] = true;
        loop:
        for (int i = 0; i < N; i++) {
        	boolean[] mark = new boolean[pow];
        	int index = pow-1;
        	for (int j = pow-1; j >= 0; j--) {
        		if (hit[j]) {
        			continue;
        		} else if (nums[j] < nums[index]) {
        			mark[j] = true;
        			while (index > 0) {
        				index--;
        				if (hit[index]) {
        					break;
        				}
        			}
        		}
        	}
        	int marked = 0;
        	for (int j = 0; j < pow; j++) {
        		hit[j] = (hit[j]||mark[j]);
        		if (hit[j]) {
        			marked++;
        		}
        	}
        	if (marked < Math.pow(2, i+1)) {
        		ans = false;
        		break loop;
        	}
        }
        if (ans) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
    }
    
    public static void recursiveDFS(Node root) {
    	visited[root.n] = true;
    	//recStack[root.n] = true;
    	for (Node child: root.children) {
    		if (! visited[child.n]) {
    			visited[child.n] = true;
    			recursiveDFS(child);
    		} //else if (recStack[child.n]) {
    			//coloring[root.n][child.n] = true;
    			//colors = 2;
    		//}
    	}
    	//recStack[root.n] = false;
    }
    
    public static int[] sort(int[] array) {
    	//Sort an array (immune to quicksort TLE)
		Random rgen = new Random();
		for (int i = 0; i< array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		Arrays.sort(array);

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