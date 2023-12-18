package com.cp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a=sc.nextInt();
		if(a<105)
			System.out.println(0);
		else{
			int cnt=1;
			for(int i=106;i<=a;i++)
				if(printDivisors(i))cnt++;
			System.out.println(cnt);
		}
	}
	static boolean printDivisors(int n)
    {
		int cnt=0;
        for (int i=1;i<=n;i++)
            if (n%i==0)
                cnt++;
        return cnt==8;
    }

}
