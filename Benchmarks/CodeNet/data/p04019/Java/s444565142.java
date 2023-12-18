import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);

		String s;
		int x, y;
		for (String line; (line = in.readLine()) != null;) {
			s = line.trim();
			x = 0;
			y = 0;
			int n = s.length();
			boolean b = false;
			for (int i = 0; i < n; i++) {
				switch (s.charAt(i)) {
				case 'S':
					y-=1;
					break;
				case 'N':
					y+=1;
					break;
				case 'W':
					x+=1;
					break;
				case 'E':
					x-=1;
					break;
				}
				
				if(x==0&&y==0) {
					b=true;
					break;
				}
			}
			out.println(b?"YES":"NO");
		}

		out.close();
		in.close();
	}
}