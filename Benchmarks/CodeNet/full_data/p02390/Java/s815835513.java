import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int s = Integer.parseInt(br.readLine());
			int ss = s % 60;
			int mm = s / 60 % 60;
			int hh = s / 3600;

			System.out.println(hh + ":" + mm + ":" + ss);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}