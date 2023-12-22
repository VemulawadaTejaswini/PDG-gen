import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Main {

	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String readline = br.readLine();
		int date = Integer.parseInt(readline);
		int h = date / 3600;
		int m = (date % 3600) / 60;
		int s = (date % 3600) % 60;
		System.out.println(h + ":" + m + ":" + s);

	}

}