import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String c = br.readLine();
		
		if (c.equals("a") || c.equals("i") ||c.equals("u")||c.equals("e")||c.equals("o")) {
			System.out.println("vowel");
		}
		
		else{
			System.out.println("consonant");
		}

	}

}
