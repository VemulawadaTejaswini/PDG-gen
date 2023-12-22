import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String l = null;
		while((l = r.readLine()) != null){
			String[] nums = l.split(" ");
			System.out.printf("%d\n", Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]));
		}
	}
}