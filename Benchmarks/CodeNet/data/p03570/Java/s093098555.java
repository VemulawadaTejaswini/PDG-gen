import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	
	public static void main(String[] args) {
		char[] s = sc.next().toCharArray();
		int ans = 1;
		int l = 0;
		int r = s.length - 1;
		b:
		while(true) {
			int[] alp1 = new int[26];
			int[] alp2 = new int[26];
			for(int i=l; i<=r; i++) {
				alp1[s[i] - 'a']++;
				alp2[s[i] - 'a']++;
			}
			int templ = l;
			int tempr = r;
			a:
			for(int i=r; i>=l; i--) {
				boolean flag = false;
				for(int j=0; j<26; j++) {
					if(alp1[j]%2 == 1) {
						if(!flag) {
							flag = true;
						} else {
							alp1[s[i] - 'a']--;
							continue a;
						}
					}
				}
				templ = i + 1;
				if(i == r) break b;
				break a;
			}
			c:
			for(int i=l; i<=r; i++) {
				boolean flag = false;
				for(int j=0; j<26; j++) {
					if(alp2[j]%2 == 1) {
						if(!flag) {
							flag = true;
						} else {
							alp2[s[i] - 'a']--;
							continue c;
						}
					}
				}
				tempr = i - 1;
				break c;
			}
			if(r - templ <= tempr - l) {
				l = templ;
			} else {
				r = tempr;
			}
			ans++;
		}
		System.out.println(ans);
	}
	
	static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if(ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch(IOException e) {
                    e.printStackTrace();
                }
                if(buflen <= 0) {
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
            return Long.parseLong(next());
        }
        public int nextInt(){
            return Integer.parseInt(next());
        }
        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }
}
