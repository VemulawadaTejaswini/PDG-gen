import java.io.*;
import java.util.*;

public class Main {
    static long mod = (int)Math.pow(10,9)+7;
    static int n, max = 100000000 , a[][], memo[][];
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		n = sc.nextInt();
		a = new int[n][2];
		memo = new int[51][1 << n];
		for (int[] x : memo){
		    Arrays.fill(x, -1);
		}
		for (int j = 0; j < 2; j++){
		    for (int i = 0; i < n; i++){
		        a[i][j] = sc.nextInt();
		    }
		}
		int ans = dp(0,0,0);
		pw.println(ans >= max ? -1 : ans);
		pw.close();
	}
	    /*
	        msk = 既に使用したかどうかの判定
	        memo[last][msk] = mskのbitを使用した状態で一番最後の数字がlastになる最小の転倒数
	        last <= valの未使用bitが存在する場合、dp(使用した値のbit+msk,idx++,val)を呼び出す(そうでない場合はそのままreturn)
	        newPosは値の位置 + i < jであるものの内、既に使用されている(mskに追加されている)値の数
	        
	    */
		static int dp(int msk, int idx, int last) {
		if (idx == n)
			return 0;
		if (memo[last][msk] != -1)
			return memo[last][msk];
		int ans = max;
		for (int put = 0; put < n; put++) {
			if ((msk & 1 << put) != 0){ 
			    continue;
			}
			int all = (1 << (put + 1)) - 1; //これまで適用したビット
			int newPos = put + Integer.bitCount(msk&~all);
			int val = a[put][Math.abs(put - idx) % 2]; //Math.abs(put - idx) % 2 == 0 ? 表 : 裏
			//System.out.println(idx+" "+last+" "+msk+" "+ put+" "+all+" "+newPos+" "+val + " " + Integer.bitCount(msk&~all));
			if (val >= last) {
				ans = Math.min(ans, dp(msk | 1 << put, idx + 1, val) + Math.abs(newPos - idx));
			}
		}
		return memo[last][msk] = ans;
 
	}
}

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

