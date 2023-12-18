import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class Accepted {
	public static void Main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String l = br.readLine();
		int c = 0;
		for(int i = 0; i < 6; i++) {
			if(l.charAt(i) == '1') {
				c++;
			}
		}
		System.out.println(c);
	}
}