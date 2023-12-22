
import java.io.*;
import java.util.*;


// æ­Ôá¤Æ±ëB
// âè¶É¢ÄÈ­ÄàâèZbgÍ¡Åæªª0ÅI¹Å éB
// âèZbgÌJèÔµÉú»Rê

// 2011/10/18

//@0101
public class Main {

	
	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		String s = reader.readLine();
		s = s.replaceAll("Hoshino", "Hoshina");
		
		System.out.printf("%s\n", s);
		
		return true; /* ³íI¹ Ö */
	}
	

//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
			String inputStr = "4\n0 0 10 0 10 10 0 10\n10\n12\n0 5\n9 5\n0\n"; // 108.0
//			String inputStr = "4\n0 0 10 0 10 10 0 10\n10\n12\n0 0\n9 1\n0\n"; // 96.63324958071081
//			String inputStr = "4\n0 0 10 0 10 10 0 10\n10\n12\n0 1\n9 1\n0\n"; // 103.2664991614216
//			String inputStr = "8\n2 0 4 0 6 2 6 4 4 6 2 6 0 4 0 2\n10\n12\n3 0\n3 5\n0\n"; // 60.0

			reader = new BufferedReader(new StringReader(inputStr)); 

		}
		else {
			log = new PrintStream(new OutputStream() { public void write(int b) {} } ); // «ÌÄ
			reader = new BufferedReader(new InputStreamReader(System.in)); // R\[©ç
		}
		
		int N = readIntArray()[0];

		for(int i = 0; i < N; i++) {
			boolean b = new Main().main();
			if (!b)
				break;
		}		
		
		reader.close();
	}

	
	static PrintStream log;
	static BufferedReader reader;
	

	// WüÍæè@1sªÌXy[XæØèÌ®lðÇÞ
	private static int[] readIntArray() throws IOException {
		
		String s = reader.readLine();
		String[] sp = s.split(" ");
		int[] a = new int[sp.length];
		for(int i = 0; i < sp.length; i++) {
			a[i] = Integer.parseInt(sp[i]);
		}
		return a;
	}
		
}