import java.util.*;
import java.io.*;

public class Main {
	
	public static int solve (int a1, int m1, int a2, int m2, int a3, int m3) {
		
		int x, y, z, cnt = 0;
		x = a1 % m1;
		y = a2 % m2;
		z = a3 % m3;
		
		while (!(x == 1 && y == 1 && z == 1)) {
			
			x = a1 * x % m1;
			y = a2 * y % m2;
			z = a3 * z % m3;
			cnt++;
			
		}
		
		return cnt + 1;
	}
	
	public static void main (String[] args) throws IOException {

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			
			String s = br.readLine();;
			if (s == null) break;
			StringTokenizer st = new StringTokenizer(s," ");
			if (st.countTokens() < 6) break;
			
			int a1 = Integer.parseInt(st.nextToken());
			int m1 = Integer.parseInt(st.nextToken());
			int a2 = Integer.parseInt(st.nextToken());
			int m2 = Integer.parseInt(st.nextToken());
			int a3 = Integer.parseInt(st.nextToken());
			int m3 = Integer.parseInt(st.nextToken());
			
			System.out.println(solve(a1,m1,a2,m2,a3,m3));
			
		}
		
	}
}