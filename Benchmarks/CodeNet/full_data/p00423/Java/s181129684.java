import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	private StringTokenizer st;
	private BufferedReader bf;
	private int w;
	
	Main() {
		readData();
		

	}	

	private void readData() {
		try {
			bf = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer(bf.readLine());

			int n = nextInt();
			while (n != 0) {
				int rA = 0;
				int rB = 0;
				for (int i = 0; i < n; i++) {
					int a = nextInt();
					int b = nextInt();
					if (a > b) {
						rA += a + b;
					} else if (a < b) {
						rB += a + b;
					} else {
						rA += a;
						rB += b;
					}
	//				BigDecimal bd = new BigDecimal(m);
	//				BigDecimal bd3 = bd.setScale(-3, BigDecimal.ROUND_UP);
	//				m = bd3.intValue();
	//				System.out.println((int)m);
				}
				System.out.println(rA+" "+rB);
				
				n = nextInt();
			}
//			DecimalFormat df = new DecimalFormat("0");
//			System.out.println(df.format(m));
			
		} catch (Exception e) {
			System.out.println("dacat");
			e.printStackTrace();
		}
	}
	
	private int nextInt() throws IOException {
		return Integer.parseInt(next());
	}
	
	
	private String next() throws IOException {
		try {
		if (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(bf.readLine());
		} catch (Exception e) {
			System.out.println("dacat");
		}
		return st.nextToken();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
	}

}