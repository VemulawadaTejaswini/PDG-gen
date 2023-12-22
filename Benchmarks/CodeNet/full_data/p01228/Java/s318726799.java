
import java.io.*;
import java.util.*;


// 2011/10/20

//@2105 Y}V[
public class Main {


	long gcm(long a, long b) {
		
		while(b != 0) {
			long t = a % b;
			a = b;
			b = t;
		}
		return a;
	}
	
	long lcm(long a, long b) {
		return a * b / gcm(a, b);
	}
	
	// föÌ¸ÌzñðÔ·
	//@36Èç2,3ÌzñðÔ·B
	//  fÈç»Ì©ÌÌêvfzñðÔ·B
	//  0 ÆÍnullðÔ·
	//  1 ÌÆ«ÍózñðÔ·
	long[] soinsu(long a) {
		if (a <= 0)
			return null;
		List<Long> list = new ArrayList<Long>();
		if (a % 2 == 0) {
			list.add(2L);
			a /= 2;
			while(a % 2 == 0)
				a /= 2;
		}
		for(long k = 3;; k += 2) {
			if (k * k > a)
				break;
			if (a % k == 0) {
				list.add(k);
				a /= k;
				while(a % k == 0)
					a /= k;
			}
		}
		if (a != 1) {
			list.add(a);
		}
		
		long[] ret = new long[list.size()];
		for(int i = 0; i < list.size(); i++) {
			ret[i] = list.get(i);
		}
		return ret;
	}
	
	// YðÅK»·é
	int[] saitekika(int[] data) {
		// 0YÅK»
		// n=2 01000200 -> 0102
		long[] so = soinsu(data.length);
		for(long nn: so) {
			int n = (int)nn;
			for(;;) {
				if (data.length == 1)
					break;
				boolean dame = false;
				for(int t = 0; t < data.length; t++) {
					if (t % n != 0 && data[t] != 0) {
						dame = true;
						break;
					}
				}
				if (dame)
					break;
				int[] newData = new int[data.length / n];
				for(int t = 0; t < newData.length; t++) {
					newData[t] = data[t * n];
				}
				data = newData;
			}
		}
		
		// JèÔµÅK»
		so = soinsu(data.length);
		for(long nn: so) {
			int n = (int)nn;
			for(;;) {
				if (data.length == 1)
					break;
				boolean dame = false;
				int w = data.length / n;// Ôu
				for(int t = 0; t < data.length - w; t++) {
					if (data[t] != data[t + w]) {
						dame = true;
						break;
					}
				}
				if (dame)
					break;
				int[] newData = new int[data.length / n];
				for(int t = 0; t < newData.length; t++) {
					newData[t] = data[t];
				}
				data = newData;
			}
		}
		
		
		return data;
	}
	

	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		int[] ir = readIntArray();
		int N = ir[0];
		
		int[][] orgData = new int[N][];
		
		for(int i = 0; i < N; i++) {
			// Pf[^ÇÞ
			String s = reader.readLine();
			int len = s.length() / 2;
			int[] data = new int[len];
			for(int j = 0; j < len; j++) {
				data[j] = Integer.parseInt(s.substring(j * 2, j * 2 + 2), 16);
			}
			
			data = saitekika(data);
			orgData[i] = data;
		}

		// Å¬ö{ðßé
		long lcm = 1;
		for(int i = 0; i < N; i++) {
			lcm = lcm(lcm, orgData[i].length);
		}
		
		int[] newData = null;
		if (lcm > 1000 * 1000) {
			newData = null;
		}
		else {	
		
			//Y¬
			newData = new int[(int)lcm];
			for(int t = 0; t < lcm; t++) {
				int rsum = 0;
				for(int j = 0; j < orgData.length; j++) {
					if (t % (lcm / orgData[j].length) == 0)
					rsum |= orgData[j][(int)(t / (lcm / orgData[j].length))];
				}
				newData[t] = rsum;
			}
		
			newData = saitekika(newData);
		}

		// ¶ñ»
		String s = "";
		if (newData == null || newData.length > 1024) {
			s = "Too complex.";
		}
		else {
			for(int t = 0; t < newData.length; t++) {
				s += String.format("%02X", newData[t]);
			}
		}
		
		// ðÌ\¦
		System.out.printf("%s\n", s);
		
		return true; // ³íI¹ Ö
	}
	

//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
			//String inputStr = "1\n2\n0102\n00000810\n";
//			String inputStr = "1\n1\n0200020008000200\n";
//			String inputStr = "1,1,0200020008000200,"; // 02020802
//			String inputStr = "1,1,0000,";
			String inputStr = "1,1,010200010200010200,"; // ­è©¦µ3 010200
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