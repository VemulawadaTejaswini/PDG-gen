import java.util.*;
import java.io.*;
import java.lang.*;


public class Main{
	public static void main(String[] args) throws IOException{
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;++i)
			arr[i] = sc.nextInt();
		int[] dp = new int[n];
		dp[0] = 0;
		dp[1] = Math.abs(arr[1] - arr[0]);
		for(int i=2;i<n;++i){
			dp[i] = Math.min(Math.abs(arr[i]-arr[i-1])+dp[i-1],Math.abs(arr[i]-arr[i-2])+dp[i-2]);
		}
		System.out.println(dp[n-1]);
	}
}

class sc{
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static String next() throws IOException{
        while (!tokenizer.hasMoreTokens())
            tokenizer = new StringTokenizer(reader.readLine());
        return tokenizer.nextToken();
    }
    static int nextInt() throws IOException{
        return Integer.parseInt(next());
    }
    static double nextDouble() throws IOException{
        return Double.parseDouble(next());
    }
    static long nextLong() throws IOException{
        return Long.parseLong(next());
    }
    static float nextFloat() throws IOException{
    	return Float.parseFloat(next());
    }
}