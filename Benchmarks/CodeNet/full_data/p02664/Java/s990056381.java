import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		read();
	}

	private static void read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();	
		str = str.replaceAll("\\?", "D");
		System.out.println(str);
		br.close();
	}
}