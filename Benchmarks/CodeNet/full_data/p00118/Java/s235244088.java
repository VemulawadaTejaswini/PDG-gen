import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class Main {
	// ??\??????
	static FastReader in = new FastReader();
	static int h,w;
	static char[][] field;

	public static void main(String[] args) {
		h=in.nextInt();
		w=in.nextInt();
		field=in.nextCharArray2d(h, w);
		
		int res = 0;
		
		for (int i = 0; i < w * h; i++) {
			char target = getTarget();
			// "."??\??????????????????????????£?????????????????????
			if (target=='\u0000') {
				System.out.println(res);
			return;
			}
			
			for (int x = 0; x < w; x++) {
				for (int y = 0; y < h; y++) {
					if (field[x][y]==target) {
						dfs(x, y,target);
						//System.out.println(res);
						res++;
					}
				}
			}
		}
	}

	// "."??????????????°?????????????????¢???
	static char getTarget() {
		for (int x = 0; x < w; x++) {
			for (int y = 0; y < h; y++) {
				if (field[x][y] != '.') {
					return field[x][y];
				}
			}
		}
		return '\u0000';
	}

	// ?????¨??????x,y ?°´????????????????????¨????????§?????°????????¢??°
	static void dfs(int x, int y,char target) {
		// ???????????¨?????????.?????????
		field[x][y] = '.';
		//for?????????????????????
		int[][] pattern = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
		for(int i=0;i<4;i++){
			int dx =x+pattern[i][0];
			int dy = y+pattern[i][1];
			if(dx>=0&&dx<w&&dy>=0&&dy<h&&field[dx][dy]==target){
				dfs(dx, dy, target);
			}
		}
	}

}

// ??\?????¨????????????
class FastReader {
	private InputStream in = System.in;
	private byte[] buf = new byte[1024];
	private int charNum;
	private int charLen;
	private StringBuilder sb = new StringBuilder();

	public int read() {
		if (charLen == -1)
			throw new InputMismatchException();
		if (charNum >= charLen) {
			charNum = 0;
			try {
				charLen = in.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (charLen <= 0)
				return -1;
		}
		return buf[charNum++];
	}

	public String next() {
		int c = read();
		while (isWhitespace(c)) {
			c = read();
		}
		sb.setLength(0);
		do {
			sb.appendCodePoint(c);
			c = read();
		} while (!isWhitespace(c));
		return sb.toString();
	}

	public char[] nextCharArray() {
		return next().toCharArray();
	}

	public char[][] nextCharArray2d(int lines, int rows) {
		char[][] array = new char[lines][rows];
		for (int i = 0; i < lines; i++)
			array[i] = nextCharArray();
		return array;
	}

	public int nextInt() {
		return Integer.valueOf(next());
	}

	public boolean isWhitespace(int c) {
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}
}