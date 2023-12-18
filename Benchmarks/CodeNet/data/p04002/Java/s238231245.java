import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.NoSuchElementException;
public class Main {
	static int[] vx = {-2,-1,0,1,2};
	static int[] vy = {-2,-1,0,1,2};
		static HashMap<Long, Integer> map = new HashMap<Long,Integer>();
		static HashMap<Long, Integer> check = new HashMap<Long,Integer>();
		public static void main(String[] args) {
			FastScanner sc = new FastScanner();
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			int[] a = new int[N];
			int[] b = new int[N];
			for(int i = 0; i < N; i++) {
				a[i] = sc.nextInt()-1;
				b[i] = sc.nextInt()-1;
				map.put(a[i] * 1000000001L + b[i], 1);
			}
			long[] ans = new long[10];
			for(int i = 0; i < N; i++) {
				long y = a[i];
				long x = b[i];
				for(int j = 0; j < vx.length; j++) {
					for(int k = 0; k < vy.length; k++) {
						long ty = y + vy[j];
						long tx = x + vx[k];
						if(ty + 2 >= H || tx + 2 >= W || ty < 0 || tx < 0) continue;
						long ss = ty * 1000000001L + tx;
						if(check.containsKey(ss)) continue;
						check.put(ss, 1);
						int sum = 0;
						for(int l = 0; l < 3; l++) {
							for(int m = 0; m < 3; m++) {
								long cy = ty + l;
								long cx = tx + m;
								long sss = cy * 1000000001L + cx;
								if(map.containsKey(sss)) sum++;
							}
						}
						ans[sum]++;
					}
				}
			}
			long ssx = (long)(H-2) * (W-2);
			for(int i = 1; i < 10; i++) {
				ssx -= ans[i];
			}
			ans[0] = ssx;
			for(int i = 0; i < 10; i++) {
				System.out.println(ans[i]);
			}
			
		}

}
class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
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
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
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
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        if (!hasNext()) throw new NoSuchElementException();
        int n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
}