import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
		String x = "";
		try {
			x = in.readLine();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String[] values = x.split(" ");

		int width = Integer.parseInt(values[0]);
		int height = Integer.parseInt(values[0]);
		int cx = Integer.parseInt(values[0]);
		int cy = Integer.parseInt(values[0]);
		int r = Integer.parseInt(values[0]);

		if (((cx - r) < 0) || ((cy - r) < 0) || ((cx + r) > width) || ((cy + r) > height)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}