
import java.io.*;

public class Main {

	//ツ　0002
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for(;;) {
		
			String s = reader.readLine();
			if (s == null)
				break;
			
			String[] sp = s.split(" ");
			int a = Integer.parseInt(sp[0]);
			int b = Integer.parseInt(sp[1]);
			int c = a+b;
			String ans = "" + c;
			System.out.printf("%s\n", ans.length());
		}
		reader.close();
	}
}