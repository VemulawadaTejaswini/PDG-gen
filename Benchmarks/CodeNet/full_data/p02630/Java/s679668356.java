import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception{
		FastReader in = new FastReader();
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = in.nextInt();
		long sum = 0;
		int[] arr = new int[1000001];
		for(int i = 0; i<n; i++) {
			int a = in.nextInt();
			arr[a]++;
			sum+=a;
		}
		int q = in.nextInt();
		for(int i = 0; i<q; i++) {
			int q1 = in.nextInt(), q2 = in.nextInt();
			sum+=(arr[q1]*(q2-q1));			
			out.println(sum);
			int a = arr[q1];
			arr[q1]=0;
			arr[q2]+=a;
		}
		
        
		
		
		
		
		out.close();
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
    } 
		
}
