import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int a = 0;
		String s = "";
		try {
			line = br.readLine();
			a = Integer.parseInt(line);
			s = br.readLine();
		} catch (IOException e) {
			e.getStackTrace();
		}
		
		if(a >= 3200) {
			System.out.println(s);
		}else {
			System.out.println("red");
		}
	}
}