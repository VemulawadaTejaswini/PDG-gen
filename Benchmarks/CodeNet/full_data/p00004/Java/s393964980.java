import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		String str = "";
		try {
			while ((str = in.readLine()) != null) {
				String[] nums = str.split(" ");

				double a = Integer.parseInt(nums[0]);
				double b = Integer.parseInt(nums[1]);
				double c = Integer.parseInt(nums[2]);
				double d = Integer.parseInt(nums[3]);
				double e = Integer.parseInt(nums[4]);
				double f = Integer.parseInt(nums[5]);
				
				double x = (e * c - b * f) / (a * e - b * d);
				double y = (a * f - d * c) / (a * e - b * d);
				
				System.out.printf("%.3f %.3f", x, y);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}