
import java.io.*;
import java.util.*;


// 2011/10/21

//@0177 nãÌ£ 
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

		String s = reader.readLine();
		String[] sp = s.split(" ");
		double[] a = new double[sp.length];
		for(int i = 0; i < sp.length; i++) {
			a[i] = Double.parseDouble(sp[i]);
		}
		if (a[0] == -1 && a[1] == -1 && a[2] == -1 && a[3] == -1)
			return false;

		double[] v1 = calc(a[0], a[1]);
		double[] v2 = calc(a[2], a[3]);
		
		//àÏ
		double naiseki = v1[0] * v2[0] + v1[1] * v2[1] + v1[2] * v2[2];
		
		// È·px
		double r = Math.acos(naiseki);
		
		int d = (int)Math.round(r * 6378.1);
		
		// ðÌ\¦
		System.out.printf("%d\n", d);
		
		return true; // ³íI¹ Ö
	}
	

//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
			String inputStr = "35.68 139.77 51.15 359.82,-1 -1 -1 -1,";
			//String inputStr = "35.68 139.77 51.15 359.82,-1 -1 -1 -1,";
			inputStr = inputStr.replace(",", "\n");

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