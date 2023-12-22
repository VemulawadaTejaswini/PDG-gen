// Itp1_5_d.java
import java.io.*;
import java.lang.Integer;
public class Main
{
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			call( Integer.parseInt(br.readLine()));
		} catch ( IOException e ) {
			System.out.println("??¨??????????????????????????????");
		}
	}
	public static void call(int n) {
		int i = 1;
		do {
			int x = i;
			if ( x%3 == 0) {
				System.out.print(" " + i);
				continue;
			}
			while( x != 0 ) {
				if ( x%10 == 3) {
					System.out.print( " " + i);
					break;
				}
				x /= 10;
			}
		} while( ++i <= n);
		System.out.println("");
	}
}