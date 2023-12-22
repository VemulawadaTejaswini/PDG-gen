import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int[] packet=new int[52];
		int INF=1000000007;
		Arrays.fill(packet, INF);
		packet[0]=0;
		for(int i=1; i<52; i++) {
			if(i-2>=0 && packet[i-2]<INF) {
				packet[i]=Math.min(packet[i], packet[i-2]+380);
			}
			if(i-3>=0 && packet[i-3]<INF) {
				packet[i]=Math.min(packet[i], packet[i-3]+550);
			}
			if(i-5>=0 && packet[i-5]<INF) {
				packet[i]=Math.min(packet[i], packet[i-5]+850);
			}
			if(i-10>=0 && packet[i-10]<INF) {
				packet[i]=Math.min(packet[i], packet[i-10]+1520);
			}
			if(i-12>=0 && packet[i-12]<INF) {
				packet[i]=Math.min(packet[i], packet[i-12]+1870);
			}
			if(i-15>=0 && packet[i-15]<INF) {
				packet[i]=Math.min(packet[i], packet[i-15]+2244);
			}
		}
		while(true) {
			int a=sc.nextInt()/100;
			if(a==0) {
				System.exit(0);
			}
			else {
				pl(packet[a]);
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
}
