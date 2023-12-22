import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int count = 1;
		while(true)) {
			System.out.println( "Case " + count + ": " + str );
			if ( str.equals("0") == true ) {
				break;
			}
			count++;
			str = br.readLine();
		}
	}
}