import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	final	int					DIRECT_UP    = 1;
	private	static	final	int					DIRECT_DOWN  = 2;
	private	static	final	int					DIRECT_LEFT  = 4;
	private	static	final	int					DIRECT_RIGHT = 8;

	private	static			BufferedReader		stdin = null;

	static {
		stdin = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[][]	map = null;

		while ((map = parseMap()) != null) {
			traceRoute(map);
		}
	}

	private static void traceRoute(byte[][] map) {
		int nX   = 0;
		int nY   = 0;
		int	nDir = DIRECT_RIGHT;

		while (true) {
			int bit = map[nY][nX];

			switch (nDir) {
			case DIRECT_UP:
				{
					System.out.print("U");
					if ((bit & DIRECT_LEFT) != 0) {
						nX--;
						nDir = DIRECT_LEFT;
					}
					else if ((bit & DIRECT_UP) != 0) {
						nY--;
						nDir = DIRECT_UP;
					}
					else if ((bit & DIRECT_RIGHT) != 0) {
						nX++;
						nDir = DIRECT_RIGHT;
					}
					else if ((bit & DIRECT_DOWN) != 0) {
						nY++;
						nDir = DIRECT_DOWN;
					}
				}
				break;
			case DIRECT_RIGHT:
				{
					System.out.print("R");
					if ((bit & DIRECT_UP) != 0) {
						nY--;
						nDir = DIRECT_UP;
					}
					else if ((bit & DIRECT_RIGHT) != 0) {
						nX++;
						nDir = DIRECT_RIGHT;
					}
					else if ((bit & DIRECT_DOWN) != 0) {
						nY++;
						nDir = DIRECT_DOWN;
					}
					else if ((bit & DIRECT_LEFT) != 0) {
						nX--;
						nDir = DIRECT_LEFT;
					}
				}
				break;
			case DIRECT_DOWN:
				{
					System.out.print("D");
					if ((bit & DIRECT_RIGHT) != 0) {
						nX++;
						nDir = DIRECT_RIGHT;
					}
					else if ((bit & DIRECT_DOWN) != 0) {
						nY++;
						nDir = DIRECT_DOWN;
					}
					else if ((bit & DIRECT_LEFT) != 0) {
						nX--;
						nDir = DIRECT_LEFT;
					}
					else if ((bit & DIRECT_UP) != 0) {
						nY--;
						nDir = DIRECT_UP;
					}
				}
				break;
			case DIRECT_LEFT:
				{
					System.out.print("L");
					if ((bit & DIRECT_DOWN) != 0) {
						nY++;
						nDir = DIRECT_DOWN;
					}
					else if ((bit & DIRECT_LEFT) != 0) {
						nX--;
						nDir = DIRECT_LEFT;
					}
					else if ((bit & DIRECT_UP) != 0) {
						nY--;
						nDir = DIRECT_UP;
					}
					else if ((bit & DIRECT_RIGHT) != 0) {
						nX++;
						nDir = DIRECT_RIGHT;
					}
				}
				break;
			}

			if (nX == 0 && nY == 0) {
				System.out.println("");
				break;
			}
		}
	}

	private static byte[][] parseMap() {
		byte[][]	map   = null;
		String		line  = null;
		int			n1    = 0;

		for (; ; n1++) {
			line = parseStdin();
			if (line == null) {
				break;
			}

			if (n1 == 0) {
				map = new byte[5][5];
			}

			switch((n1 % 2)) {
			case 0:
				{
					for(int n2 = 0; n2 < line.length(); n2++) {
						if (line.charAt(n2) == '1') {
							map[n1 / 2][n2]     |= DIRECT_RIGHT;
							map[n1 / 2][n2 + 1] |= DIRECT_LEFT;
						}
					}
					break;
				}
			case 1:
				{
					for(int n2 = 0; n2 < line.length(); n2++) {
						if (line.charAt(n2) == '1') {
							map[n1 / 2][n2]     |= DIRECT_DOWN;
							map[n1 / 2 + 1][n2] |= DIRECT_UP;
						}
					}
					break;
				}
			}
		}

		return map;
	}

	private static String parseStdin() {
		String	strNum = null;

		try {
			String line = stdin.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					strNum = line;
				}
			}
		}
		catch (IOException e) {}

		return strNum;
	}
}