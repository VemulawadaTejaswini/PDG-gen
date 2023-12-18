import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		FS reader = new FS();
		// write reader
		String s = reader.next();
		solver(s);
	}
	
	public static void solver(String str) {
		// write logic
        int len = str.length();
        long mod = (int)Math.pow(10,9)+7;
        long[][] dp = new long[(int)(Math.pow(10, 5))+1][13];
        for(int i=0; i<13; i++) {
            dp[0][i] = 0;
        }
        dp[0][0] = 1;
        int cnt = 0;
        
        for(int i=0; i<len; i++) {
            char s = str.charAt(i);
            if(s == '?') {
                long total = 1;
                for(int t=0; t<cnt; t++) {
                    total = (total * 10) % mod;
                }
                for(int j=0; j<13; j++) {
                    dp[i+1][j] = (total+mod*10-dp[i][4-(int)((j+2)/3)]-dp[i][8-(int)((j+1)/3)]-dp[i][12-(int)(j/3)])%mod;
                }
                cnt++;
            } else {
                for(int j=0; j<13; j++) {
                    //dp[i+1][j] = 0;
                }
                for(int j=0; j<13; j++) {
                    dp[i+1][(j*10+Character.getNumericValue(s))%13] += dp[i][j];
                }
            }
        }
        System.out.println(dp[len][5]%mod);
    }
	
	// Read Class
	static class FS {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;
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
	
		private int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
		private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
		private void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	
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
		public int nextInt() {
			return (int)nextLong();
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
			while(true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if(b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}
}