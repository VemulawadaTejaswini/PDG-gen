import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] depth_width = str.split(" ", 0);
		int depth = Integer.parseInt(depth_width[0]);
		int width = Integer.parseInt(depth_width[1]);;

		int perimeter = depth * 2 + width * 2;
		int area = depth * width;

		System.out.println(area + " " + perimeter);
	}
}