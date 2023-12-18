import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class Main {
    private static FastScanner sc = new FastScanner();
    static Node[] V;
    static int[] c;
    static int nowidx;

    public static void main(String[] args) {
    	int n = sc.nextInt();
    	V = new Node[n];
    	for(int i=0; i<n; i++) {
    		V[i] = new Node();
    		V[i].idx = i;
    	}
    	for(int i=0; i<n-1; i++) {
    		int a = sc.nextInt() - 1;
    		int b = sc.nextInt() - 1;
    		V[a].nbr.add(b);
    		V[b].nbr.add(a);
    	}
    	c = new int[n];
    	for(int i=0; i<n; i++) {
    		c[i] = sc.nextInt();
    	}
    	Arrays.sort(c);
    	int max = 0;
    	for(int i=0; i<n-1; i++) {
    		max += c[i];
    	}
    	System.out.println(max);

    	nowidx = n-1;
    	V[0].dfs();
    	StringBuilder sb = new StringBuilder();
    	for(int i=0; i<n; i++) {
    		if(i != 0) sb.append(" ");
    		sb.append(V[i].cnode);
    	}
    	System.out.println(sb);
    }

    static class Node {
    	int idx;
    	int cnode;
        HashSet<Integer> nbr = new HashSet<>();
        boolean vst = false;
        void dfs() {
        	cnode = c[nowidx];
        	nowidx--;
        	vst = true;
        	for(int x : nbr) {
        		if(!V[x].vst) {
        			V[x].dfs();
        		}
        	}
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
