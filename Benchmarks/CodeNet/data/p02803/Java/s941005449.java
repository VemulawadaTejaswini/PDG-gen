import java.util.*;
import java.io.*;
class Pair<K, V> {
    private final K element0;
    private final V element1;
    public static <K, V> Pair<K, V> createPair(K element0, V element1) {
        return new Pair<K, V>(element0, element1);
    }
    public Pair(K element0, V element1) {
        this.element0 = element0;
        this.element1 = element1;
    }
    public K first() {
        return element0;
    }
    public V second() {
        return element1;
    }
}

public class Main {
	static char[][] jardin = new char[21][21];
	static boolean[][] visited = new boolean[21][21];
	static int[] xx = {0,0,1,-1};
	static int[] yy = {1,-1,0,0};
	static int alt,anch,max = 0;
	public static void BFS(int in, int in2, int targ1, int targ2) {
		Queue<Pair<Integer,Integer>> Q = new LinkedList<Pair<Integer,Integer>>();
		Q.add(new Pair(in,in2));
		for(int i = 0;i<21;i++) {
			for(int i2 = 0;i2<21;i2++) {
				visited[i][i2] = false;
			}
		}
		Pair<Integer,Integer> aux;
		int cont = -1;
		int xau, yau;
		boolean encont = false;
		while(!Q.isEmpty()&!encont) {
			cont++;
			int mamon = Q.size();
			for(int i = 0;i<mamon&!encont;i++) {
				aux = Q.poll();
				if(aux.first()==targ1 & aux.second()==targ2) {
					if(max<cont) max = cont;
					encont = true;
					continue;
				}
				for(int o = 0;o<4;o++) {
					xau=aux.second()+xx[o];
					yau=aux.first()+yy[o];
					if(xau>=0 & xau<anch & yau>=0 & yau<alt) {
						if(!visited[yau][xau] & jardin[yau][xau] != '#') {
							Q.add(new Pair(yau, xau));
							visited[yau][xau] = true;
						}
					}
				}
			}
		}
	}
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        Solve solver = new Solve();
        solver.solve(1, in, out);
        out.close();
    }
    
    static class Solve {
    	public void solve(int testNumber, InputReader in, OutputWriter out) {
    		int iniciox = 1, inicioy = 1, a;
    		alt = in.nextInt();
    		anch = in.nextInt();
    		for(int i = 0;i<alt;i++) {
    			String ne = in.next();
    			for(int o = 0;o<anch;o++) {
    				jardin[i][o] = ne.charAt(o);
    			}
    		}
    		for(int i = 0;i<alt;i++) {
    			for(int o = 0;o<anch;o++) {
    				if(jardin[i][o]!='#') {
    					for(int i2 = 0;i2<alt;i2++) {
    		    			for(int o2 = 0;o2<anch;o2++) {
    		    				if(jardin[i2][o2]!='#') {
    		    					BFS(i,o,i2,o2);
    		    				}
    		    			}
    					}
    				}
    			}
    		}
    		out.println(max);
    		
    	}
    }
    	
    
    static class OutputWriter {
	    private final PrintWriter writer;
	
	    public OutputWriter(OutputStream outputStream) {
	        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
	    }
	
	    public OutputWriter(Writer writer) {
	        this.writer = new PrintWriter(writer);
	    }
	
	    public void close() {
	        writer.close();
	    }
	
	    public void println(String string) {
	        writer.println(string);
	    }
	    
	    public void println(int number) {
	        writer.println(number);
	    }
	    
	    public void println(long number) {
	        writer.println(number);
	    }
	    
	    public void println(double number) {
	    	writer.println(number);
	    }
	    
	    public void print(long number) {
	        writer.print(number);
	    }
	    
	    public void print(int number) {
	        writer.print(number);
	    }
	    
	    public void print(String string) {
	        writer.print(string);
	    }
	    
	    public void print(double number) {
	    	writer.print(number);
	    }
	}
    
	static class InputReader {
		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;
		
		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}
		
		public String nextLine() {
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (b!=10) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		
		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}
 
		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}
 
		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}
 
		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}
 
		public boolean hasNext() {
			skip();
			return hasNextByte();
		}
 
		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
 
		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}
 
		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}
		
		public double nextDouble() {
			return Double.parseDouble(next());
		}
 
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}
 
		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}
 
		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}
}
    