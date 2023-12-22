import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		FastReader in = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int N = in.nextInt(), M = in.nextInt(), K =in.nextInt();
		int[] d1 = new int[N], d2 = new int[M];
		for(int i = 0; i<N; i++)
			d1[i] = in.nextInt();
		for(int i = 0; i<M; i++)
			d2[i] = in.nextInt();
		Stack<Integer> s1 = new Stack<>(), s2 = new Stack<>();
		for(int i = d1.length-1; i>=0; i--)
			s1.add(d1[i]);
		for(int i = d2.length-1; i>=0; i--)
			s2.add(d2[i]);
		long time_taken = Math.min(s1.peek(), s2.peek()), read = 0;
		if(s1.peek()<s2.peek()) s1.pop();
		else s2.pop();
		while(time_taken<=K) {
			read++;
			if(s1.size()>0 && s2.size()>0) {
				time_taken += Math.min(s1.peek(), s2.peek());
				if(s1.peek()<s2.peek()) s1.pop();
				else s2.pop();
			}else if(s1.size()==0 && s2.size()!=0) {
				time_taken+=s2.pop();
			}else if(s2.size()==0 && s1.size()!=0) {
				time_taken+=s1.pop();
			}else if(s1.size()==0 && s2.size()==0) {
				break;
			}
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