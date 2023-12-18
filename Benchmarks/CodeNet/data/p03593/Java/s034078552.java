import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int[][] ans;
	static int alphabet=26;
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		int[] cha=new int[alphabet];
		ans=new int[H][W];
		Arrays.fill(cha, 0);
		for(int i=0; i<H; i++) {
			String a=sc.next();
			for(int j=0; j<W; j++) {
				cha[a.charAt(j)-'a']++;
			}
		}
		if(H%2==1 && W%2==1) {//奇数ｘ奇数
			boolean kisu=false;
			for(int i=0; i<alphabet; i++) {
				if(!kisu && cha[i]%2==1) {
					kisu=true;
				}
				else if(kisu && cha[i]%2==1) {
					pl("No");
					System.exit(0);
				}
			}
			int make4=(H/2)*(W/2);
			for(int i=0; i<alphabet; i++) {
				if(cha[i]>=4) {
					make4-=cha[i]/4;
				}
			}
			if(make4>0) {
				pl("No");
				System.exit(0);
			}
			//ここまで来たならOK
			pl("Yes");
		}
		else if(H%2==0 && W%2==0) {//偶数ｘ偶数
			for(int i=0; i<alphabet; i++) {
				if(cha[i]%4!=0) {
					pl("No");
					System.exit(0);
				}
			}
			//ここまで来たならOK
			pl("Yes");
		}
		else {
			if(H%2==1) {
				int make4=((H-1)/2)*(W/2);
				for(int i=0; i<alphabet; i++) {
					if(cha[i]>=4) {
						make4-=cha[i]/4;
					}
					if(cha[i]%2==1) {
						pl("No");
						System.exit(0);
					}
				}
				if(make4>0) {
					pl("No");
					System.exit(0);
				}
				//ここまで来たならOK
				pl("Yes");
			}
			else if(W%2==1) {
				int make4=(H/2)*((W-1)/2);
				for(int i=0; i<alphabet; i++) {
					if(cha[i]>=4) {
						make4-=cha[i]/4;
					}
					if(cha[i]%2==1) {
						pl("No");
						System.exit(0);
					}
				}
				if(make4>0) {
					pl("No");
					System.exit(0);
				}
				//ここまで来たならOK
				pl("Yes");
				System.exit(0);
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