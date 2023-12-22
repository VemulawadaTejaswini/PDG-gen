import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;

		try {
			while ((line = br.readLine()) != null) {
				char[] charArray = line.trim().toCharArray();
				if(charArray.length > 20) System.exit(-1);
				
				for(int i = charArray.length - 1; i >= 0; i--){
					System.out.print(charArray[i]);
				}
				System.out.println("");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}