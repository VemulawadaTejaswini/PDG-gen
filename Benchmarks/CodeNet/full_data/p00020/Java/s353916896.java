import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String str;
		try {
			str = input.readLine();
			
			System.out.println(str.toUpperCase());

		} catch (IOException e) {
			// TODO ????????????????????? catch ????????????
			e.printStackTrace();
		}

	}

}