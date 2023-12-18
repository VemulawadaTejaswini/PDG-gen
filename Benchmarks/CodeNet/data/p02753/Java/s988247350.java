import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		String line = br.readLine();
		
		if((line.lastIndexOf("A") != -1)
				&& (line.lastIndexOf("B") != -1)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
