
import java.io.*;
import java.util.*;


// 2011/10/21

//@0140 oXâ 
public class Main {

	/*
	 *  x²ªo0xûü
	 *  y²ªo90xûü
	 *  z²ªkÜ90x(kÉ)ûü
	 */
	
	// kÜÆo©ç »Ìûüðw·PÊxNgðßé
	double[] calc(double hokui, double toukei) {
		
		double z = Math.sin(hokui / 180 * Math.PI);
		double xy = Math.cos(hokui / 180 * Math.PI);
		double x = xy * Math.sin(toukei / 180 * Math.PI);
		double y = xy * Math.cos(toukei / 180 * Math.PI);
		return new double[] { x, y, z };
	}
	
	
	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		int[] ir = readIntArray();
		
		int start = ir[0];
		int goal = ir[1];
		
		int x = start; // »ÝÊu
		int v = 1; // ü« 1 or -1
		
		if (start <= 5 && goal < start) {
			v = -1;
		}
		
		
		String kai = "";
		for(int i = 0;; i++) {
			if (i != 0)
				kai += " ";
			kai += x;
			
			if (x == goal)
				break;

			x += v;
			if (x == 10) {
				x = 5;
				v = -1;
			}
			else if (x < 0) {
				x = 1;
				v = 1;
			}
		}
		
		
		// ðÌ\¦
		System.out.printf("%s\n", kai);
		
		return true; // ³íI¹ Ö
	}
	

//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
//			String inputStr = "1,2 4,";
			String inputStr = "1,4 2,";

			inputStr = inputStr.replace(",", "\n");

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