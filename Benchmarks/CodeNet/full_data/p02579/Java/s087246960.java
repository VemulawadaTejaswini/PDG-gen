import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {

	static int h, w;
	static char[][] board;
	
	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		h=fs.nextInt(); w=fs.nextInt();
		int sy=fs.nextInt()-1, sx=fs.nextInt()-1;
		int ey=fs.nextInt()-1, ex=fs.nextInt()-1;
		ArrayDeque<Integer> xs=new ArrayDeque<>(), ys=new ArrayDeque<>();
		board=new char[w][h];
		for (int y=0; y<h; y++) {
			char[] line=fs.next().toCharArray();
			for (int x=0; x<w; x++) {
				board[x][y]=line[x];
			}
		}
		xs.add(sx);
		ys.add(sy);
		int[][] dist=new int[w][h];
		for (int x=0; x<w; x++) Arrays.fill(dist[x], 1_000_000_000);
		dist[sx][sy]=0;
		int[] dx= {-1, 1, 0, 0};
		int[] dy= {0, 0, -1, 1};
		while (!xs.isEmpty()) {
			int curX=xs.removeFirst(), curY=ys.removeFirst();
			for (int d=0; d<4; d++) {
				int nx=curX+dx[d], ny=curY+dy[d];
				if (!legal(nx, ny)) continue;
				if (dist[nx][ny]>dist[curX][curY]) {
					dist[nx][ny]=dist[curX][curY];
					xs.addFirst(nx);
					ys.addFirst(ny);
				}
			}
			for (int x=curX-2; x<=curX+2; x++) {
				for (int y=curY-2; y<=curY+2; y++) {
					if (!legal(x, y)) continue;
					if (dist[x][y]>dist[curX][curY]+1) {
						dist[x][y]=dist[curX][curY]+1;
						xs.addLast(x);
						ys.addLast(y);
					}
				}
			}
		}
		System.out.println(dist[ex][ey]>1e7?-1:dist[ex][ey]);
	}

	static boolean legal(int x, int y) {
		if (x<0||y<0||x>=w||y>=h || board[x][y]=='#') return false;
		return true;
	}
	
	static final Random random=new Random();
	
	static void ruffleSort(int[] a) {
		int n=a.length;//shuffle, then sort 
		for (int i=0; i<n; i++) {
			int oi=random.nextInt(n), temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}

	
}
