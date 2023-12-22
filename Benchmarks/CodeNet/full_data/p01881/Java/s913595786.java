import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main {
	static int INF = (int)1e9 + 7;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	int H,W,start,goal;
	ArrayList<Integer> soldiers;
	char[][] map;
	int[][] minDistance;

	public boolean check(int y,int x){
		if(y < 0 || x < 0 || y >= H || x >= W)return false;
		return true;
	}

	public void solve() {
		H = nextInt();
		W = nextInt();

		map = new char[H][];
		soldiers = new ArrayList<Integer>();
		for(int i = 0;i < H;i++){
			map[i] = next().toCharArray();

			for(int j = 0;j < W;j++){
				if(map[i][j] == '@'){
					start = i * 1000 + j;
				}

				if(map[i][j] == '$'){
					soldiers.add(i * 1000 + j);
				}

				if(map[i][j] == '%'){
					goal = i * 1000 + j;
				}
			}
		}

		minDistance = new int[H][W];
		for(int i = 0;i < H;i++){
			for(int j = 0;j < W;j++){
				minDistance[i][j] = INF;
			}
		}

		Queue<int[]> q = new ArrayDeque<int[]>();
		for(int soldier : soldiers){
			int y = soldier / 1000;
			int x = soldier % 1000;
			minDistance[y][x] = 0;
			q.add(new int[]{soldier,0});
		}

		while(!q.isEmpty()){
			int[] qData = q.poll();

			int y = qData[0] / 1000;
			int x = qData[0] % 1000;
			int d = qData[1];

			for(int i = 0;i < 4;i++){
				int ny = dy[i] + y;
				int nx = dx[i] + x;

				if(!check(ny,nx))continue;
				if(minDistance[ny][nx] <= d + 1)continue;
				if(map[ny][nx] == '#')continue;
				minDistance[ny][nx] = d + 1;
				q.add(new int[]{ny * 1000 + nx,d + 1});
			}
		}

		minDistance[start / 1000][start % 1000] = 0;
		q.add(new int[]{start,0});
		while(!q.isEmpty()){
			int[] qData = q.poll();

			if(qData[0] == goal){
				out.println("Yes");
				return;
			}

			int y = qData[0] / 1000;
			int x = qData[0] % 1000;
			int d = qData[1];

			for(int i = 0;i < 4;i++){
				int ny = dy[i] + y;
				int nx = dx[i] + x;

				if(!check(ny,nx))continue;
				if(minDistance[ny][nx] <= d + 1)continue;
				if(map[ny][nx] == '#')continue;
				minDistance[ny][nx] = d + 1;
				q.add(new int[]{ny * 1000 + nx,d + 1});
			}
		}

		out.println("No");
	}

	public static void main(String[] args) {
		out.flush();
		new Main().solve();
		out.close();
	}

	/* Input */
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (p < buflen)
			return true;
		p = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (buflen <= 0)
			return false;
		return true;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrint(buffer[p])) {
			p++;
		}
		return hasNextByte();
	}

	private boolean isPrint(int ch) {
		if (ch >= '!' && ch <= '~')
			return true;
		return false;
	}

	private int nextByte() {
		if (!hasNextByte())
			return -1;
		return buffer[p++];
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}