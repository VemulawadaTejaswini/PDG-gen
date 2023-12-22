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
			for( int i = 0 ; i < 3 ; i++) {
				for( int j = 0 ; j < 2 ; j++) {
					if ( num[j] > num[j+1]) {
						int w = num[j];
						num[j] = num[j+1];
						num[j+1] = w;
					}
				}
			}
			System.out.println( "" + num[0] + " " + num[1] + " " + num[2]);
		} catch ( IOException e ) {
			System.out.println("??¨??????????????????????????????");
		}
	}
}