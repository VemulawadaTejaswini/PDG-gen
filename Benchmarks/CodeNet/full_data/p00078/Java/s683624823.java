
import java.io.*;
import java.util.*;


// 2011/10/23

// 0078 ûw
public class Main {

	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		int size = readIntArray()[0];
		if (size == 0)
			return false;
		                       
		int[][] map = new int[size][size];
		
		int x = size / 2;
		int y = size / 2 + 1;
		
		for(int i = 1; i <= size * size; i++) {
			if (map[x][y] != 0) {
				x = (x - 1+size) % size;
				y = (y + 1) % size;
			}
			map[x][y] = i;
			x = (x + 1) % size;
			y = (y + 1) % size;
		}
		
			
		// ðÌ\¦
		for( y = 0; y < size; y++) {
			for( x = 0; x < size; x++) {
				System.out.printf("%4d", map[x][y]);
			}
			System.out.printf("\n");
		}
		
		return true; // ³íI¹ Ö
	}
	

//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
			String inputStr = "5:";

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