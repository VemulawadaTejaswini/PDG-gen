import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		PrintStream out = null;
		try {
			sc = new Scanner(System.in);
			out = System.out;
			exec(sc, out);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		} finally {
			if(out != null) {
				out.close();
			}
			if(sc != null) {
				sc.close();
			}
		}
		System.exit(0);
	}
	static public class Index{
		private int head = 0;
		private int tail = 0;
		private int[] idx;
		public Index(int n) {
			this.idx = new int[n];
		}
		public void add(int i) {
			this.idx[tail] = i;
			tail++;
		}
		public void remove() {
			head++;
		}
		public int size() {
			return this.tail - this.head;
		}
		public int get(int i) {
			return idx[head+i];
		}
	}
	public static void exec(final Scanner sc, final PrintStream out) throws Exception{
		final int N = sc.nextInt();
		final String S = sc.next();

		final Index[] indexes = new Index[26];
		for(int i=0;i<26;i++) {
			indexes[i] = new Index(N);
		}

		for(int i=0;i<N;i++) {
			final int c = (int)(S.charAt(i)-'a');
			indexes[c].add(i);
		}

		int max = 0;
		for(int i=0;i<N-1;i++) {
			final char C = S.charAt(i);
			final int c = (int)(C-'a');
			indexes[c].remove(); // 自身をIndexから外す

			// 後続で同じ文字の出現数を取得
			final int size = indexes[c].size();
			if(size==0) {
				// 同じものがないなら次へ。
				continue;
			}
			for(int j = 0; j < size; j++) {
				int x = i;
				int y = indexes[c].get((j + size/2)%size);
				if(max > N - y) {
					// これ以降は最大値を超えられないので何もしない。
					continue;
				}
				if(max > y - x) {
					// 今の差分では最大値を超えられないので何もしない。
					continue;
				}

				int len = 1;
				while(x+len < y && y + len < N) {
					if(S.charAt(x+len)!=S.charAt(y+len)) {
						// 差異が発生したらそこで終了。
						break;
					}
					len++;
				}
				max = Math.max(max, len);
			}
		}
		out.println(max);
	}

}
