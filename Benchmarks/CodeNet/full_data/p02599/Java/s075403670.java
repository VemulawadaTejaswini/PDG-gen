// Java code to find number of distinct numbers  
// in a subarray  
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner; 
  
public class Main  
{ 
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
            byte[] buf = new byte[64]; // line length 
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
	
    static int MAX = 1000001; 
  
    // structure to store queries 
    static class Query  
    { 
        int l, r, idx; 
    } 
  
    // updating the bit array 
    static void update(int idx, int val,  
                        int bit[], int n)  
    { 
        for (; idx <= n; idx += idx & -idx) 
            bit[idx] += val; 
    } 
  
    // querying the bit array 
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
  
        // initialising bit array 
        int[] bit = new int[n + 1]; 
        Arrays.fill(bit, 0); 
  
        // holds the rightmost index of any number 
        // as numbers of a[i] are less than or equal to 10^6 
        int[] last_visit = new int[MAX]; 
        Arrays.fill(last_visit, -1); 
  
        // answer for each query 
        int[] ans = new int[q]; 
        int query_counter = 0; 
        for (int i = 0; i < n; i++)  
        { 
  
            // If last visit is not -1 update -1 at the 
            // idx equal to last_visit[arr[i]] 
            if (last_visit[arr[i]] != -1) 
                update(last_visit[arr[i]] + 1, -1, bit, n); 
  
            // Setting last_visit[arr[i]] as i and updating 
            // the bit array accordingly 
            last_visit[arr[i]] = i; 
            update(i + 1, 1, bit, n); 
  
            // If i is equal to r of any query store answer 
            // for that query in ans[] 
            while (query_counter < q && queries[query_counter].r == i)  
            { 
                ans[queries[query_counter].idx] =  
                        query(queries[query_counter].r + 1, bit, n) 
                        - query(queries[query_counter].l, bit, n); 
                query_counter++; 
            } 
        } 
  
        
        StringBuilder sb=new StringBuilder();
        
        for (int i = 0; i < q; i++) 
        {
           sb.append(ans[i]);
           sb.append("\n");
        }
        
        System.out.println(sb);
        
    } 
  
    // Driver Code 
    public static void main(String[] args)  throws Exception
    { 
    	Reader s=new Reader();
    	
    	int n=s.nextInt();
    	int q=s.nextInt();
    	
    	int[] arr=new int[n];
    	
    	for(int i=0;i<n;i++)
    	{
    		arr[i]=s.nextInt();
    	}
    	
    	Query[] queries=new Query[q];
    	
    	for(int i=0;i<q;i++)
    	{
    		int l=s.nextInt()-1;
    		int r=s.nextInt()-1;
    		int index=i;
    		
    		Query qq=new Query();
    		qq.l=l;
    		qq.r=r;
    		qq.idx=index;
    		
    		queries[i]=qq;
    	}
    	
        Arrays.sort(queries, new Comparator<Query>()  
        { 
            public int compare(Query x, Query y) 
            { 
                if (x.r < y.r) 
                    return -1; 
                else if (x.r == y.r) 
                    return 0; 
                else
                    return 1; 
            } 
        }); 
        answeringQueries(arr, n, queries, q); 
    } 
} 