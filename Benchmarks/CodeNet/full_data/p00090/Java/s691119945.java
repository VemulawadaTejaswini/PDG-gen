
import java.io.*;
import java.math.BigDecimal;
import java.util.*;


// 2011/10/22

//0092 dÈé~
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
	
	int size;
	boolean[][] map;
	
	// n ÔÈ~ÉÂ¢Äl¦é
	int think(List<Integer> list, int n) {
		
		if (n >= size) {
			return list.size();
		}
		
		boolean dame = false;
		for(int i = 0; i < list.size(); i++) {
			if (!map[n][list.get(i)]) {
				dame = true;
				break;
			}
		}
		
		int t = 0;
		if (!dame) {
			list.add(n);
			t = think(list, n + 1);
			list.remove((Integer)n);
		}
		int t2 = think(list, n + 1);
		t = Math.max(t, t2);
		return t;
	}
	
	
	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		int[] ir = readIntArray();
		size = ir[0];
		if (size == 0)
			return false;

//		Double2[] circle = new Double2[size];
		BigDecimal[][] circle = new BigDecimal[size][2];
		for(int i = 0; i < size; i++) {
			
			String s = reader.readLine();
			s = s.trim();
			String[] sp = s.split(",");
//			double x = Double.parseDouble(sp[0]);
//			double y = Double.parseDouble(sp[1]);
//			circle[i] = new Double2(x, y);
			BigDecimal b1 = new BigDecimal(sp[0]);
			BigDecimal b2 = new BigDecimal(sp[1]);
			circle[i][0] = b1;
			circle[i][1] = b2;
		}
		
		//@QÂÌ~ÌdÈèîñðßé
		map = new boolean[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = i + 1; j < size; j++) {
//				map[j][i] = map[i][j] = circle[i].length2(circle[j]) <= 4.; // £QÈº
				BigDecimal s1 = circle[i][0].subtract(circle[j][0]);
				BigDecimal s2 = circle[i][1].subtract(circle[j][1]);
				s1 = s1.multiply(s1);
				s2 = s2.multiply(s2);
				BigDecimal sum = s1.add(s2);
				map[j][i] = map[i][j] = sum.compareTo(new BigDecimal(4)) <= 0;// £2Èº
			}
		}
		
		List<Integer> list = new ArrayList<Integer>();
		int max = think(list, 0);
		
		
		// ðÌ\¦
		System.out.printf("%d\n", max);
		
		return true; // ³íI¹ Ö
	}
	

//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
			String inputStr = "15:3.14979,8.51743:2.39506,3.84915:2.68432,5.39095:5.61904,9.16332:7.85653,4.75593:2.84021,5.41511:1.79500,8.59211:"+
			"7.55389,8.17604:4.70665,4.66125:1.63470,4.42538:7.34959,4.61981:5.09003,8.11122:5.24373,1.30066:0.13517,1.83659:7.57313,1.58150:"
			+"0:"; 
//			String inputStr = "3:100,100:102,100:101,100:"
//			+"0:"; 

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
		String[] sp = s.split(" ");
		int[] a = new int[sp.length];
		for(int i = 0; i < sp.length; i++) {
			a[i] = Integer.parseInt(sp[i]);
		}
		return a;
	}
		
}