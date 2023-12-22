import java.io.*;
import java.lang.Integer;
public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String in  = br.readLine() ;
			String[] numStr = in.split(" ");
			int[] num = new int[4];
			num[0] = Integer.parseInt(numStr[0]);
			num[1] = Integer.parseInt(numStr[1]);
			num[2] = Integer.parseInt(numStr[2]);
			int cnt = 0;
			for( int n = num[0] ; n <= num[1] ; n++) {
				if ( (num[2]%n) == 0 ) cnt++;
			}
			System.out.println(cnt);
		} catch ( IOException e ) {
			System.out.println("??¨??????????????????????????????");
		}
	}
}