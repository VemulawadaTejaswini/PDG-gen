import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Scanner sc = new Scanner(new InputStreamReader(System.in));

	public static void main (String[] args) throws Exception {
		float max = Float.MIN_VALUE;
		float min = Float.MAX_VALUE;
		while(true) {
			String str = br.readLine();
			if(str == null) break;
			float n = Float.parseFloat(str);
			if(max < n) max = n;
			if(min > n) min = n;
		}
		System.out.println(max-min);
	}
}