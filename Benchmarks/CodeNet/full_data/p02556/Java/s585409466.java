import java.io.*;
import java.util.*;
 
public class Main {
    static final long MOD = 1000000007L;
    //static final long MOD = 998244353L;
    static final int INF = 50000000;
    static final int NINF = -500000000;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        
        int N = sc.ni();
        long[][] nums = new long[N][2];
        TreeSet<Long> Ys = new TreeSet<Long>();
        for (int i = 0; i < N; i++) {
        	nums[i] = new long[] {sc.nl(),sc.nl()};
        	Ys.add(nums[i][1]);
        }
        sort(nums);
        HashMap<Long,Integer> hm = new HashMap<Long,Integer>();
        int T = 0;
        for (long y: Ys) {
        	hm.put(y,T);
        	T++;
        }
        
        SegmentTree st1 = new SegmentTree(T);
        SegmentTree st2 = new SegmentTree(T);
        for (int i = 0; i < T; i++) {
        	st1.update(i, -100000000000L);
        	st2.update(i, -100000000000L);
        }
        long ans = 0;
        for (long[] p: nums) {
        	int index = hm.get(p[1]);
        	long v1 = p[1]-p[0];
        	long v2 = 0-p[0]-p[1];
        	long val = Math.max(st1.query(index,T-1)-v1,st2.query(0, index)-v2);
        	ans = Math.max(ans, val);
        	if (v1 > st1.arr[index])
        		st1.update(index, v1);
        	if (v2 > st2.arr[index])
        		st2.update(index, v2);
        }
        pw.println(ans);
        pw.close();
    }
    
    //No lazy propagation. 0 indexed. Very fast.
    static class SegmentTree {
    	public long[] tree;
    	public long[] arr;
    	public long NONE;
    	public int N;

    	//Zero initialization
    	public SegmentTree(int n) {
    		N = n;
    		tree = new long[4*N+1];
    		arr = new long[N];
    		NONE = Long.MIN_VALUE; //set this manually (Long.MIN_VALUE for max-st, Long.MAX_VALUE for min-st, 0 for sum,xor-st, etc.)
    	}

    	public long merge(long a, long b) {
    		return Math.max(a, b); //set this manually
    	}

    	public long query(int i, int j) {
    		return query(0,0,N-1,i,j);
    	}

    	public void update(int arrIndex, long val) {
    		arr[arrIndex] = val;
    		update(0,0,N-1,arrIndex,val);
    	}

    	private long query(int treeIndex, int lo, int hi, int i, int j) {
    		// query for arr[i..j]
    		if (lo > j || hi < i)
    			return NONE;
    		if (i <= lo && j >= hi)
    			return tree[treeIndex];
    		int mid = lo + (hi - lo) / 2;

    		if (i > mid)
    			return query(2 * treeIndex + 2, mid + 1, hi, i, j);
    		else if (j <= mid)
    			return query(2 * treeIndex + 1, lo, mid, i, j);

    		long leftQuery = query(2 * treeIndex + 1, lo, mid, i, mid);
    		long rightQuery = query(2 * treeIndex + 2, mid + 1, hi, mid + 1, j);

    		// merge query results
    		return merge(leftQuery, rightQuery);
    	}

    	private void update(int treeIndex, int lo, int hi, int arrIndex, long val) {
    		if (lo == hi) {
    			tree[treeIndex] = val;
    			return;
    		}

    		int mid = lo + (hi - lo) / 2;

    		if (arrIndex > mid)
    			update(2 * treeIndex + 2, mid + 1, hi, arrIndex, val);
    		else if (arrIndex <= mid)
    			update(2 * treeIndex + 1, lo, mid, arrIndex, val);

    		// merge updates
    		tree[treeIndex] = merge(tree[2 * treeIndex + 1], tree[2 * treeIndex + 2]);
    	}
    }
    
    public static void sort(long[][] arr) {
    	//Sort an array (immune to quicksort TLE)
    	Random rgen = new Random();
    	for (int i = 0; i < arr.length; i++) {
    		int randomPosition = rgen.nextInt(arr.length);
    		long[] temp = arr[i];
    		arr[i] = arr[randomPosition];
    		arr[randomPosition] = temp;
    	}
    	Arrays.sort(arr, new Comparator<long[]>() {
    		@Override
    		public int compare(long[] arr1, long[] arr2) {
    			if (arr1[0] > arr2[0])
    				return 1;
    			else
    				return -1;
    			//Ascending order.
    		}
    	});
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