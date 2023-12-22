
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Main {
	static PrintWriter out = new PrintWriter(System.out);
	static Scanner stdIn = new Scanner(System.in);
	static FastScanner sc = new FastScanner();
	static int INF = 2 << 20;
	
	public static void main(String[] args) {
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			double [][] cost = new double[n+1][n+1];
			
			for(int i = 0; i < n+1; i++) {
				Arrays.fill(cost[i], INF);
			}
			Data[] list = new Data[n];
			for(int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				list[i] = new Data(a,b,c);
			}
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					double sum = Math.sqrt((list[i].x - list[j].x)*(list[i].x - list[j].x) + (list[i].y - list[j].y) * (list[i].y - list[j].y));
					if(sum > 50.0) {
						continue;
					}
					cost[list[i].id][list[j].id] = sum;
				}
			}
			
			int m = sc.nextInt();
			
			for(int i = 0; i < m; i++) {
				double[] d = new double[n+1];
				boolean[] used = new boolean[n+1];
				int[] prev = new int[n+1];
				int s = sc.nextInt();
				int g = sc.nextInt();
				
				Arrays.fill(d, INF);
				Arrays.fill(used, false);
				Arrays.fill(prev, -1);
				d[s] = 0;
				
				while(true) {
					int v = -1;
					for(int u= 0; u < n+1; u++) {
						if(!used[u] && (v == -1 || d[u] < d[v])) v = u;
					}
					
					if(v == -1) break;
					used[v] = true;
					
					for(int u = 0; u < n+1; u++) {
						if(d[u] > d[v] + cost[v][u]) {
							d[u] = d[v] + cost[v][u];
							prev[u] = v;
						}
					}
				}
				
				if(d[g] == INF) {
					out.println("NA");
					continue;
				}
				
				ArrayList<Integer> Xist = new ArrayList<Integer>();
				for(; g != -1; g = prev[g]) Xist.add(g);
				
				Collections.reverse(Xist);
				out.print(Xist.get(0));
				for(int j = 1; j < Xist.size(); j++) {
					out.print(" " + Xist.get(j));
				}
				out.println();
				
				
			}
			
			
			
		}
		out.flush();
	}
	
	static class Data {
		int id;
		int x;
		int y;
		
		Data(int a, int b, int c) {
			id = a;
			x = b;
			y = c;
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
        return (int)nextLong();
    }
     
    public double nextDouble() {
        return Double.parseDouble(next());
    }
     
 
}