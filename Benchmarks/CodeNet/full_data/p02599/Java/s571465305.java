import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;


public class Main {
	static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[(int) (2e6+10)]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    }

	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	public static Reader sc = new Reader();

	public static List<Integer>[] edges;
	
	public static void main(String[] args) throws IOException{
	
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;++i) arr[i] = sc.nextInt();
		int[] b = new int[n];
		Map<Integer,Integer> map = new HashMap<>(); // next occur
		for(int i=n-1;i>=0;--i) {
			b[i] = map.getOrDefault(arr[i],n);
			map.put(arr[i],i);
		}
       MergeSortTree mst = new MergeSortTree(b,n);
  
       int[] L = new int[q];
       int[] R = new int[q];
       int[] K = new int[q];
       
       for(int i=0;i<q;++i) {
    	   L[i] = sc.nextInt();
    	   R[i] = sc.nextInt();
    	   K[i] = R[i];
       }
      
        mst.performQueries(L, R, K, q); // ask query of element greater than R in [ L,R ] for unique elements


	out.close();
	}


	static class MergeSortTree{
		private List<Integer>[] tree;
		private int[] arr;
		
		MergeSortTree(int[] arr,int n){
			tree = new ArrayList[4 * n + 1]; 
			this.arr = arr.clone();
			//this.n = n;
			
	        for (int i = 0; i < tree.length; i++) tree[i] = new ArrayList<>(); 
	        buildTree(1, 0, n - 1); 
	  
		}
		

	  private List<Integer> merge(List<Integer> v1,List<Integer> v2){
			int i = 0, j = 0;
			List<Integer> v = new ArrayList<>();
			while (i < v1.size() && j < v2.size()){
				
			     if (v1.get(i) <= v2.get(j)){
			          v.add(v1.get(i));
			          i++;
			     }else {
		        	v.add(v2.get(j));
			        j++;
			      }
			}
		
			for (int k = i; k < v1.size(); k++) v.add(v1.get(k));
			for (int k = j; k < v2.size(); k++) v.add(v2.get(k));
			return v;
	   }
	 
	  private void buildTree(int index, int s, int e){
				if (s == e) {
				 tree[index].add(arr[s]);
				 return;
				}
				
				int mid = (s + e) / 2;
				buildTree(2 * index, s, mid);
				buildTree(2 * index + 1, mid + 1, e);
				tree[index] = merge(tree[2 * index], tree[2 * index + 1]);
	   }
	
	    private int query(int index, int s,int e, int l, int r, int k){
	        if (r < s || l > e) return 0;
	        if (s >= l && e <= r){
	              
	            // binary search to find index of k
	            return (tree[index].size() - lowerBound(tree[index], 
	                    tree[index].size(), k));
	        }
	        int mid = (s + e) / 2;
	        return (query(2 * index, s, mid, l, r, k) + 
	        		query(2 * index + 1, mid + 1, e, l, r, k));
	     }
	    
	    public int q(int l,int r,int k) {
	    	return query(1,0,arr.length-1,l,r,k);
	    }
	     
	     void performQueries(int L[], int R[], int K[], int q){
				for (int i = 0; i < q; i++)
				    out.println(q(L[i] - 1, R[i] - 1, K[i]));
	     }
	    
	   private int lowerBound(List<Integer> array,int length, int value){
				int low = 0;
				int high = length;
				while (low < high) {
				    final int mid = (low + high) / 2;
				    if (value <= array.get(mid)) high = mid;
				    else low = mid + 1;
				}
				return low;
		}

	}


	
}