import java.util.*;
import java.io.*;
public class Main{
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
	
	public static void main(String[] args) {
		FastReader in = new FastReader();
		
			int n = in.nextInt();
			int[] array = new int[n];
			for(int i = 0; i < n; i++){
				array[i] = in.nextInt(); 
			}
			Arrays.sort(array);
			int ans = 0;
			for(int i = 0; i < n-2; i++){
				for(int j = i+1; j < n-1; j++){
					for(int k  = j+1; k < n; k++){
						if(array[i] + array[j] > array[k] && array[i]!=array[j] && array[j]!=array[k] && array[k]!=array[i]){
							ans++;
						}
					}
				}
			}
			System.out.println(ans);
	}
}