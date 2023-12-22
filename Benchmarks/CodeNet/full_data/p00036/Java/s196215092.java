import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader	stdin = null;
	private	static	int[][]			piece = {
		{ 2, 2, 0x03, 0x03 },
		{ 4, 1, 0x01, 0x01, 0x01, 0x01 },
		{ 1, 4, 0x0F },
		{ 3, 2, 0x02, 0x03, 0x01 },
		{ 2, 3, 0x03, 0x06 },
		{ 3, 2, 0x01, 0x03, 0x02 },
		{ 2, 3, 0x06, 0x03 },
	};

	static {
		stdin = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]	board     = null;
		int		nMatchNum = 0;

		while ((board = parseBoard()) != null) {
			nMatchNum = -1;

			for (int y = 0; y < 8 && nMatchNum == -1; y++) {
				for (int x = 0; x < 8 && nMatchNum == -1; x++) {
					nMatchNum = isMatchPieceNum(x, y, board);
				}
			}

			if (nMatchNum != -1) {
				System.out.println((char)('A' + nMatchNum));
			}
		}
	}
	
	private static int isMatchPieceNum(int cx, int cy, int[] board) {
		boolean	bEnable   = false;
		int		nMatchNum = -1;

		if (board != null) {
			for(int i = 0; i < piece.length; i++) {
				int nH = piece[i][0];
				int nW = piece[i][1];

				if (0 <= cy && cy + nH <= 8) {
					if (0 <= cx && cx + nW <= 8) {
						bEnable = true;
						for (int y = 0; y < nH && bEnable; y++) {
							int	nPBit = piece[i][2 + y] << cx;
							int	nBBit = board[cy + y] & 0xFF;

							if ((nBBit & nPBit) != nPBit) {
								bEnable = false;
							}
						}
					}
				}

				if (bEnable) {
					nMatchNum = i;
					break;
				}
			}
		}
	
		return nMatchNum;
	}

	private static int[] parseBoard() {
		int[]	board = null;
		String	line  = null;
		int		n1    = 0;

		for (; ; n1++) {
			line = parseStdin();
			if (line == null) {
				break;
			}

			if (n1 == 0) {
				board = new int[8];
			}

			if (n1 < 8){
				int nBit = 0;
	
				for (int n2 = 7; n2 >= 0; n2--) {
					nBit <<= 1;
					nBit |= (line.charAt(n2) == '1') ? 0x01 : 0x00;
				}
	
				board[n1] = nBit;
			}
		}

		return board;
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