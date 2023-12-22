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
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			System.out.println(n/5+n/25+n/125+n/625+n/3125+n/15625);
		}
	}
}