import java.util.*;
import java.io.*;

public class Main {
	static boolean xminus, yminus, xyswap;
	static int n, ans[][];
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int K = fs.nextInt(), X = fs.nextInt(), Y = fs.nextInt();
		//前処理
		if(X<0) {
			X = -X;
			xminus = true;
		}
		if(Y<0) {
			Y = -Y;
			yminus = true;
		}
		if(X<Y) {
			int tmp = X;
			X = Y;
			Y = tmp;
			xyswap = true;
		}
		
		// 本処理
		// X > Y , X>=0, Y>=0　として解く
		if(K%2==0 && (X+Y)%2==1) {
			System.out.println(-1);
			return;
		}
		if(K%2==1) {
			if(X + Y > K) {
				// 最短でたどり着く回数nを求める
				int n = (X + Y + K - 1)/K; //切り上げ
				if((X + Y) % 2 != n * K % 2) n++; //偶数回目の移動ではx + yが偶数になる（奇も同様）ので、
												  //(X , Y)を移動範囲内にするまでの移動回数nが、X+Yと偶奇が異なればn回ではたどり着けず、次でたどり着く。		
				int rem = n*K - (X + Y); //余分に移動する必要がある距離
				
				ans = new int[n][2];
				int cnt = 0;
				//まず上に行く
				int distY = 0;
				while(Y + rem/2 >= distY + K) {
					distY += K; 
					ans[cnt][0] = 0;
					ans[cnt++][1] = K;
				}
				int remY = (Y + rem/2) - distY; 
				ans[cnt][0] = K - remY;
				ans[cnt++][1] = remY;				
				int distX = K - remY;
				while(X >= distX + K) {
					distX += K; 
					ans[cnt][0] = K;
					ans[cnt++][1] = 0;				
				}
				ans[cnt][0] = X - distX;
				ans[cnt++][1] = -rem/2;		
			}
			// X + Y < K のとき
			else {
				//3回でたどり着ける
				if((X + Y) % 2==1) {
					n = 3;
					ans = new int[n][2];
					ans[0][0] = X;
					ans[0][1] = K-X;  
					int halfremY = -(K - (X + Y))/2;
					ans[1][0] = K - halfremY;
					ans[1][1] = halfremY;
					ans[2][0] = - ans[1][0];
					ans[2][1] = ans[1][1];
				}
				//2回でたどり着ける X + Y % 2 == 0
				else {
					n = 2;
					ans = new int[n][2];
					int rem = 2 * K - (X + Y);
					ans[0][0] = K - (rem/2 + Y);
					ans[0][1] = rem/2 + Y;
					ans[1][0] = X - ans[0][0]; 
					ans[1][1] = -rem/2;							
				}
				
			}
		}
		//Kが偶数のとき（X + Yも偶数）
		else {
			if(X + Y > K) {
				int n = (X + Y + K - 1)/K; //切り上げ
				int rem = n*K - (X + Y); //余分に移動する必要がある距離
				
				ans = new int[n][2];
				int cnt = 0;
				//まず上に行く
				int distY = 0;
				while(Y + rem/2 >= distY + K) {
					distY += K; 
					ans[cnt][0] = 0;
					ans[cnt++][1] = K;
				}
				int remY = (Y + rem/2) - distY; 
				ans[cnt][0] = K - remY;
				ans[cnt++][1] = remY;				
				int distX = K - remY;
				while(X >= distX + K) {
					distX += K; 
					ans[cnt][0] = K;
					ans[cnt++][1] = 0;				
				}
				ans[cnt][0] = X - distX;
				ans[cnt++][1] = -rem/2;		
				}
			else {
				n = 2;
				ans = new int[n][2];
				int rem = 2 * K - (X + Y);
				ans[0][0] = K - (rem/2 + Y);
				ans[0][1] = rem/2 + Y;
				ans[1][0] = X - ans[0][0]; 
				ans[1][1] = -rem/2;		
			}
		}
		printAns();
	}
	static void printAns() {
		if(xyswap) {
			for(int i=0;i<n;i++) {
				int tmp = ans[i][0];
				ans[i][0] = ans[i][1];
				ans[i][1] = tmp;
			}
		}
		if(xminus) {
			for(int i=0;i<n;i++) {
				ans[i][0] = -ans[i][0];
			}
		}
		if(yminus) {
			for(int i=0;i<n;i++) {
				ans[i][1] = -ans[i][1];
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(n + "\n");
		for(int t[]:ans) {
			sb.append(t[0] + " " + t[1] + "\n");
		}
		System.out.println(sb.toString());
	}
}

//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}