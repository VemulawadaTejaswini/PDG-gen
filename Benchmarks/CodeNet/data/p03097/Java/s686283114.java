import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class Main {
    private static FastScanner sc = new FastScanner();
    static Node[] V;
    static ArrayDeque<Stack> stk = new ArrayDeque<>();
    static StringBuilder ans = new StringBuilder();

    public static void main(String[] args) {
    	int N = sc.nextInt();
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	char[] sa = numToBit(A, N);
    	char[] sb = numToBit(B, N);
    	//System.out.println(sa);
    	//System.out.println(sb);
    	int swap = 0;
    	for(int i=0; i<N; i++) {
    		if(sa[i] != sb[i]) swap++;
    	}
    	if(swap%2 == 0) {
    		System.out.println("NO");
    		return;
    	}
    	System.out.println("YES");

    	int n = (int)Math.pow(2, N);
    	V = new Node[n];
    	for(int i=0; i<n; i++) {
    		V[i] = new Node();
    		V[i].x = i ;
    		V[i].s = numToBit(i, N);
    	}
    	for(int i=0; i<n-1; i++) {
    		for(int d=0; d<N; d++) {
        		if(V[i].s[d] == '0') {
        			V[i].s[d] = '1';
        			V[i].nbr.add(bitToNum(V[i].s, N));
        			V[i].s[d] = '0';
        		} else {
        			V[i].s[d] = '0';
        			V[i].nbr.add(bitToNum(V[i].s, N));
        			V[i].s[d] = '1';
        		}
        	}
    	}
    	int nowNum = A;
    	boolean spaceflg = false;
    	while(true) {
    		V[nowNum].vst = true;
    		if(nowNum == 0) break;
    		if(spaceflg) {
    			ans.append(" " + nowNum);
    		} else {
    			ans.append(nowNum);
    			spaceflg = true;
    		}
    		for(int d=N-1; d>=0; d--) {
        		if(V[nowNum].s[d] == '1') {
        			V[nowNum].s[d] = '0';
        			int tmp = bitToNum(V[nowNum].s, N);
        			V[nowNum].s[d] = '1';
        			nowNum = tmp;
        			break;
        		}
        	}
    	}
    	String lastStr = "";
    	nowNum = (int)Math.pow(2, N) - 1;
    	while(true) {
    		//System.out.println(nowNum);
    		V[nowNum].vst = true;
    		lastStr += " " + nowNum;
    		if(nowNum == B) break;
    		for(int d=N-1; d>=0; d--) {
        		if(V[B].s[d] == '0') {
        			V[nowNum].s[d] = '0';
        			int tmp = bitToNum(V[nowNum].s, N);
        			V[nowNum].s[d] = '1';
        			nowNum = tmp;
        			break;
        		}
        	}
    	}
    	V[(int)Math.pow(2, N) - 1].vst = false;
    	nowNum = 0;
    	while(true) {
    		if(nowNum == (int)Math.pow(2, N) - 1) break;
    		System.out.println(nowNum);
    		V[nowNum].vst = true;
    		ans.append(" " + nowNum);
    		int tmp = nowNum;
    		for(int x : V[nowNum].nbr) {
    			//System.out.println(x);
    			if(V[x].vst) continue;
    			nowNum = x;
    			break;
        	}
    		if(tmp == nowNum) {
    			System.out.println("NO");
        		return;
    		}
    	}
    	ans.append(lastStr);
    	System.out.println(ans);
    }

    static char[] numToBit(int x, int N) {
    	char[] ret = new char[N];
    	for(int i=0; i<N; i++) {
    		if((x >> i)%2 == 0) {
    			ret[i] = '0';
    		} else {
    			ret[i] = '1';
    		}
    	}
    	return ret;
    }
    static int bitToNum(char[] s, int N) {
    	int ret = 0;
    	for(int i=0; i<N; i++) {
    		if(s[i] == '1') {
    			ret += Math.pow(2, i);
    		}
    	}
    	return ret;
    }

    static class Node {
        HashSet<Integer> nbr = new HashSet<>();
        int x;
        char[] s;
        boolean vst = false;
        void dfs(int dist, boolean mode) {

        }
    }

    static class Stack {
    	int idx;
		Stack(int idx) {
			this.idx = idx;
		}

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
