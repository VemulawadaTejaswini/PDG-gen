
import java.io.*;
import java.util.*;


// 2011/10/20

//@2220 Rûö®
public class Main {

	
	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		int[] ir = readIntArray();
		double a = ir[0];
		double b = ir[1];
		double c = ir[2];
		double d = ir[3];

		// 3Âð
//		double g1 = -20;
//		double g2 = 20;
//		double g3 = 1;
//		a = 1;
//		b = -(g1+g2+g3);
//		c = g1*g2 + g2*g3 + g3*g1;
//		d = -(g1*g2*g3);
		
		// ð
		double g1 = 1000;
		a = 1;
		b = -(g1);
		c = 1;
		d = -(g1);
		
		if (a < 0) {
			a = -a;
			b = -b;
			c = -c;
			d = -d;
		}
		
		// ÷ªQ®
		double a2 = 3 * a;
		double b2 = 2 * b;
		double c2 = c;
		
		// ÷ª2ûö®Ì»Ê®
		double d2 = b2 * b2 - 4 * a2 * c2;

		int kaiCntP = 0; // ³ÌðÌ
		int kaiCntN = 0; // ÌðÌ
		
		if (d2 > 0) {
//			double kai1 = (-b2 - Math.sqrt(d2)) / (2 * a2); // ¬³¢Ù¤
//			double kai2 = (-b2 + Math.sqrt(d2)) / (2 * a2);
//			double y1 = a * kai1 * kai1 * kai1 + b * kai1 * kai1 + c * kai1 + d; 
//			double y2 = a * kai2 * kai2 * kai2 + b * kai2 * kai2 + c * kai2 + d;
			// èZr
			double kai1 = (-b2 - Math.sqrt(d2)) / (2 ); // ¬³¢Ù¤
			double kai2 = (-b2 + Math.sqrt(d2)) / (2 );
			double y1 = a * kai1 * kai1 * kai1 + b * kai1 * kai1 * a2 + c * kai1 * a2 * a2 + d * a2 * a2 * a2; 
			double y2 = a * kai2 * kai2 * kai2 + b * kai2 * kai2 * a2 + c * kai2 * a2 * a2 + d * a2 * a2 * a2;
			assert y1 > y2;
			if (y2 > 0) {
				if (d > 0) {
					kaiCntN = 1;
				}
				else if (d < 0) {
					assert false;
					kaiCntP = 1;
				}
				// d=0 Í0 0
			}
			else if (y1 < 0) {
				if (d > 0) {
					assert false;
					kaiCntN = 1;
				}
				else if (d < 0) {
					kaiCntP = 1;
				}
				// d=0 Í0 0
			}
			else if (y2 == 0) {
				// ñdð
				if (kai2 == 0) {
					assert false;
					kaiCntN = 1;
				}
				else if (kai2 > 0) {
					if (d < 0) {
						kaiCntP = 3;
					}
					else if (d > 0) {
						kaiCntP = 2;
						kaiCntN = 1;
					}
					else {
						assert false;
						kaiCntP = 2;
					}
				}
				else {
					assert false;
					kaiCntN = 3;
				}
			}
			else if (y1 == 0) {
				// ñdð
				if (kai1 == 0) {
					assert false;
					kaiCntP = 1;
				}
				else if (kai1 < 0) {
					if (d > 0) {
						assert false;
						kaiCntN = 3;
					}
					else if (d < 0) {
						kaiCntP = 1;
						kaiCntN = 2;
					}
					else {
						assert false;
						kaiCntN = 2;
					}
				}
				else {
					assert false;
					kaiCntP = 3;
				}
			}
			else {
				// 3ÂÌÙÈéðª éI
				if (kai1 >= 0) {
					if (d > 0) {
						kaiCntP = 2;
						kaiCntN = 1;
					}
					else if (d < 0) {
						assert false;
						kaiCntP = 3;
					}
					else {
						assert false;
						kaiCntP = 2;
					}
				}
				else if (kai2 <= 0) {
					if (d > 0) {
						kaiCntN = 3;
					}
					else if (d < 0) {
						assert false;
						kaiCntP = 1;
						kaiCntN = 2;
					}
					else {
						assert false;
						kaiCntN = 2;
					}
				}
				else {
					if (d > 0) {
						kaiCntP = 2;
						kaiCntN = 1;
					}
					else if (d < 0) {
						kaiCntP = 1;
						kaiCntN = 2;
					}
					else {
						assert false;
						kaiCntP = 1;
						kaiCntN = 1;
					}
				}
			}
		}
		else if (d2 == 0) {
//			double kai = -b2 / (2 * a2);
//			double y = a * kai * kai * kai + b * kai * kai + c * kai + d; 
			double kai = -b2 / (2 ); // a2ÅçÈ¢
			double y = a * kai * kai * kai + b * kai * kai * a2 + c * kai * a2 * a2 + d * a2 * a2 * a2; 
			if (y == 0) { // 3d_ªx²ã
				// 3dð
				if (kai > 0) {
					kaiCntP = 3;
				}
				else if (kai < 0) {
					kaiCntN = 3;
				}
			}
			else {
				if (d > 0) {
					assert false;
					kaiCntN = 1;
				}
				else if (d < 0) { // TODO
					assert false;
					kaiCntP = 1;
				}
				// d=0 Í0 0
			}
		}
		else { // d2 < 0
			if (d > 0) {
				assert false;
				kaiCntN = 1;
			}
			else if (d < 0) {
				kaiCntP = 1;
			}
			// d=0 Í0 0
		}
				
		// ðÌ\¦
		System.out.printf("%d %d", kaiCntP, kaiCntN);
		
		return true; // ³íI¹ Ö
	}
	

//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
			String inputStr = "1\n-10 0 0 0\n";
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