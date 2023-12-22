
import java.io.*;
import java.util.*;



// 44 27.672
// 46 33.227 240 2011/10/28
// 2011/10/29

// 2203 Magical island2
public class Main {

	class Double2 {
		
		public double x, y;
		
		public Double2() {/**/}
		public Double2( double xx, double yy ) { x=xx; y=yy; }
		public Double2( Double2 s ) { x=s.x; y=s.y; }

		public double length2() {
			return x*x + y*y;
		}

		public double length() {
			return Math.sqrt(x * x + y * y);
		}
		public double length2(Double2 d2) {
			return (d2.x - x) * (d2.x - x) + (d2.y - y) * (d2.y - y);
		}
		public double length(Double2 d2) {
			return Math.sqrt((d2.x - x) * (d2.x - x) + (d2.y - y) * (d2.y - y));
		}
	
		/* (ñ Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return String.format("[%g %g]", x, y);
		}
	}

	// A§ûö®ðð­
	// |a b||x| = |e|
	// |c d||y| = |f|
	Double2 houteisiki(double a, double b, double c, double d, double e, double f) {
	
		double r = (a * d - b * c);
		if (r == 0)
			return null; // ðÈµ
		r = 1 / r;
		double na = r * d;
		double nb = -r * b;
		double nc = -r * c;
		double nd = r * a;
		
		double x = na * e + nb * f;
		double y = nc * e + nd * f;
		
		return new Double2(x, y);
	}

	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		int[] ir = readIntArray();
		int n = ir[0];
		int M = ir[1];  // Mp`
		int K = ir[2];  // k Â¨«
		if (n == 0)
			return false;
		
		Double2[] sh = new Double2[n];
		
		for(int i = 0; i < n; i++) {
			ir = readIntArray();
			sh[i] = new Double2(ir[1], ir[0]); // xytÉ·é@kÍx²ûüÉÈé
		}
		
		double maxR = 0;
		
		for(int i = 0; i < n; i++) {
			log.printf("----------\n_ %s\n", sh[i]);
			double r = Math.atan2(sh[i].x, sh[i].y);
			double len = sh[i].length();
			if (r < 0)
				r += Math.PI;
			
			double r2 = Math.PI * 2 / M;
			int g = (int)Math.floor(r / r2);
			r = r - r2 * g;
			log.printf("px %fx\n", r / Math.PI * 180);
			
			// 2¼üÌûö®ðìé
			double a = -Math.sin(r);
			double b = Math.cos(r);
			double e = 0;
			
			double minR = 99999999.;
			for(int k = 0; k < K; k++) {
				// ½p`Ì_
				double rr0 = Math.PI * 2 / M * (-k);
				Double2 p0 = new Double2(Math.cos(rr0), Math.sin(rr0));
				double rr1 = Math.PI * 2 / M * (K - k);
				Double2 p1 = new Double2(Math.cos(rr1), Math.sin(rr1));
				log.printf("p0,p1 = %s %s\n", p0, p1);
				double c = -(p0.y - p1.y); 
				double d = p0.x - p1.x;
				double f = c * p0.x + d * p0.y;
				
				Double2 kai = houteisiki(a, b, c, d, e, f);
				log.printf("ð_ %s\n", kai);
				double R = len / kai.length();
				log.printf("k = %d R = %f\n", k, R);
				if (R < minR) {
					minR = R;
				}
			}
			if (minR > maxR) {
				maxR = minR;
			}
		}
		
		System.out.printf("%f\n", maxR);
		
		return true; // ³íI¹ Ö
	}
	

//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
//			String inputStr = "4 4 1:1 0:0 1:-1 0:0 -1:0 0 0:";
			String inputStr = "5 6 2:1 1:4 4:2 -4:-4 2:1 5:0 0 0:";
			
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