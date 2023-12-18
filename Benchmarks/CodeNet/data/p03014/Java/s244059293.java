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
		int H = sc.nextInt();
		int W = sc.nextInt();
		String S[] = new String[H];
		for(int i=0;i<H;i++)S[i]=sc.next();
		
		
		int a[][]= new int[2000][2000];
		for(int i=0;i<H;i++) {
			int cnt = 0;
			for(int j=0;j<W;j++) {
				if(S[i].charAt(j)=='.' && j!=W-1)cnt++;
				else {
					if(j==W-1&&S[i].charAt(j)=='.') {
						cnt++;
						j++;
					}
					for(int k=1;k<=cnt;k++) {
						a[i][j-k]+=cnt;
					}
					cnt=0;
				}
			}
		}
 
		for(int i=0;i<W;i++) {
			int cnt = 0;
			for(int j=0;j<H;j++) {
				if(S[j].charAt(i)=='.' && j!=H-1)cnt++;
				else {
					if(j==H-1&&S[j].charAt(i)=='.') {
						cnt++;
						j++;
					}
					for(int k=1;k<=cnt;k++) {
						a[j-k][i]+=cnt;
					}
					cnt=0;
				}		
			}
		}
		
		int ans=0;
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				ans = Math.max(a[i][j],ans);
			}
		}
		out.println(ans-1);
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
