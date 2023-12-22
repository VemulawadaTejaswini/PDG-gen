

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String regex = "apple";
		Pattern p = Pattern.compile(regex);

		Matcher m = p.matcher(str);
		String result = m.replaceAll("peach");
		System.out.println(result);
	}

}