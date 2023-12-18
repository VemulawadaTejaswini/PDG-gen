public class Main {
 
	public static void main(String[] args) {
		static FastScanner sc = new FastScanner(System.in);
		int n = sc.nextInt();
		int a[] = new int [n];
 
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
 
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) continue;
				if(a[i]==a[j]) {
					System.out.println("NO");
					return ;
				}
			}
		}
 
		System.out.println("YES");
 
	}
 
}
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		int n = sc.nextInt();
		int a[] = new int [n];
 
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
 
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) continue;
				if(a[i]==a[j]) {
					System.out.println("NO");
					return ;
				}
			}
		}
 
		System.out.println("YES");
 
	}
 
}


Class FastScanner {
    private final java.io.InputStream in = System.in;
    private final byte[] b = new byte[1024];
    private int p = 0;
    private int bl = 0;
    private boolean hNB() {
        if (p<bl) {
            return true;
        }else{
            p = 0;
            try {
                bl = in.read(b);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (bl<=0) {
                return false;
            }
        }
        return true;
    }
    private int rB() { if (hNB()) return b[p++]; else return -1;}
    private static boolean iPC(int c) { return 33 <= c && c <= 126;}
    private void sU() { while(hNB() && !iPC(b[p])) p++;}
    public boolean hN() { sU(); return hNB();}
    public String next() {
        if (!hN()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = rB();
        while(iPC(b)) {
            sb.appendCodePoint(b);
            b = rB();
        }
        return sb.toString();
    }
    public char nextChar() {
    	return next().charAt(0);
    }
    public long nextLong() {
        if (!hN()) throw new NoSuchElementException();
        long n = 0;
        boolean m = false;
        int b = rB();
        if (b=='-') {
            m=true;
            b=rB();
        }
        if (b<'0'||'9'<b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0'<=b&&b<='9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1||!iPC(b)){
                return (m?-n:n);
            }else{
                throw new NumberFormatException();
            }
            b = rB();
        }
    }
    public int nextInt() {
        if (!hN()) throw new NoSuchElementException();
        long n = 0;
        boolean m = false;
        int b = rB();
        if (b == '-') {
            m = true;
            b = rB();
        }
        if (b<'0'||'9'<b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0'<=b&&b<='9') {
                n *= 10;
                n += b-'0';
            }else if(b==-1||!iPC(b)){
                return (int) (m?-n:n);
            }else{
                throw new NumberFormatException();
            }
            b = rB();
        }
    }
    public int[] nextInts(int n) {
    	int[] a = new int[n];
    	for(int i=0;i<n;i++) {
    		a[i] = nextInt();
    	}
    	return a;
    }
    public int[] nextInts(int n,int s) {
    	int[] a = new int[n+s];
    	for(int i=s;i<n+s;i++) {
    		a[i] = nextInt();
    	}
    	return a;
    }
    public long[] nextLongs(int n) {
    	long[] a = new long[n];
    	for(int i=0;i<n;i++) {
    		a[i] = nextLong();
    	}
    	return a;
    }
    public int[][] nextIntses(int n,int m){
    	int[][] a = new int[n][m];
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			a[i][j] = nextInt();
    		}
    	}
    	return a;
    }
    
    public String[] nexts(int n) {
    	String[] a = new String[n];
    	for(int i=0;i<n;i++) {
    		a[i] = next();
    	}
    	return a;
    }
    void nextIntses(int n,int[] ...m) {
    	int l = m[0].length;
    	for(int i=0;i<l;i++) {
    		for(int j=0;j<m.length;j++) {
    			m[j][i] = nextInt();
    		}
    	}
    }
    void nextLongses(int n,long[] ...m) {
    	int l = m[0].length;
    	for(int i=0;i<l;i++) {
    		for(int j=0;j<m.length;j++) {
    			m[j][i] = nextLong();
    		}
    	}
    }
    
    Graph nextyukoGraph(int n,int m) {
    	Graph G = new Graph(n);
    	for(int i=0;i<m;i++) {
    		int a = nextInt()-1;
    		int b = nextInt()-1;
    		G.addEdge(a,b);
    	}
    	return G;
    }
    
    Graph nextGraph(int n,int m) {
    	Graph G = new Graph(n);
    	for(int i=0;i<m;i++) {
    		int a = nextInt()-1;
    		int b = nextInt()-1;
    		G.addEdge(a,b);
    		G.addEdge(b,a);
    	}
    	return G;
    }
    
    Graph nextWeightedGraph(int n,int m) {
    	Graph G = new Graph(n);
    	for(int i=0;i<m;i++) {
    		int a = nextInt()-1;
    		int b = nextInt()-1;
    		long c = nextLong();
    		G.addWeightedEdge(a,b,c);
    		G.addWeightedEdge(b,a,c);
    	}
    	return G;
    }
    
    Tree nextTree(int n) {
    	Tree T = new Tree(n);
    	for(int i=0;i<n-1;i++) {
    		int a = nextInt()-1;
    		int b = nextInt()-1;
    		T.addEdge(a,b);
    		T.addEdge(b,a);
    	}
    	return T;
    }
}