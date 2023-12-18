import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	//FastScannerクラス、普通の Scannerクラスだとメモリと時間を大幅に喰らうので高速化する内部クラス。
	
	public static void main(String[]args) {
		FastScanner sc = new FastScanner(System.in);

		int N = Integer.parseInt(sc.next());
		ArrayList<ArrayList<SG>>deta= new ArrayList<ArrayList<SG>>();
		for(int i = 0;i<N;i++) {
			ArrayList<SG>list = new ArrayList<SG>();
			deta.add(list);
		}
		
		int[]A  = new int[N];
		for(int i = 0;i<N;i++) {
			A[i] = Integer.parseInt(sc.next());
			for(int j = 0;j<A[i];j++) {
				deta.get(i).add(new SG(Integer.parseInt(sc.next()),Integer.parseInt(sc.next())));
			}
		}
		
		int max = 0;
		
		for (int i=0; i<(Math.pow(2,N)); i++) {
			String s ="";
			int []usohon =new int[N]; 
			for (int j=0; j<N; j++) {
				if ((1&i>>j) == 1) {
					s += "1";
					usohon[j]=1;
				}
				else {s+="0";}
			}
			s = "1"+s;
			int shoujiki = digsum(Integer.valueOf(s))-1;
			s = s.substring(1, N+1);
			int []mujun = new int[N];
			int dame = 0;
			Arrays.fill(mujun, -1);
			/*
			outside:for(int z = 0;z<N;z++) {
				if(usohon[z]==0)continue;
				for(int j = 0;j<deta.get(z).size();j++) {
					if(mujun[deta.get(z).get(j).x-1]==-1) {
						mujun[deta.get(z).get(j).x-1]=deta.get(z).get(j).y;
					}
					if(mujun[deta.get(z).get(j).x-1]!=-1&&mujun[deta.get(z).get(j).x-1]!=deta.get(z).get(j).y) {
						dame = 1;
						break outside;
					}
				}
			}
			//System.out.println(s);
			
			//System.out.println(dame);
			for(int h = 0;h<N;h++) {
				//System.out.print(mujun[h]);
				//System.out.print(" ");
			}
			//System.out.println();
			
			if(dame==0) {
				
			char []c = s.toCharArray();
			int ok = 1;
			for(int w = 0;w<N;w++) {
				if(mujun[w]==-1)continue;
				if(c[w]!='0'+mujun[w]) {ok=0;
				break;
				
				}
			}
			if(ok==1&&max<shoujiki) {
				//System.out.println(s);
				max = shoujiki;
			}
			
			*/
			}
			
	
		System.out.println(max);
	
		}
		
		
		
		
	
	
	
	
	
	
	
	
	private static int digsum(int n) {//数字ｎの桁和
		int res = 0;
		while(n>0) {
			res+=n%10;//10で割った余りは一の位の桁に等しい
			n/=10;//一桁入れ終わったので削除
		}
		return res;
	}
	
	
	
	static class SG{
		int x;
		int y;
		SG(int X,int Y){
			x = X;y = Y;
		}
	}
	
	
	
	static class FastScanner {
		 
		private final InputStream in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;
 
		public FastScanner(InputStream source) {
			in = source;
		}
 
		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}
 
		private int readByte() {
			if (hasNextByte()) return buffer[ptr++];
			else return -1;
		}
 
		private static boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}
 
		private void skipUnprintable() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
		}
 
		public boolean hasNext() {
			skipUnprintable();
			return hasNextByte();
		}
 
		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
 
		public long nextLong() {
			if (!hasNext()) throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}

}
