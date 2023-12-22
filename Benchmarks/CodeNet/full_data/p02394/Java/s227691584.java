import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static long w;
	static long h;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = br.readLine().split(" ");
		w = Long.parseLong(strArr[0]);
		h = Long.parseLong(strArr[1]);
		long x = Long.parseLong(strArr[2]);
		long y = Long.parseLong(strArr[3]);
		long r = Long.parseLong(strArr[4]);
		boolean isIn = isIn(x, y - r) && isIn(x, y + r) && isIn(x - r, y) && isIn(x + r, y);
		System.out.println(isIn ? "Yes" : "No");
	}
	
	private static boolean isIn(long x, long y){
		boolean xIsIn = 0 <= x && x <= w;
		boolean yIsIn = 0 <= y && y <= h;
		return xIsIn && yIsIn;
	}
}