import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		String s=sc.next();
		int[] mojisu=new int[3];
		Arrays.fill(mojisu,0);
		for(int i=0; i<s.length(); i++) {
			mojisu[s.charAt(i)-97]++;
		}
		int syurui=0;
		for(int i=0; i<3; i++) {
			if(mojisu[i]>0) {
				syurui++;
			}
		}
		if(syurui==1) {
			if(s.length()==1) {
				pl("YES");
			}
			else {
				pl("NO");	//2文字以上の同じ文字列はパリンドローム
			}
		}
		else if(syurui==2) {
			if(s.length()<=2) {
				pl("YES");
			}
			else {
				pl("NO");
			}
		}
		else {
			int length=0;
			Arrays.sort(mojisu);
			mojisu[1]-=mojisu[0];
			mojisu[2]-=mojisu[0];
			mojisu[0]=0;
			length=mojisu[1]+mojisu[2];
			syurui=0;
			for(int i=0; i<3; i++) {
				if(mojisu[i]>0) {
					syurui++;
				}
			}
			if(syurui==0) {
				pl("YES");
			}
			else if(syurui==1) {
				if(length==1) {
					pl("YES");
				}
				else {
					pl("NO");	//2文字以上の同じ文字列はパリンドローム
				}
			}
			else if(syurui==2) {
				if(length<=2) {
					pl("YES");
				}
				else {
					pl("NO");
				}
			}
		}
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
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}
