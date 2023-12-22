
import java.io.*;
import java.util.*;


// 44 27.672
// 46 33.227 240 2011/10/28
// 2011/10/29

// 0106 »Î
public class Main {

	// ¿à\ OÆli
	int[] tbl = {
		200,380,
		1000,1520,
		300,550,
		1200,1870,
		500,850,
		1500,2244,
	};
	
	int min;
	
	void think(int idx, int soba, int cost) {
		if (soba <= 0) {
			if (cost < min) {
				min = cost;
				return;
			}
		}
		if (idx >=tbl.length / 2) {
			return;
		}
		
		int sobat = tbl[idx * 2]; // PÜÌd³
		int tanka = tbl[idx * 2 + 1];
		for(int i = 0;; i++) {
			if (sobat * (i - 1) >= soba)
				break;
			think(idx + 1, soba - sobat * i, cost + tanka * i);
		}
	}
	
	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		int[] ir = readIntArray();
		int soba = ir[0];
		if (soba == 0)
			return false;
		
		min = Integer.MAX_VALUE;
		think(0, soba, 0);
		System.out.printf("%d\n", min);
		
		return true; // ³íI¹ Ö
	}
	

	private final static boolean DEBUG = true;  // debug
//	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
			String inputStr = "500:2200:0:";
			
			inputStr = inputStr.replace(":", "\n");

			reader = new BufferedReader(new StringReader(inputStr)); 

		}
		else {
			log = new PrintStream(new OutputStream() { public void write(int b) {} } ); // «ÌÄ
			reader = new BufferedReader(new InputStreamReader(System.in)); // R\[©ç
		}
		
		int N = Integer.MAX_VALUE;
		//int N = readIntArray()[0];

		for(int i = 0; i < N; i++) {
			boolean b = new Main().main();
			if (!b)
				break;
		}		
		
		reader.close();
	}

	
	static PrintStream log;
	static BufferedReader reader;
	

	// WüÍæè1sªÌæØè¶æØèÅÌ®lðÇÞ
	// EOFÌêÍnullðÔ·
	private static int[] readIntArray() throws IOException {

		String s = null;
		for(;;) {
			s = reader.readLine();
//			log.printf("%s\n", s);
			if (s == null)
				return null;
			s = s.trim();
			if (s.length() != 0) // ¦¦¦@Ç¤àËRósðÇÞ±Æª éBÇÝòÎ·Æ¤Ü­¢­çµ¢BBBB
				break;
		}
		
		String[] sp = s.split("[ ,]"); // æØè¶ÍXy[X©J}
		int[] a = new int[sp.length];
		for(int i = 0; i < sp.length; i++) {
			a[i] = Integer.parseInt(sp[i]);
		}
		return a;
	}
		
}