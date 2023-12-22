
import java.io.*;
import java.util.*;



// 2011/10/19

//@0112 MILK  longÉµÈ¢Æ¾ßIII
public class Main {

	
	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		int N = readIntArray()[0];
		if (N == 0)
			return false; /* ¨µÜ¢ */

		int[] k = new int[N];  //qÌÔ
		for(int i = 0; i < N; i++) {
			k[i] = readIntArray()[0];
		}
		
		// ¸
		Arrays.sort(k);
		
		long sum = 0;
		long t = 0;
		for(int i = 0; i < N; i++) {
			sum += t; 
			t += k[i];
		}

		// ðÌ\¦
		System.out.printf("%d\n", sum);
		
		return true; /* ³íI¹ Ö */
	}
	

//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
			String inputStr = "3\n100\n100\n500\n0\n";

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