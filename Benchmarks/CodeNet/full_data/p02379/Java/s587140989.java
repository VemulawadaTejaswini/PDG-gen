
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[]point = br.readLine().split(" ");
		double x1 = Double.parseDouble(point[0]);
		double x2 = Double.parseDouble(point[1]);
		double y1 = Double.parseDouble(point[2]);		
		double y2 = Double.parseDouble(point[3]);
		
		double length = y1 - x1;
		double height = y2 - x2;
		System.out.println(Math.sqrt((length * length) + (height * height)));
	}
}