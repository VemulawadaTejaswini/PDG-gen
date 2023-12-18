import java.util.*;
import java.io.*;

public class Main{
	
	static class move{
		int x1, y1, x2, y2;
		public move(int x1, int y1, int x2, int y2) {
			this.x1 = x1; this.y1 = y1; this.x2 = x2; this.y2 = y2;
		}
	}
	
	public static void main(String[] args) throws IOException {
		int N = readInt(), M = readInt();
		int arr[][] = new int[N+1][M+1];
		LinkedList<move> move = new LinkedList<>();
		for(int i = 1; i<=N; i++) for(int j= 1; j<=M; j++) arr[i][j] = readInt()%2;
		for(int i = 1; i<=N; i++) {
			for(int j= 1; j<=M; j++) {
				if(arr[i][j]%2 == 1) {
					if(i != 1 && arr[i-1][j]%2 == 1) {
						move.add(new move(i, j, i-1, j));
						arr[i-1][j]++; arr[i][j]--;
					}
					else if(i != N && arr[i+1][j]%2 == 1) {
						move.add(new move(i, j, i+1, j));
						arr[i+1][j]++; arr[i][j]--;
					}
					else if(j != 1 && arr[i][j-1]%2 == 1) {
						move.add(new move(i, j, i, j-1));
						arr[i][j-1]++; arr[i][j]--;
					}
					else if(j != M && arr[i][j+1]%2 == 1) {
						move.add(new move(i, j, i, j+1));
						arr[i][j+1]++; arr[i][j]--;
					}
					else if(i != N){
						move.add(new move(i, j, i+1, j));
						arr[i+1][j]++; arr[i][j]--;
					}
					else if(j != M) {
						move.add(new move(i, j, i, j+1));
						arr[i][j+1]++; arr[i][j]--;
					}
				}
			}
		}
		println(move.size());
		for(move m : move) println(m.x1 + " " + m.y1 + " " +  m.x2 + " " +  m.y2);
		exit();
	}

	final private static int BUFFER_SIZE = 1 << 16;
	private static DataInputStream din = new DataInputStream(System.in);
	private static byte[] buffer = new byte[BUFFER_SIZE];
	private static int bufferPointer = 0, bytesRead = 0;
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

	public static String readLine() throws IOException {
		byte[] buf = new byte[64]; // line length
		int cnt = 0, c;
		while ((c = Read()) != -1) {
			if (c == '\n')
				break;
			buf[cnt++] = (byte) c;
		}
		return new String(buf, 0, cnt);
	}

	public static String read() throws IOException {
		byte[] ret = new byte[1024];
		int idx = 0;
		byte c = Read();
		while (c <= ' ') {
			c = Read();
		}
		do {
			ret[idx++] = c;
			c = Read();
		} while (c != -1 && c != ' ' && c != '\n' && c != '\r');
		return new String(ret, 0, idx);
	}

	public static int readInt() throws IOException {
		int ret = 0;
		byte c = Read();
		while (c <= ' ')
			c = Read();
		boolean neg = (c == '-');
		if (neg)
			c = Read();
		do {
			ret = ret * 10 + c - '0';
		} while ((c = Read()) >= '0' && c <= '9');

		if (neg)
			return -ret;
		return ret;
	}

	public static long readLong() throws IOException {
		long ret = 0;
		byte c = Read();
		while (c <= ' ')
			c = Read();
		boolean neg = (c == '-');
		if (neg)
			c = Read();
		do {
			ret = ret * 10 + c - '0';
		} while ((c = Read()) >= '0' && c <= '9');
		if (neg)
			return -ret;
		return ret;
	}

	public static double readDouble() throws IOException {
		double ret = 0, div = 1;
		byte c = Read();
		while (c <= ' ')
			c = Read();
		boolean neg = (c == '-');
		if (neg)
			c = Read();

		do {
			ret = ret * 10 + c - '0';
		} while ((c = Read()) >= '0' && c <= '9');

		if (c == '.') {
			while ((c = Read()) >= '0' && c <= '9') {
				ret += (c - '0') / (div *= 10);
			}
		}

		if (neg)
			return -ret;
		return ret;
	}

	private static void fillBuffer() throws IOException {
		bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
		if (bytesRead == -1)
			buffer[0] = -1;
	}

	private static byte Read() throws IOException {
		if (bufferPointer == bytesRead)
			fillBuffer();
		return buffer[bufferPointer++];
	}

	static void print(Object o) {
		pr.print(o);
	}

	static void println(Object o) {
		pr.println(o);
	}

	static void flush() {
		pr.flush();
	}

	static void println() {
		pr.println();
	}

	static void exit() throws IOException {
		din.close();
		pr.close();
		System.exit(0);
	}
}
