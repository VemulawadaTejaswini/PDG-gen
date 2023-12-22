import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = br.readLine()) != null) {
			if(line.equals("0")) break;
			
			char[] c = line.toCharArray();
			int result = 0;
			
			for(char a: c) {
				result += a - '0';
			}
			
			System.out.println(result);
 		}
	}
}
