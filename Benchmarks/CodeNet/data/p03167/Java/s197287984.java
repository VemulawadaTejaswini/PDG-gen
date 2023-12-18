import java.io.BufferedReader;

import java.lang.Math;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

public class Main{
	static int dp[][];
	static char[][]grid;
	static long ans = 0;
	static int mod = (int) (1e9+7);
	public static void main (String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int h = sc.nextInt();
		int w = sc.nextInt();
		grid = new char[h][w];
		dp = new int[h][w];
		for(int i = 0 ; i < h ; i++)
			grid[i] = sc.next().toCharArray();
        for(int i=0; i<h; i++){
            if(grid[i][0]=='#')
                break;
            dp[i][0]=1;
        }
        for(int j=0; j<w; j++){
            if(grid[0][j]=='#')
                break;
            dp[0][j]=1;
        }
        for(int i=1; i<h; i++){
            for(int j=1; j<w; j++) {
                if(grid[i][j]!='#')
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % mod;
            }
        }
		pw.println(dp[h-1][w-1]);
		pw.close();
		}


	}
		

	


	
	
	
	
	 class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(String file) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}
	 }
	