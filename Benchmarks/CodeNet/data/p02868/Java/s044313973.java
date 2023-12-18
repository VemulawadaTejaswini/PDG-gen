import java.io.*; 
import java.math.*;
import java.util.*;
import java.awt.Point;
 
public class Main {
	static final long MOD = 998244353L;
	static final long INF = 100000000000007L;
	//static final long MOD = 1000000007L;
	//static final int INF = 1000000007;
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int N = sc.ni();
		int M = sc.ni();
		int[][] updates = new int[M+1][3]; //{L,C,R}
		for (int i = 0; i < M; i++) {
			updates[i][0] = sc.ni()-1;
			updates[i][1] = sc.ni()-1;
			updates[i][2] = sc.ni();
		}
		updates[M]=new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE,0};
		updates = sort(updates);
		long[] arr = new long[N];
		Arrays.fill(arr, INF);
		arr[0]=0;
		SegmentTree st = new SegmentTree(arr);
		int index = 0;
		for (int i = 0; i < N; i++) {
			long min = st.rMinQ(i+1,N-1);
			if (min < st.array[i]) {
				st.update(i, i,min);
			}
			while (updates[index][0] == i) {
				long val = st.array[i] + updates[index][2];
				if (val < st.array[updates[index][1]]) {
					st.update(updates[index][1],updates[index][1],val);
				}
				index++;
			}
		}
		long ans = st.array[N-1];
		System.out.println(ans==INF?-1:ans);
 	}
	
	static class SegmentTree {
	    private Node[] heap;
	    public long[] array;
	    public int size;

	    public SegmentTree(long[] array) {
	        this.array = Arrays.copyOf(array, array.length);
	        //The max size of this array is about 2 * 2 ^ log2(n) + 1
	        size = (int) (2 * Math.pow(2.0, Math.floor((Math.log((double) array.length) / Math.log(2.0)) + 1)));
	        heap = new Node[size];
	        build(1, 0, array.length);
	    }

	    //Initialize the Nodes of the Segment tree
	    private void build(int v, int from, int size) {
	        heap[v] = new Node();
	        heap[v].from = from;
	        heap[v].to = from + size - 1;

	        if (size == 1) {
	            heap[v].sum = array[from];
	            heap[v].min = array[from];
	        } else {
	            //Build childs
	            build(2 * v, from, size / 2);
	            build(2 * v + 1, from + size / 2, size - size / 2);

	            heap[v].sum = heap[2 * v].sum + heap[2 * v + 1].sum;
	            //min = min of the children
	            heap[v].min = Math.min(heap[2 * v].min, heap[2 * v + 1].min);
	        }
	    }

	    public long rsq(int from, int to) {
	        return rsq(1, from, to);
	    }

	    private long rsq(int v, int from, int to) {
	        Node n = heap[v];

	        //If you did a range update that contained this node, you can infer the Sum without going down the tree
	        if (n.pendingVal != null && contains(n.from, n.to, from, to)) {
	            return (to - from + 1) * n.pendingVal;
	        }

	        if (contains(from, to, n.from, n.to)) {
	            return heap[v].sum;
	        }

	        if (intersects(from, to, n.from, n.to)) {
	            propagate(v);
	            long leftSum = rsq(2 * v, from, to);
	            long rightSum = rsq(2 * v + 1, from, to);

	            return leftSum + rightSum;
	        }

	        return 0;
	    }

	    public long rMinQ(int from, int to) {
	        return rMinQ(1, from, to);
	    }

	    private long rMinQ(int v, int from, int to) {
	        Node n = heap[v];


	        //If you did a range update that contained this node, you can infer the Min value without going down the tree
	        if (n.pendingVal != null && contains(n.from, n.to, from, to)) {
	            return n.pendingVal;
	        }

	        if (contains(from, to, n.from, n.to)) {
	            return heap[v].min;
	        }

	        if (intersects(from, to, n.from, n.to)) {
	            propagate(v);
	            long leftMin = rMinQ(2 * v, from, to);
	            long rightMin = rMinQ(2 * v + 1, from, to);

	            return Math.min(leftMin, rightMin);
	        }

	        return Long.MAX_VALUE;
	    }
      
	    public void update(int from, int to, long value) {
	        update(1, from, to, value);
	    }

	    private void update(int v, int from, int to, long value) {
	        Node n = heap[v];
	        if (contains(from, to, n.from, n.to)) {
	            change(n, value);
	        }

	        if (n.size() == 1) return;

	        if (intersects(from, to, n.from, n.to)) {
	            propagate(v);

	            update(2 * v, from, to, value);
	            update(2 * v + 1, from, to, value);

	            n.sum = heap[2 * v].sum + heap[2 * v + 1].sum;
	            n.min = Math.min(heap[2 * v].min, heap[2 * v + 1].min);
	        }
	    }

	    //Propagate temporal values to children
	    private void propagate(int v) {
	        Node n = heap[v];

	        if (n.pendingVal != null) {
	            change(heap[2 * v], n.pendingVal);
	            change(heap[2 * v + 1], n.pendingVal);
	            n.pendingVal = null; //unset the pending propagation value
	        }
	    }

	    //Save the temporal values that will be propagated lazily
	    private void change(Node n, long value) {
	        n.pendingVal = value;
	        n.sum = n.size() * value;
	        n.min = value;
	        array[n.from] = value;

	    }

	    //Test if the range1 contains range2
	    private boolean contains(int from1, int to1, int from2, int to2) {
	        return from2 >= from1 && to2 <= to1;
	    }

	    //check inclusive intersection, test if range1[from1, to1] intersects range2[from2, to2]
	    private boolean intersects(int from1, int to1, int from2, int to2) {
	        return from1 <= from2 && to1 >= from2   //  (.[..)..] or (.[...]..)
	                || from1 >= from2 && from1 <= to2; // [.(..]..) or [..(..)..
	    }

	    //The Node class represents a partition range of the array.
	    static class Node {
	        long sum;
	        long min;
	        //Here We store the value that will be propagated lazily
	        Long pendingVal = null;
	        int from;
	        int to;

	        int size() {
	            return to - from + 1;
	        }

	    }
	}
    
    public static int[][] sort(int[][] array) {
    	//Sort an array (immune to quicksort TLE)
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int[] temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		Arrays.sort(array, new Comparator<int[]>() {
			  @Override
        	  public int compare(int[] arr1, int[] arr2) {
				  return arr1[0]-arr2[0]; //ascending order
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