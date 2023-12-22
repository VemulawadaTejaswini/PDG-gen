import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
    	FastIO sc = new FastIO(System.in);
    	PrintWriter out = new PrintWriter(System.out);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	if(n%2==1) {
    		int cnt = 1;
    		for(int i=0; i<m; i++) {
    			System.out.println(cnt + " " + (n-cnt));
    			cnt++;
    		}
    	}else {
    		int cnt = 1;
    		int idx = 1;
    		for(int i=0; i<m; i++) {
    			if(idx==1&&(n-cnt+idx-cnt)<=n/2) idx = 0;
    			System.out.println(cnt + " " + (n-cnt+idx));
    			cnt++;
    		}
    	}
    	out.close();
    }
    static class FastIO {
		 
		// Is your Fast I/O being bad?
 
		InputStream dis;
		byte[] buffer = new byte[1 << 17];
		int pointer = 0;
 
		public FastIO(String fileName) throws IOException {
			dis = new FileInputStream(fileName);
		}
 
		public FastIO(InputStream is) throws IOException {
			dis = is;
		}
 
		int nextInt() throws IOException {
			int ret = 0;
 
			byte b;
			do {
				b = nextByte();
			} while (b <= ' ');
			boolean negative = false;
			if (b == '-') {
				negative = true;
				b = nextByte();
			}
			while (b >= '0' && b <= '9') {
				ret = 10 * ret + b - '0';
				b = nextByte();
			}
 
			return (negative) ? -ret : ret;
		}
 
		long nextLong() throws IOException {
			long ret = 0;
 
			byte b;
			do {
				b = nextByte();
			} while (b <= ' ');
			boolean negative = false;
			if (b == '-') {
				negative = true;
				b = nextByte();
			}
			while (b >= '0' && b <= '9') {
				ret = 10 * ret + b - '0';
				b = nextByte();
			}
 
			return (negative) ? -ret : ret;
		}
 
		byte nextByte() throws IOException {
			if (pointer == buffer.length) {
				dis.read(buffer, 0, buffer.length);
				pointer = 0;
			}
			return buffer[pointer++];
		}
 
		String next() throws IOException {
			StringBuffer ret = new StringBuffer();
 
			byte b;
			do {
				b = nextByte();
			} while (b <= ' ');
			while (b > ' ') {
				ret.appendCodePoint(b);
				b = nextByte();
			}
 
			return ret.toString();
		}
 
	}
}