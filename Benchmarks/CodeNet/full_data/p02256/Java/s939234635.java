import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			final String[] line = in.readLine().split(" ");
			in.close();
			
			final int x = Integer.parseInt(line[0]);
			final int y = Integer.parseInt(line[1]);
			
			System.out.println(String.valueOf(euclidean(x, y)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int euclidean(final int x, final int y) {
		int a = x<y ? y : x;
		int b = x<y ? x : y;
		int r = a % b;
		
		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
		}
		
		return b;
	}
}