import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		ArrayList<Integer> unko=new ArrayList<Integer>();
		int N=sc.nextInt();
		for(int i=0; i<N; i++) {
			unko.add(sc.nextInt());
		}
		Collections.sort(unko);
		//System.out.println(unko.toString());
		int kosu=0;
		int abb=unko.size();
		for(int i=0; i<abb; i++) {
			int a=unko.get(unko.size()-1);
			int max=maa(a);
			int hosu=max-a;
			int ban=unko.indexOf(hosu);
			if(ban>=0) {
				kosu++;
				unko.remove(unko.size()-1);
				unko.remove(ban);
			}
			else {
				unko.remove(unko.size()-1);
			}
			if(unko.size()==0) {
				break;
			}
			//System.out.println(ban);
		}
		System.out.println(kosu);
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
	}
	static int maa(int a) {
		int k=0;
		int b=a;
		while(b>0) {
			k++;
			b/=2;
		}
		int aaa=1;
		for(int i=0; i<k; i++) {
			aaa*=2;
		}
		if(aaa>=2*a) {
			aaa=a;
		}
		return aaa;
	}
}