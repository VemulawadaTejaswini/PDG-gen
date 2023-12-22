
import java.io.*;
import java.math.BigDecimal;
import java.util.*;


// 2011/10/22

//0217 à¢½£
public class Main {

	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		int n = 1;
		try {
			int[] ir = readIntArray();
			if (ir == null || n == 0)
				return false;
			n = ir[0];
		} catch(Exception e) {
			;
		}

		int maxNo = 0;
		int max = 0;
		for(int i = 0; i < n; i++) {
			int[] ir = readIntArray();
			int no = 0;
			int kyori = 0;
				no = ir[0];
				kyori = ir[1] + ir[2];
			if (kyori > max) {
				maxNo = no;
				max = kyori;
			}
		}

		// ðÌ\¦
		System.out.printf("%d %d\n", maxNo, max);
		
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
		
		String s = reader.readLine();
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