
import java.io.*;
import java.util.*;


// 2011/10/20

//@2311 IZÅ é âè¶©çÇÁ¿ªæè©í©çÈ¢
public class Main {

	
	// åÉèÔð\·ÌÉg¤è
	public static final int BLANK = 0;
	public static final int BLACK = 1;
	public static final int WHITE = 2;
	
	
	// "E4"Ìæ¤È¶ñðsqnum(0-63)ÉÏ··é
	// s¾Í-1
	public static int getPos(String k) {
		k = k.toUpperCase();
		String xStr = "ABCDEFGH";
		String yStr = "12345678";
		int x = xStr.indexOf(k.charAt(0));
		int y = yStr.indexOf(k.charAt(1));
		if (x < 0 || y < 0)
			return -1;
		return y * 8 + x;
	}

	
	/**
	 * sqnumðÔ·
	 * @param x 0-7
	 * @param y 0-7
	 * @return sqnum 0-63
	 */
	static int getSqnum(int x, int y) {
		return x + y * 8; 
	}
	static int getX(int sqnum) {
		return sqnum % 8;
	}
	static int getY(int sqnum) {
		return sqnum / 8;
	}

	
	// sqnumð"E4"Ìæ¤È¶ñÉ·é 0-63 ÈOÍ"PA"Æ·é 
	public static String getPosStr(int sqnum) {
		int x = getX(sqnum);
		int y = getY(sqnum);
		if (0 <= x && x < 8 && 0 <= y && y < 8) {
			String xStr = "ABCDEFGH";
			String yStr = "12345678";
			return xStr.substring(x, x + 1) + yStr.substring(y, y + 1);
		}
		else {
			return "PA";
		}
	}

	// x y Åwè³êéêÌbitª1©Ç¤©
	private static boolean is(long bw, int x, int y) {
		return (bw & (1L << (x + y * 8))) != 0; 
	}
	
	
	
	// wèÌÓÌFðÔ·
	public static int getPos(long[] board, int sqnum) {
		long bit = 1L << sqnum;
		if ((board[0] & bit) != 0) {
			return BLACK;
		}
		else if ((board[1] & bit) != 0) {
			return WHITE;
		}
		else 
			return BLANK;
	}


	// BLACK,WHITE,BLANKÌð¦é
	public static int getCount(long[] board, int color) {
		if (color == BLACK) {
			return Long.bitCount(board[0]);
		}
		else if (color == WHITE) {
			return Long.bitCount(board[1]);
		}
		else {
			return Long.bitCount(~(board[0] | board[1]));
		}
	}
	
	
	// Î·ðßé ©ª©çÝ½Î· CO[
	public static int getSekisa(long mybd, long oppbd) {
		int b = Long.bitCount(mybd);
		int w = Long.bitCount(oppbd);
		int emp = 64 - b - w;
		int e = b - w;
		// CO[ ó«ÍÒ
		if (e > 0) {
			e += emp;
		}
		else if (e < 0) {
			e -= emp;
		}
		return e;
	}
	// Î·ðßé ©çÝ½Î· CO[
	public static int getSekisa(long[] board) {
		return getSekisa(board[0], board[1]);
	}
	
	// orðæ¾
	public static String getZchar(int color) {
		switch(color) {
		case BLACK:
			return "";
		case WHITE:
			return "";
		case BLANK:
			return "  ";
		default:
			return null;
		}
	}
	

	/**
	 * ÕÊðeLXgÅ\»·é
	 * @param b
	 * @param w
	 * @param te ÅIè_@gíÈ¢êÍ-1
	 * @return
	 */
	public static String toString(long b, long w, int te) {
		StringBuilder sb = new StringBuilder();
		int cb = Long.bitCount(b);
		int cw = Long.bitCount(w);
		sb.append(String.format("  `abcdefg b=%d w=%d emp=%d b%016x w%016x\n", cb, cw, 64 - cb - cw, b, w));
		for(int y = 0; y < 8; y++) {
			sb.append(String.format("%2d", y + 1));
			for(int x = 0; x < 8; x++) {
				boolean b1 = is(b, x, y);
				boolean b2 = is(w, x, y);
				boolean isLast = (y * 8 + x == te);
				if (b1) {
					if (b2) {
						sb.append(""); // ÊíÈ¢
					}
					else {
						if (isLast)
							sb.append("");
						else
							sb.append(""); // 
					}
				}
				else if (b2) {
					if (isLast)
						sb.append("");
					else
						sb.append(""); // 
				}
				else {
					sb.append("E");
				}
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public static String toString2(long b, long w) {
		StringBuilder sb = new StringBuilder();
		for(int y = 0; y < 8; y++) {
			for(int x = 0; x < 8; x++) {
				boolean b1 = is(b, x, y);
				boolean b2 = is(w, x, y);
				if (b1) {
					sb.append("o"); // 
				}
				else if (b2) {
					sb.append("x"); // 
				}
				else {
					sb.append(".");
				}
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public static String toString(long b, long w) {
		return toString(b, w, -1);
	}

	public static String toString(long board[], int te) {
		return toString(board[0], board[1], te);
	}	
	public static String toString(long board[]) {
		return toString(board[0], board[1]);
	}	
	
	
	public static void print(long b, long w) {
		System.out.println(toString(b, w));
	}
	
	
	public static void print(long board[]) {
		print(board[0], board[1]);
	}	
	
	// ú»Õð\z·é
	public static long[] createNewBoard() {
		long[] board = new long[2];
		board[0] = 0x0000000810000000L;
		board[1] = 0x0000001008000000L;
		return board;
		
	}
	
	// ûÅwè³êéÕÊðìé
	// ÔÌóÔÉ·é
	public static long[] createBoardR(String kifu) {
		long[] board = createNewBoard();
		for(int i = 0; i < kifu.length() - 1; i += 2) {
			String s = kifu.substring(i, i + 2);
			int sqnum = getPos(s);
			long rev = putB(board, board, sqnum);
			assert(rev != 0);
			long mobB = getMobirity(board, BLACK);
			long mobW = getMobirity(board, WHITE);
			if (mobB == 0 && mobW != 0) {
				revBW(board); // à¤êñ½]
			}
		}
		return board;
	}
	
	
	
	public static long getMybd(long[] board, int color) {
		long mybd = board[(color == BLACK) ? 0 : 1];
		return mybd;
	}
	public static long getOppbd(long[] board, int color) {
		long oppbd = board[(color == BLACK) ? 1 : 0];
		return oppbd;
	}
	public static long[] getBoard(long mybd, long oppbd, int color) {
		long[] board = new long[2];
		board[0] = (color == BLACK) ? mybd : oppbd;
		board[1] = (color == BLACK) ? oppbd : mybd;
		return board;
	}
	
	

	// vXûü
	private static long _drctnlFlipsP(long mybd, long oppbd, long p, int inc)
	{
		long t = (p << inc) & oppbd;
		t |= (t << inc) & oppbd;
		t |= (t << inc) & oppbd;
		t |= (t << inc) & oppbd;
		t |= (t << inc) & oppbd;
		t |= (t << inc) & oppbd;
		if (((t << inc) & mybd) != 0) {
			return t;
		}
		else
			return 0;
	}
	// }CiXûü
	private static long _drctnlFlipsM(long mybd, long oppbd, long p, int inc)
	{
		long t = (p >>> inc) & oppbd;
		t |= (t >>> inc) & oppbd;
		t |= (t >>> inc) & oppbd;
		t |= (t >>> inc) & oppbd;
		t |= (t >>> inc) & oppbd;
		t |= (t >>> inc) & oppbd;
		if (((t >>> inc) & mybd) != 0) {
			return t;
		}
		else
			return 0;
	}
	
	//int nodeCnt = 0;
	/* The 8 legal directions: */  // Sûü
//	private final static int[] dirinc = {1, -1, 8, -8, 9, -9, 10, -10};
	private final static int[] DIRINC = {1, -1, 7, -7, 8, -8, 9, -9};
	
	// Ç»è}XN
	private final static long[] WALLMASK = { 
		0x7e7e7e7e7e7e7e7eL, // ¡p
		0x007e7e7e7e7e7e00L, // ÈÈßp
		0x00ffffffffffff00L, // cp
		0x007e7e7e7e7e7e00L, // ÈÈßp
	};

	/* Bit masks for the directions squares can flip in,
	* for example dirmask[10]=81=64+16+1=(1<<6)+(1<<4)+(1<<0)
	* hence square 10 (A1) can flip in directions dirinc[0]=1,
	* dirinc[4]=9, and dirinc[6]=10: */
	// èÌÛÉÇÁ¿ÌûüðÔ¹é©Ìe[u
	private final static int[] DIRMASK/*[91]*/ = {
		81, 81, 87, 87, 87, 87, 22, 22, 
		81, 81, 87, 87, 87, 87, 22, 22, 
		121, 121, 255, 255, 255, 255, 182, 182, 
		121, 121, 255, 255, 255, 255, 182, 182, 
		121, 121, 255, 255, 255, 255, 182, 182, 
		121, 121, 255, 255, 255, 255, 182, 182, 
		41, 41, 171, 171, 171, 171, 162, 162, 
		41, 41, 171, 171, 171, 171, 162, 162, 
	};
	
	/* Do all flips involved in making a move to square sqnum of board,
	 * and return their count. */
	// è·é  ½]·éÎðÔ·@Ôµ½ÎÍO[oÏflipCntÉÔ·
	// sqnum Í0-64
	public static long DoFlips(long mybd, long oppbd, int sqnum)
	{
		//nodeCnt++;
		int dirMask = DIRMASK[sqnum];
		long p = 1L << sqnum;
		long rev = 0;
		
		long oppbd3 = oppbd & WALLMASK[3];
		long oppbd2 = oppbd & WALLMASK[2];
		long oppbd1 = oppbd & WALLMASK[1];
		long oppbd0 = oppbd & WALLMASK[0];
		
//		rev |= _drctnlFlips(mybd, oppbd3, p, DIRINC[6], dirMask >> 6);
//		rev |= _drctnlFlips(mybd, oppbd2, p, DIRINC[4], dirMask >> 4);
//		rev |= _drctnlFlips(mybd, oppbd1, p, DIRINC[2], dirMask >> 2);
//		rev |= _drctnlFlips(mybd, oppbd0, p, DIRINC[0], dirMask);
		
		if ((dirMask & 128) != 0)
			rev = _drctnlFlipsM(mybd, oppbd3, p, DIRINC[6]);
		if ((dirMask & 64) != 0)
			rev |= _drctnlFlipsP(mybd, oppbd3, p, DIRINC[6]);
		if ((dirMask & 32) != 0)
			rev |= _drctnlFlipsM(mybd, oppbd2, p, DIRINC[4]); // c
		if ((dirMask & 16) != 0)
			rev |= _drctnlFlipsP(mybd, oppbd2, p, DIRINC[4]);
		if ((dirMask & 8) != 0)
			rev |= _drctnlFlipsM(mybd, oppbd1, p, DIRINC[2]);
		if ((dirMask & 4) != 0)
			rev |= _drctnlFlipsP(mybd, oppbd1, p, DIRINC[2]);
		if ((dirMask & 2) != 0)
			rev |= _drctnlFlipsM(mybd, oppbd0, p, DIRINC[0]); // ¡
		if ((dirMask & 1) != 0)
			rev |= _drctnlFlipsP(mybd, oppbd0, p, DIRINC[0]);

	   return rev;
	}

	
	/**
	 * boardÉèµ½ÕÊboard2ðÔ·
	 * board = board2ÅÄñÅàÇ¢
	 * @param board
	 * @param board2
	 * @param sqnum
	 * @param color
	 * @return ½]bit
	 */
	public static long put(long[] board, long[] board2, int sqnum, int color) {
		assert(0 <= sqnum && sqnum < 64);
		assert(color == BLACK || color == WHITE);
		long rev;

		if (((board[0] | board[1]) & (1L << sqnum)) != 0)
			return 0; // ùÉÎª é
		if (color == BLACK) {
			rev = DoFlips(board[0], board[1], sqnum);
			if (rev != 0) {
				board2[0] = board[0] ^ (rev | (1L << sqnum));
				board2[1] = board[1] ^ rev;
			}
		}
		else {
			rev = DoFlips(board[1], board[0], sqnum);
			if (rev != 0) {
				board2[1] = board[1] ^ (rev | (1L << sqnum));
				board2[0] = board[0] ^ rev;
			}
		}
		return rev;
	}
	// ÔêpÅÅÁ½ã½]·é
	// pXÅà½]µÄµÜ¤
	public static long putB(long[] board, long[] board2, int sqnum) {
		assert(0 <= sqnum && sqnum < 64);
		long rev;

		if (((board[0] | board[1]) & (1L << sqnum)) != 0)
			return 0; // ùÉÎª é
		rev = DoFlips(board[0], board[1], sqnum);
		if (rev != 0) {
			long b = board[0] ^ (rev | (1L << sqnum));
			long w = board[1] ^ rev;
			board2[0] = w; // ½]
			board2[1] = b;
		}
		return rev;
	}
	
	
	// èÂ\©Ç¤©Ô·
	public static boolean isPut(long[] board, int sqnum, int color) {
		assert(0 <= sqnum && sqnum < 64);
		assert(color == BLACK || color == WHITE);
		long rev;
		if (((board[0] | board[1]) & (1L << sqnum)) != 0)
			return false; // ùÉÎª é
		if (color == BLACK) {
			rev = DoFlips(board[0], board[1], sqnum);
		}
		else {
			rev = DoFlips(board[1], board[0], sqnum);
		}
		return rev != 0;
	}


	private static long _scanMob(long mybd, long oppbd, int inc)
	{
		// vXûü
		long tp = (mybd << inc) & oppbd;
//		tp |= (tp << inc) & oppbd;
//		tp |= (tp << inc) & oppbd;
//		tp |= (tp << inc) & oppbd;
//		tp |= (tp << inc) & oppbd;
//		tp |= (tp << inc) & oppbd;
		// ãÆºÍ¯¶
		{
		   long oppbd2 = (oppbd << inc) & oppbd; 
		   tp |= (tp << inc) & oppbd; 
		   tp |= (tp << inc*2) & oppbd2; 
		   tp |= (tp << inc*2) & oppbd2;
		}
		tp <<= inc;
		
		// }CiXûü
		long tm = (mybd >>> inc) & oppbd;
		{
		   long oppbd2 = (oppbd >>> inc) & oppbd; 
		   tm |= (tm >>> inc) & oppbd; 
		   tm |= (tm >>> inc*2) & oppbd2; 
		   tm |= (tm >>> inc*2) & oppbd2;
		}
		tm >>>= inc;
		
		return tp | tm;
	}
	
	// ÕÊÌèÂ\_Ìbitðæ¾
	public static long getMobirity(long mybd, long oppbd) {
		long t = 0;
		t |= _scanMob(mybd, oppbd & WALLMASK[3], DIRINC[6]);
		t |= _scanMob(mybd, oppbd & WALLMASK[2], DIRINC[4]);
		t |= _scanMob(mybd, oppbd & WALLMASK[1], DIRINC[2]);
		t |= _scanMob(mybd, oppbd & WALLMASK[0], DIRINC[0]);
		
		t &= ~(mybd | oppbd); // Îª éÆ±ëÍ­
		return t;
	}

	// ÕÊÌèÂ\_Ìbitðæ¾
	public static long getMobirity(long[] board, int color) {
		long mybd = board[(color == BLACK) ? 0 : 1];
		long oppbd = board[(color == BLACK) ? 1 : 0];
		return getMobirity(mybd, oppbd);
	}
	
	
	// èÂ\ÓðÔ·
	public static int countMobility(long mybd, long oppbd) {
		long t = getMobirity(mybd, oppbd);
		int mobility = Long.bitCount(t);
		return mobility;
	}

	// èÂ\_Ìzñðæ¾·é
	public static int[] getMobirityArray(long mybd, long oppbd) {
		long mb = getMobirity(mybd, oppbd);
		int cnt = Long.bitCount(mb);
		int[] a = new int[cnt];
		int idx = 0;
		for(int sqnum = 0; sqnum < 64; sqnum++) {
			if (((1L << sqnum) & mb) != 0) {
				a[idx] = sqnum;
				idx++;
			}
		}
		assert(idx == cnt);
		return a;
	}
	

	
 
	/**
	 * bitÕ90xñ]  xª¶ûü@yªºûü@ÅºÊbitª´_Æ·éÆ¶ñèÅ é
	 * 2x2ñ] 4x4ñ] 8x8ñ]ÌÉs¤
	 * @param bd
	 * @return
	 */
	public static long round(long bd) {
		
		bd = bd <<  1 & 0xAA00AA00AA00AA00L |
		     bd >>> 1 & 0x0055005500550055L |
	         bd >>> 8 & 0x00AA00AA00AA00AAL |
	         bd <<  8 & 0x5500550055005500L;
	    bd = bd <<  2 & 0xCCCC0000CCCC0000L |
	         bd >>> 2 & 0x0000333300003333L |
	         bd >>>16 & 0x0000CCCC0000CCCCL |
	         bd << 16 & 0x3333000033330000L;
	    bd = bd <<  4 & 0xF0F0F0F000000000L |
	         bd >>> 4 & 0x000000000F0F0F0FL |
	         bd >>>32 & 0x00000000F0F0F0F0L |
	         bd << 32 & 0x0F0F0F0F00000000L;
	    return bd;
	}
	
	
	
	/**
	 * 2ÊÌQm 0-7ÅÌÏ·
	 * m = 0 PÏ·
	 * m = 1 E90xñ]
	 * m = 2 E180xñ]
	 * m = 3 E270xñ]
	 * m = 4 ãº½]
	 * m = 5 zCgC½] == ãº½] + E90xñ]
	 * m = 6 ¶E½] ==           ãº½] + E180xñ]
	 * m = 7 ubNC½] == ãº½] + E270xñ]
	 * 
	 * 
	 * @param te
	 * @param m
	 * @return
	 */
	public static int hente(int te, int m)
	{
		assert(0 <= m && m < 8);
	    int x = te % 8;
	    int y = te / 8;
	    
	    if (m >= 4) {
	    	m -= 4;
	    	y = 7 - y; // c½]
	    }
	    for(int i = 0; i < m; i++) {
		    // 90xñ]
		    int y2 = x;
		    x = 7 - y;
		    y = y2;
	    }
	    return y * 8 + x;
	}

	//  2ÊÌQ Ï·µ½ÕÊðæ¾·é
	// ¿áñÆ¢½¯Ç@eXgpÉµ©gÁÄ¢È¢ compare()ÆZ·éH
	public static long[] getDihedralBoard(long[] board, int m) {
		assert(0 <= m && m < 8);
		long[] res = new long[2]; 
		if (m == 0) {
			res[0] = board[0];
			res[1] = board[1];
		}
		else if (m == 1) {
			res[0] = round(Long.reverse(board[0]));
			res[1] = round(Long.reverse(board[1]));
		}
		else if (m == 2) {
			res[0] = Long.reverse(board[0]);
			res[1] = Long.reverse(board[1]);
		}
		else if (m == 3) {
			res[0] = round(board[0]);
			res[1] = round(board[1]);
		}
		else if (m == 4) {
			res[0] = Long.reverseBytes(board[0]); // ãº½]
			res[1] = Long.reverseBytes(board[1]);
		}
		else if (m == 5) {
			res[0] = Long.reverseBytes(round(board[0]));
			res[1] = Long.reverseBytes(round(board[1]));
		}
		else if (m == 6) {
			res[0] = Long.reverse(Long.reverseBytes(board[0]));
			res[1] = Long.reverse(Long.reverseBytes(board[1]));
		}
		else if (m == 7) {
			res[0] = round(Long.reverseBytes(board[0]));
			res[1] = round(Long.reverseBytes(board[1]));
		}
		return res;
	}

	// 2ÊÌQmÌt³
	public static int inv(int m) {
		assert(0 <= m && m < 8);
		switch(m) {
		case 0: // PÊ³
		case 2: // ÎÌ²4{ÅÌÜèÔµÆ180xñ]
		case 4:
		case 5:
		case 6:
		case 7:
			return m;
		case 1: // 90xñ]
		case 3:
			return 4 - m;
		default:
			return 0;
		}
	}

	
	/**
	 * ÕÊðär·é  ÎÌðÜßÄêv·é©Ç¤©Ô·
	 * èÎp
	 * board0É2ÊÌQÌÏ·ðsÁÄêvµ½Æ«ÉÏ·èðÔ·
	 * @param board0
	 * @param board1
	 * @return -1sêv 0-7êv
	 */
	public static int compare(long[] board0, long[] board1) {
	
		if (board0[0] == board1[0] && board0[1] == board1[1]) {
			return 0;
		}
		
		long bd0 = round(board0[0]);
		long bd1 = round(board0[1]);
		if (bd0 == board1[0] && bd1 == board1[1]) {
			return 3;
		}
		bd0 = round(bd0);
		bd1 = round(bd1);
		if (bd0 == board1[0] && bd1 == board1[1]) {
			return 2;
		}
		bd0 = round(bd0);
		bd1 = round(bd1);
		if (bd0 == board1[0] && bd1 == board1[1]) {
			return 1;
		}
		
		bd0 = Long.reverseBytes(board0[0]); // ãº½]
		bd1 = Long.reverseBytes(board0[1]);
		if (bd0 == board1[0] && bd1 == board1[1]) {
			return 4;
		}
		bd0 = round(bd0);
		bd1 = round(bd1);
		if (bd0 == board1[0] && bd1 == board1[1]) {
			return 7;
		}
		bd0 = round(bd0);
		bd1 = round(bd1);
		if (bd0 == board1[0] && bd1 == board1[1]) {
			return 6;
		}
		bd0 = round(bd0);
		bd1 = round(bd1);
		if (bd0 == board1[0] && bd1 == board1[1]) {
			return 5;
		}
		return -1;
	}
	
	// ÕÊ½]
	public static void revBW(long[] board) {
		long t = board[0];
		board[0] = board[1];
		board[1] = t;
	}
	
	// clone copy
	public static long[] clone(long[] board) {
		long[] b = new long[2];
		b[0] = board[0];
		b[1] = board[1];
		return b;
	}
	
	
	


	
	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		long[] bd = new long[2];
		
		// read
		for(int y = 0; y < 8; y++) {
			String s = reader.readLine();
			for(int x = 0; x < 8; x++) {
				if (s.charAt(x) == 'o') {
					bd[0] += 1L << (y * 8 + x);
				}
				else if (s.charAt(x) == 'x') {
					bd[1] += 1L << (y * 8 + x);
				}
			}
		}

		int color = BLACK;
		boolean isPass = false;
		for(;;) {
		
			int maxCnt = 0;
			int maxPos = -1;
			for(int x = 0; x < 64; x++) {
				int pos = x;
				if (color == WHITE) {
					pos = 63 - x; // ÍEº©ç¸
				}
				if (((bd[0] | bd[1]) & (1L << pos)) != 0)
					continue; // ·ÅÉÎª é
				long rev;
				if (color == BLACK) {
					rev = DoFlips(bd[0], bd[1], pos);
				}
				else {
					rev = DoFlips(bd[1], bd[0], pos);
				}
				int cnt = Long.bitCount(rev);
				if (cnt> maxCnt) {
					maxCnt = cnt;
					maxPos = pos;
				}
			}
			if (maxCnt == 0) {
				if (isPass)
					break; // I¹
				//pX
				isPass = true;
			}
			else {
				put(bd, bd, maxPos, color);
				isPass = false;
			}
			//print(bd);
			color = BLACK + WHITE - color;
		}
		
//		log.printf("%s\n", toString(b, w));
		
				
		// ðÌ\¦
		String ban = toString2(bd[0], bd[1]);
		System.out.printf("%s", ban);
		
		
//		return true; // ³íI¹ Ö
		return false;
	}
	

//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
			String inputStr = "ooox....\n"+
			".x......\n"+
			"ooo.....\n"+
			"........\n"+
			"........\n"+
			"........\n"+
			"........\n"+
			"........\n";
			reader = new BufferedReader(new StringReader(inputStr)); 

		}
		else {
			log = new PrintStream(new OutputStream() { public void write(int b) {} } ); // «ÌÄ
			reader = new BufferedReader(new InputStreamReader(System.in)); // R\[©ç
		}
		
		//int N = readIntArray()[0];

		for(int i = 0; /*i < N*/; i++) {
			boolean b = new Main().main();
			if (!b)
				break;
		}		
		
		reader.close();
	}

	
	static PrintStream log;
	static BufferedReader reader;
	

	// WüÍæè1sªÌXy[XæØèÌ®lðÇÞ
	// EOFÌêÍnullðÔ·
	private static int[] readIntArray() throws IOException {
		
		String s = reader.readLine();
		if (s == null)
			return null;
		String[] sp = s.split(" ");
		int[] a = new int[sp.length];
		for(int i = 0; i < sp.length; i++) {
			a[i] = Integer.parseInt(sp[i]);
		}
		return a;
	}
		
}