import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		FastReader in = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int N = in.nextInt(), M = in.nextInt(), K =in.nextInt();
		LinkedList<Integer> A = new LinkedList<>(), B = new LinkedList<>();
		for(int i = 0; i<N; i++)
			A.add(in.nextInt());
		for(int i = 0; i<M; i++)
			B.add(in.nextInt());
		long time_taken = 0, read = 0;
		while(time_taken<K) {
			if(!A.isEmpty() && !B.isEmpty()) {
				if(A.getFirst()<B.getFirst()) {
				time_taken+=A.getFirst();
				if(time_taken>K) break;
				read++;
				A.removeFirst();
				}else {
					time_taken+=B.getFirst();
					if(time_taken>K) break;
					read++;
					B.removeFirst();
				}
			}else if(A.isEmpty() && !B.isEmpty()) {
				time_taken+=B.getFirst();
				if(time_taken>K) break;
				read++;
				B.removeFirst();
			}else if(!A.isEmpty() && B.isEmpty()) {
				time_taken+=A.getFirst();
				if(time_taken>K) break;
				read++;
				A.removeFirst();
			}else break;
		}
		out.print(read);
		
		out.close();
				
    }
	static int search(int[] time, int key, int low, int high) {
		while(low<=high) {
			int mid = (low+high)/2;
			if(time[mid]>key) high = mid-1;
			else if(time[mid]<key) low = mid+1;
			else return mid+1;
		}
		return low;
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