import java.io.*; 
import java.math.*;
import java.util.*;
 
public class Main {
	static final long MOD = 998244353;
	//static final long MOD = 1000000007;
	static boolean[] visited;
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++)
        	nums[i] = sc.nextInt();
        int mp = Integer.MAX_VALUE;
        for (int i = 0; i < (int)Math.pow(4,N); i++) {
        	int[] base4 = new int[N];
        	int num = i;
        	for (int digit = N-1; digit >= 0; digit--) {
        		if (num >= 3*(int)Math.pow(4, digit)) {
        			base4[digit] = 3;
        		} else if (num >= 2*(int)Math.pow(4,digit)) {
        			base4[digit] = 2;
        		} else if (num >= (int)Math.pow(4,digit)) {
        			base4[digit] = 1;
        		} else {
        			base4[digit] = 0;
        		}
        		num -= base4[digit]*(int)Math.pow(4,digit);
        	}
        	int[] sums = {0,0,0};
        	int[] cnt = {0,0,0};
        	for (int j = 0; j < N; j++) {
        		if (base4[j] == 0)
        			continue;
        		sums[base4[j]-1] += nums[j];
        		cnt[base4[j]-1] += 1;
        	}
        	if (cnt[0] == 0 || cnt[1] == 0 || cnt[2] == 0)
        		continue;
        	int mpCost = Math.abs(sums[0]-A)+Math.abs(sums[1]-B)+Math.abs(sums[2]-C);
        	mpCost += 10*(cnt[0]-1);
        	mpCost += 10*(cnt[1]-1);
        	mpCost += 10*(cnt[2]-1);
        	mp = Math.min(mpCost,mp);
        }
        System.out.println(mp);
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

class Node {
	public HashSet<Node> children;
	public int n;
	
	public Node(int n) {
		this.n = n;
		children = new HashSet<Node>();
	}
	
	public void addChild(Node node) {
		children.add(node);
	}
	
	public void removeChild(Node node) {
		children.remove(node);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return n;
	}

	@Override
	public boolean equals(Object obj) {
		if (! (obj instanceof Node)) {
			return false;
		} else {
			Node node = (Node) obj;
			return (n == node.n);
		}
	}
	
	public String toString() {
		return (this.n+1)+"";
	}
}