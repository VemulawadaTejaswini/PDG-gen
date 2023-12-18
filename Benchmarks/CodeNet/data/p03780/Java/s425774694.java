import java.io.*;
import java.util.*;

public class Main {
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
		int n = in.nextInt(), k = in.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) arr[i] = in.nextInt();
		int[] sums = new int[n+1];
		for(int i=1;i<=n;i++) sums[i] += sums[i-1] + arr[i-1];
		boolean[] vis = new boolean[n];
		for(int i=0;i<n;i++){
			for(int j=0;j<=n;j++){
				for(int l=j+1;l<=n;l++){
					int sum = sums[l] - sums[j];
					if(j <= i && i < l) continue;
					if(k - arr[i] <= sum && sum < k) vis[i] = true;
				}
			}
		}
		int count = 0;
		for(boolean b:vis) if(!b) count++;
		System.out.println(count);
	}
	

}
