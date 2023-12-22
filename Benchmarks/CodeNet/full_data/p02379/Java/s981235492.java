import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String str = reader.readLine();
			String[] points = str.split(" ");
			int x1 = Integer.parseInt(points[0]);
			int y1 = Integer.parseInt(points[1]);
			int x2 = Integer.parseInt(points[2]);
			int y2 = Integer.parseInt(points[3]);
			
			double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)); 
			System.out.println(d);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}