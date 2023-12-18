import java.util.*;
import java.io.*;

//ダメだったが記念上げ
public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		int card[][] = new int[n][2];
		for(int i=0;i<n;i++) {
			int a = fs.nextInt();
			card[i][0] = a;
		}
		for(int i=0;i<n;i++) {
			int b = fs.nextInt();
			card[i][1] = b;
		}
		int even[] = new int[(n+1)/2]; 
		int odd[] = new int[n/2];

		//bit全探索
		int INF = Integer.MAX_VALUE/2;
		int res = INF;
		for(int bit = 0; bit<(1<<n); bit++) {
			//bit = 011011011などで、1が裏を表すことにする
			int ura_odd = 0;
			int ura_eve = 0;
			int ura_odd_be = -1;
			int ura_eve_be = -1;
			int eve_point = 0;
			int odd_point = 0;
			int ans = 0;
			for(int i=0;i<n;i++) {
				if((bit >> i & 1) == 1) {
					if(i%2==0) {
						ura_eve++;
						even[eve_point++]=card[i][1]; //裏返して入れる
						if(ura_odd_be!=-1) {
							ans += (i - ura_odd_be + 1)/2;
						}
						ura_eve_be = i;
					}
					else {
						ura_odd++;
						odd[odd_point++]=card[i][1]; //裏返して入れる
						if(ura_eve_be!=-1) {
							ans += (i - ura_eve_be + 1)/2;
						}
						ura_odd_be = i;
					}
					
				}
				else {
					if(i%2==0) {
						even[eve_point++]=card[i][0]; //表のまま入れる
					}
					else {
						odd[odd_point++]=card[i][0]; //表のまま入れる
					}

				}
			}
			if(ura_eve!=ura_odd)continue; //この作り方はできない
			
			//ソートする
			for(int j=0;j<even.length-1;j++) {
				if(even[j]>even[j+1]) {
					ans += 3;
					int tmp = even[j];
					even[j] = even[j+1];
					even[j+1] = tmp;
				}
			}
			for(int j=0;j<odd.length-1;j++) {
				if(odd[j]>odd[j+1]) {
					ans += 3;
					int tmp = odd[j];
					odd[j] = odd[j+1];
					odd[j+1] = tmp;
				}
			}
			
			//単調増加になってなければcontinue;
			boolean no = false;
			for(int j=1;j<n;j++) {
				if(j%2==0) {
					if(even[j/2]<odd[j/2-1]) {
						no = true;
						break;
					}
				}
				else {
					if(odd[j/2]<even[j/2]) {
						no = true;
						break;
					}
				}
			}
			if(no)continue;
			res = Math.min(res, ans);
			
		}
	
		if(res == INF) System.out.println(-1);
		else System.out.println(res);
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