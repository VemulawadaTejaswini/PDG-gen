import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
			
			while (true) {
				int m = nextInt();
				if (m==0)
					break;
				boolean[] r = new boolean[256];
				char[] table = new char[256];
				for (int i=0;i<256;i++)
					table[i] = (char)i;
				for (int i=0;i<m;i++) {
					char a = next().charAt(0);
					char b = next().charAt(0);
					table[a] = b;
					r[a] = true;
				}
				
				int n = nextInt();
				String tmp;
				StringBuilder result = new StringBuilder();
				for (int i=0;i<n;i++) {
					tmp = next();
					char c = tmp.charAt(0);
					if (r[c]) {
						result.append(table[c]);
						r[c] = false;
						table[c] = c;
					} else {
						result.append(c);
					}
				}
				System.out.println(result.toString());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private int nextInt() throws IOException {
		return Integer.parseInt(next());
	}
	
	
	private String next() throws IOException {
		if (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(bf.readLine());
		return st.nextToken();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
	}

}