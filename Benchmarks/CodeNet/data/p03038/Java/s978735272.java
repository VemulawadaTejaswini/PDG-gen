import java.io.*;
import java.util.*;

public class Main {

	static class FastReader { 
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
    } 
	public static List<Pair>[] edges;
	public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] a = new long[n];
		for(int i=0;i<n;++i) a[i] = sc.nextLong();
		sort(a);
		Pair[] p = new Pair[m];
		for(int i=0;i<m;++i) p[i] = new Pair(sc.nextInt(),sc.nextInt());
		Arrays.sort(p,new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				if(o1.c!=o2.c) return o2.c-o1.c;
				return o2.b-o1.b;
			}
			
		});
	    int j=0;
		for(int i=0;i<m;++i) {
			int b = p[i].b;
			int c = p[i].c;
			while(j<n && a[j]<c && b>0) {
				a[j] = c;
				++j; --b;
			}
		}
		
		long ans = 0;
		for(long x : a) ans+=x;
		out.print(ans);
        out.close();
		
	}
	
	 static void sort(long[] A) {
         PriorityQueue<Long> pq = new PriorityQueue<>();
         int i = 0;
         for (i = 0; i < A.length; i++)
             pq.add(A[i]);
         for (i = 0; i < A.length; i++)
             A[i] = pq.poll();
     }

	static class Pair{
		int b;
		int c;
		Pair(int b,int c){
			this.b = b;
			this.c = c;
		}
	}
}
