
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String before = "";
		String after = "";
		String st = "ST";
		int count = 0;

		while(str.contains("ST")){
			while(str.contains(st) && str.indexOf(st) < str.indexOf("ST")){
				st = "S" + st + "T";
			}
			before = str.substring(0, str.indexOf(st));
			after = str.substring(str.indexOf(st)+st.length(), str.length());
			str = before + after;
		}

		System.out.println(str.length());

	}
}
