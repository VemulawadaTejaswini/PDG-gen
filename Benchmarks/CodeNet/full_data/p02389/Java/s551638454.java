import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int height = Integer.parseInt(reader.readLine());
		int width = Integer.parseInt(reader.readLine());
		int area = height * width;
		int roundSpan = (height + width) * 2;

		System.out.println(area + " " + roundSpan);

	}

}