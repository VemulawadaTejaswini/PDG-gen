
import java.io.*;
import java.util.*;


// 2011/10/22

// 0559 JOIø
public class Main {

	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		int[] ir = readIntArray();
		int height = ir[0];
		int width = ir[1];

		int allQCnt = 0; // ? Ì
		String[] map = new String[height];
		for(int i = 0; i < height; i++) {
			map[i] = reader.readLine();
			for(int x = 0; x < width; x++) {
				if (map[i].charAt(x) == '?')
					allQCnt++;
			}
		}
		
		int MOD = 100000;
		
		// 3Ì×«æe[uðÂ­é allQCntÍÅå400
		int[] pow3 = new int[allQCnt];
		int m = 1;
		for(int i = 0; i < allQCnt; i++) {
			pow3[i] = m;
//			log.printf("pos3 %d %d\n", i, m);
			m = m * 3;
			m = m % MOD;
		}
		
		// JOIªÅ«»¤ÈÆ±ë  x,y,?Ìzñðo^·é
		List<int[]> list = new ArrayList<int[]>();
		
		for(int x = 0; x < width -1; x++) {
			for(int y = 0; y < height -1; y++) {
				char c1 = map[y].charAt(x);
				char c2 = map[y].charAt(x+1);
				char c3 = map[y+1].charAt(x);
				
				if ((c1 == 'J' || c1 == '?') &&
					(c2 == 'O' || c2 == '?') &&
					(c3 == 'I' || c3 == '?')) {
					int c = 0;
					if (c1 == '?')
						c++;
					if (c2 == '?')
						c++;
					if (c3 == '?')
						c++;
					list.add(new int[] { x, y, c });
				}
			}
		}
		
		// JOIªÅ«»¤ÈÆ±ë
		int dcnt = list.size();
		log.printf("JOIÌÅ«»¤ÈÆ±ë=%d S?=%d\n", dcnt, allQCnt);
		
		// 2^dcnt(JOIÅ«»¤ÈÆ±ë)ÌgÝí¹ÉÂ¢Ä
		boolean[] isUse = new boolean[dcnt];
		
		// dÈè`FbNpmap
		int[][] checkMap = new int[width][height];
		
		int sum = 0;  // ðÌ
		int useCnt = 0; // JOIÌ@XV·é
		int qCnt = allQCnt; //@JOIðìéêÈOÌ?Ì XV·é
		loop:
		for(;;) {
			// loop Ì trueÌÆ±ëÉÂ¢ÄvZ·é
			
			// next  all falseÍòÎ·ÌÅÅÉâéÆÇ¢
			for(int i = 0;; i++) {
				if (i >= dcnt)
					break loop;
				isUse[i] = !isUse[i];
				int[] joi = list.get(i);
				int x = joi[0];
				int y = joi[1];
				if (isUse[i]) {
					// dÈçÈ¢©`FbN
					if (checkMap[x][y] != 0 || checkMap[x+1][y] != 0 || checkMap[x][y+1] != 0) {
						// dÈéÌÅ¾ß
						isUse[i] = false; // ß·
					}
					else {
						// JOIÝu
						useCnt++;
						qCnt -= joi[2];
						checkMap[x  ][y  ] = 1;
						checkMap[x+1][y  ] = 1;
						checkMap[x  ][y+1] = 1;
						break;
					}
				}
				else {
					// JOI
					useCnt--;
					qCnt += joi[2];
					checkMap[x  ][y  ] = 0;
					checkMap[x+1][y  ] = 0;
					checkMap[x  ][y+1] = 0;
				}
			}

			// Êu±Â·éÌÍ¾ß ãº¶E×ÆAEãÆ¶ºª¾ß
			boolean dame = false;
//			l2:
//			for(int i = 0; i < dcnt; i++) {
//				if (!isUse[i]) 
//					continue;
//				for(int j = i + 1; j < dcnt; j++) {
//					if (!isUse[j]) 
//						continue;
//					int[] p1 = list.get(i);
//					int[] p2 = list.get(j);
//					if (Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]) <= 1) {
//						dame = true;
//						break l2;
//					}
//					if (p1[0] - p2[0] == 1 && p1[1] - p2[1] == -1) {
//						dame = true;
//						break l2;
//					}
//					if (p1[0] - p2[0] == -1 && p1[1] - p2[1] == 1) {
//						dame = true;
//						break l2;
//					}
//				}
//			}

			if (!dame) {
			
//				int onCnt = 0;
//				int qc = 0;
//				for(int i = 0; i < dcnt; i++) {
//					if (isUse[i]) {
//						onCnt++;
//						qc += list.get(i)[2];
//					}
//				}
//				
//				if (useCnt != 0) {
					
					// gÝí¹ 3 ^ (©ªÈOÌ?Ì)
					int k = pow3[qCnt];
					//assert allQCnt - qc == qCnt;
					if (useCnt % 2 == 0) // ¦¦ ïð«µÄôðø­
						k = MOD - k;
					
					//log.printf("JOIÌ=%d ?Ì=%d gÝí¹= 3^%d = %d\n", onCnt, qc, allQCnt - qc, k);
					sum += k;
					sum = sum % MOD; // intð´¦ÄµÜ¤±Æª é
//					log.printf("sum=%d\n", sum);
//				}
			}
			
		}
		
			
		// ðÌ\¦
		System.out.printf("%d\n", sum);
		
		
		return false;
		//return true; // ³íI¹ Ö
	}
	

//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
//			String inputStr = "2 3:??O:IIJ:";
//			String inputStr = "2 2:??:??:";
//			String inputStr = "3 3:??I:???:O?J:";
//			String inputStr = "5 4:JOI?:????:????:????:?JOI:";
			
//			String inputStr = "2 5:JO???:I????:";
			String inputStr = "6 8:????????:????????:????????:????????:????????:????????:";

			inputStr = inputStr.replace(":", "\n");

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

		String s = null;
		for(;;) {
			s = reader.readLine();
			if (s.length() != 0) // ¦¦¦@Ç¤àËRósðÇÞ±Æª éBÇÝòÎ·Æ¤Ü­¢­çµ¢BBBB
				break;
		}
		
		if (s == null)
			return null;
		s = s.trim();
		String[] sp = s.split(" ");
		int[] a = new int[sp.length];
		for(int i = 0; i < sp.length; i++) {
			a[i] = Integer.parseInt(sp[i]);
		}
		return a;
	}
		
}