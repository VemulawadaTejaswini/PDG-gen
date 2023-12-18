import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main {
    private static FastScanner sc = new FastScanner();
    private static boolean DEBUG_FLG = false;

    public static void main(String[] args) {
    	int N = sc.nextInt();
    	int Q = sc.nextInt();
    	char[] s = sc.next().toCharArray();
    	ArrayList<Integer>[] dic = new ArrayList[26];
    	for(int i=0; i<26; i++) {
    		dic[i] = new ArrayList<>();
    	}
    	int[] gol = new int[N];
    	int[] golnum = new int[26];
    	for(int i=0; i<N; i++) {
    		dic[s[i]-'A'].add(i);
    		gol[i]++;
    		golnum[s[i]-'A']++;
    	}
    	for(int i=0; i<Q; i++) {
    		char t = sc.next().charAt(0);
    		char d = sc.next().charAt(0);
    		if(golnum[t-'A'] == 0) continue;
    		for(int x : dic[t-'A']) {
    			if(x == 0 && d == 'L') {
    				golnum[t-'A'] -= gol[x];
    				gol[x] = 0;
    			} else if(x == N-1 && d == 'R') {
    				golnum[t-'A'] -= gol[x];
    				gol[x] = 0;
    			} else {
    				if(d == 'L') {
    					golnum[t-'A'] -= gol[x];
    					golnum[s[x-1]-'A'] += gol[x];
    					gol[x-1] += gol[x];
    					gol[x] = 0;
    				} else {
    					golnum[t-'A'] -= gol[x];
    					golnum[s[x+1]-'A'] += gol[x];
    					gol[x+1] += gol[x];
    					gol[x] = 0;
    				}
    			}
    		}
    	}
    	int ans = 0;
    	for(int i=0; i<26; i++) {
    		ans +=  golnum[i];
    	}
    	System.out.println(ans);
    }

    static void debug(long... args) {
    	if(!DEBUG_FLG) return;
    	boolean flg = false;
    	for(long s : args) {
    		if(flg) System.out.print(" ");
    		flg = true;
    		System.out.print(s);
    	}
    	System.out.println();
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
