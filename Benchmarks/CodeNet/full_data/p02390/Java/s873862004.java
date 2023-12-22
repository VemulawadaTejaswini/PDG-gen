import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;
		try {
			while ((buffer = reader.readLine())  != null) {
				int second = Integer.valueOf(buffer);
				int minute = second / 60;
				second -= minute * 60;
				int hour = minute / 60;
				minute -= hour * 60;
				System.out.println(hour + ":" + minute + ":" + second);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}