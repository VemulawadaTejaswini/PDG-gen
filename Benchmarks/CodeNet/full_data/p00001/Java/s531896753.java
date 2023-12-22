import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int lc = 0;
		short[] heights = new short[10];
		while (lc < 10) {
			try {
				heights[lc] = Short.parseShort(reader.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			lc++;
		}

		Arrays.sort(heights);

		for (int i = heights.length-1; i > heights.length-4; i--) {
			System.out.println(heights[i]);
		}

	}

}