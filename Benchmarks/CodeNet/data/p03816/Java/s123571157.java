import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int N=sc.nextInt();
		HashMap<Integer,Integer> cards=new HashMap<Integer,Integer>();
		for(int i=0; i<N; i++) {
			int tmp=sc.nextInt();
			if(cards.containsKey(tmp)) {
				cards.put(tmp, cards.get(tmp)+1);
			}
			else {
				cards.put(tmp, 1);
			}
		}
		int[][] cards_cpy=new int[cards.size()][2];
		int i=0;
		for(Entry<Integer,Integer> e:cards.entrySet()) {
			cards_cpy[i][0]=e.getValue();
			cards_cpy[i][1]=e.getKey();
			//pl(cards_cpy[i][0]+" "+cards_cpy[i][1]);
			i++;
		}
		quick_sort(cards_cpy,0,cards.size()-1);
		int itimai=0;
		int fukusu=0;
		int fukusyu=0;
		for(i=0; i<cards.size(); i++) {
			if(cards_cpy[i][0]>1) {
				fukusyu++;
				fukusu+=cards_cpy[i][0];
			}
			else if(cards_cpy[i][0]==1) {
				itimai++;
			}
		}
		if((fukusu-fukusyu)%2==0) {
			pl(itimai+fukusyu);
		}
		else {
			pl(itimai+fukusyu-1);
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
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
	static void quick_sort(int[][] d, int left, int right) {
		if (left>=right) {
			return;
		}
		int p = d[(left+right)/2][0];
		int l = left, r = right;
		int tmp,tmp1,tmp2;
		while(l<=r) {
			while(d[l][0] < p) { l++; }
			while(d[r][0] > p) { r--; }
			if (l<=r) {
				tmp = d[l][0]; d[l][0] = d[r][0]; d[r][0] = tmp;
				tmp1=d[l][1]; tmp2=d[r][1]; d[l][1]=tmp2; d[r][1]=tmp1;
				l++; r--;
			}
		}
		quick_sort(d, left, r);
		quick_sort(d, l, right);
	}
}