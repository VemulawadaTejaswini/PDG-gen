import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean result;
		
		while ((br.readLine() != null)) {
			
			int a = Integer.parseInt(br.readLine());
			int count = 0;
			
			for (int i = 2; i < a; i++) {
				result = true;
				
				for (int j = 2; j < i; j++) {
					if (i%j == 0) {
						result = false;
						break;
					}
				if(result)count++;
				}
			
			System.out.println(count);
			
			}
		}
	}
}