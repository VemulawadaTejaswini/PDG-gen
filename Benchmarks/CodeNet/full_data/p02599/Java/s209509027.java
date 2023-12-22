import java.io.*; 
import java.util.*; 
  
class Main  
{ 
    static int MAX = 5_000_05; 
    static FastReader fs = new FastReader();
    static int block_size;
    
    static class Query implements Comparable<Query> 
    { 
        int l, r, idx; 
        Query(int l,int r,int i){
        	this.l = l;
        	this.r = r;
        	this.idx = i;
        }
        public int compareTo(Query other) {
        	return r - other.r;
        }
    } 
  
    
    static void update(int idx, int val,  
                        int bit[], int n)  
    { 
        for (; idx <= n; idx += idx & -idx) 
            bit[idx] += val; 
    } 
  
    
    static int query(int idx, int bit[], int n)  
    { 
        int sum = 0; 
        for (; idx > 0; idx -= idx & -idx) 
            sum += bit[idx]; 
        return sum; 
    } 
  
    static void answeringQueries(int[] arr, int n,  
                                Query[] queries, int q) 
    { 
  
       
        int[] bit = new int[n + 1]; 
        Arrays.fill(bit, 0); 
  
        
        int[] last_visit = new int[MAX]; 
        Arrays.fill(last_visit, -1); 
  
       
        int[] ans = new int[q]; 
        int query_counter = 0; 
        for (int i = 0; i < n; i++)  
        { 
  
           
            if (last_visit[arr[i]] != -1) 
                update(last_visit[arr[i]] + 1, -1, bit, n); 
  
            
            last_visit[arr[i]] = i; 
            update(i + 1, 1, bit, n); 
  
            
            while (query_counter < q && queries[query_counter].r == i)  
            { 
                ans[queries[query_counter].idx] =  
                        query(queries[query_counter].r + 1, bit, n) 
                        - query(queries[query_counter].l, bit, n); 
                query_counter++; 
            } 
        } 
  
       
        for (int i = 0; i < q; i++) 
            System.out.println(ans[i]); 
    }
    public static void main(String[] args) {
		int n = fs.nextInt(),q = fs.nextInt();
		block_size = (int) Math.sqrt(n);
		int c [] = new int [n];
		for(int i = 0; i<n; i++)c[i] = fs.nextInt();
		Query[] queries = new Query[q]; 
        
		for(int i = 0; i<q; i++) {
			int l = fs.nextInt()-1,r = fs.nextInt()-1;
			queries[i] = new Query(l,r,i);
		}
		Arrays.sort(queries);
        answeringQueries(c, n, queries, q); 
	}
    
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
        
        int [] readintarray(int n) {
        	int res [] = new int [n];
        	for(int i = 0; i<n; i++)res[i] = nextInt();
        	return res;
        }
        
        long [] readlongarray(int n) {
        	long res [] = new long [n];
        	for(int i = 0; i<n; i++)res[i] = nextLong();
        	return res;
        }
    } 
}
