
import java.io.*;
import java.math.BigDecimal;
import java.util.*;


// 2011/10/22

//0218 ïÃiwm
public class Main {

	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		int[] ir = readIntArray();
		int n = ir[0];
		
		for(int i = 0; i < n; i++) {
			ir = readIntArray();
			
			int c = 3; // 3ªC
			
			if (ir[0] + ir[1] + ir[2] >= 210) {
				c = 2; //B
			}
			if (ir[0] + ir[1] + ir[2] >= 150 && (ir[0] >= 80 || ir[1] >= 80)) {
				c = 2; //B
			}
			
			if (ir[0] == 100 || ir[1] == 100 || ir[2] == 100) {
				c = 1; //A
			}
			if (ir[0] + ir[1] >= 180) {
				c = 1; //A
			}
			if (ir[0] + ir[1] + ir[2] >= 240) {
				c = 1; //A
			}
			
			
		// ðÌ\¦
		System.out.printf("%s\n", (c == 1) ? "A" : (c == 2) ? "B" : "C");
		
		}
		
		return true; // ³íI¹ Ö
	}
	

//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
			String inputStr = "29:0:";

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