import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Main {
	public static void main(String args[]) {
		FastScanner scanner = new FastScanner();
		n=scanner.nextInt();
		int m=scanner.nextInt();
		p=new int[n];
		int ans=0;
		for(int i=0;i<n;i++) {
			p[i]=scanner.nextInt()-1;
			if(i==p[i])ans++;
		}
		int[] x=new int[m];
		int[] y=new int[m];
		graph=new HashMap<>();
		for(int i=0;i<m;i++) {
			x[i]=scanner.nextInt()-1;
			y[i]=scanner.nextInt()-1;
			if (graph.containsKey(x[i])) {
				graph.get(x[i]).add(y[i]);
			} else {
				Set<Integer>set=new HashSet<>();
				set.add(y[i]);
				graph.put(x[i], set);
			}
			if (graph.containsKey(y[i])) {
				graph.get(y[i]).add(x[i]);
			} else {
				Set<Integer>set=new HashSet<>();
				set.add(x[i]);
				graph.put(y[i], set);
			}
		}
		for(int i=0;i<m;i++) {
			a=new HashSet<>();
			b=new HashSet<>();
			dfs(x[i]);
			for(int tar:a) {
				if(b.contains(tar)) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}

	static int n;
	static int[] p;
	static Map<Integer,Set<Integer>>graph;
	static Set<Integer>checked=new HashSet<>();
	static Set<Integer>a;
	static Set<Integer>b;
	private static void dfs(int i) {
		if(checked.contains(i)) {
			return;
		}else {
			checked.add(i);
		}
		if(i!=p[i]) {
			a.add(i);
			b.add(p[i]);
		}
		for(int j:graph.get(i)) {
				dfs(j);
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
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}
