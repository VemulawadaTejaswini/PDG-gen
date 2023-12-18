import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		int N=sc.nextInt();
		int x=sc.nextInt()-1;
		int y=sc.nextInt()-1;
		int[][] takahasi_move=new int[N+1][4];
		int[][] aoki_move=new int[N+1][4];
		for(int i=0; i<=N; i++) {
			Arrays.fill(takahasi_move[i],0);
			Arrays.fill(aoki_move[i],0);
		}
		String t=sc.next();
		String a=sc.next();
		for(int i=1; i<=N; i++) {
			if(t.charAt(i-1)=='U') {
				takahasi_move[i][0]++;
			}
			else if(t.charAt(i-1)=='D') {
				takahasi_move[i][1]++;
			}
			else if(t.charAt(i-1)=='L') {
				takahasi_move[i][2]++;
			}
			else if(t.charAt(i-1)=='R') {
				takahasi_move[i][3]++;
			}

			if(a.charAt(i-1)=='U') {
				aoki_move[i][0]++;
			}
			else if(a.charAt(i-1)=='D') {
				aoki_move[i][1]++;
			}
			else if(a.charAt(i-1)=='L') {
				aoki_move[i][2]++;
			}
			else if(a.charAt(i-1)=='R') {
				aoki_move[i][3]++;
			}
		}

		for(int i=1; i<=N; i++) {
			for(int j=0; j<4; j++) {
				takahasi_move[i][j]=takahasi_move[i][j]+takahasi_move[i-1][j];
				aoki_move[i][j]=aoki_move[i][j]+aoki_move[i-1][j];
			}
		}

		for(int i=1; i<=N; i++) {
			//高橋くんのばん
			if(takahasi_move[i][0]-aoki_move[i-1][1]>0) {	//結果的に↑に行く場合
				if(y-(takahasi_move[i][0]-aoki_move[i-1][1])<0) {
					pl("YES");		//青木くんの最大限の抵抗でも上に押しやられる
					System.exit(0);
				}
				else {
					//青木くんの押しが若干弱く、かろうじて盤面にコマが残るなら、まだその時はコマは耐えることができる
				}
			}
			else if(takahasi_move[i][0]-aoki_move[i-1][1]<=0) {	//青木くんの押しの方が強い場合
				//青木くんが手加減することでコマを落とさずにすむ
			}

			if(takahasi_move[i][1]-aoki_move[i-1][0]>0) {	//結果的に↓に行く場合
				if(y+(takahasi_move[i][1]-aoki_move[i-1][0])>=H) {	//高橋くんの押しが強い時
					//青木くんがどう頑張ってもコマを落とすのを防げない
					pl("YES");
					System.exit(0);
				}
				else {
					//
				}
			}
			else if(takahasi_move[i][1]-aoki_move[i-1][0]<=0) {	//アオキのほうが強い
				//
			}

			if(takahasi_move[i][2]-aoki_move[i-1][3]>0) {	//←に押し負ける
				if(x-(takahasi_move[i][2]-aoki_move[i-1][3])<0) {	//高橋くんにゴリおされる
					pl("YES");
					System.exit(0);
				}
				else {
					//
				}
			}
			else if(takahasi_move[i][2]-aoki_move[i-1][3]<=0) {
				//
			}

			if(takahasi_move[i][3]-aoki_move[i-1][2]>0) {	//右に押し負ける時
				if(x+takahasi_move[i][3]-aoki_move[i-1][2]>=W) {
					pl("YES");
					System.exit(0);
				}
				else {
					//
				}
			}
			else if(takahasi_move[i][3]-aoki_move[i-1][2]<=0) {
				//
			}
		}
		pl("NO");
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}
