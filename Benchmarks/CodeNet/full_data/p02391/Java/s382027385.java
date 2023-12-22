import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			List<String> arr = Arrays.asList(br.readLine().split(" "));
			Integer nums[] = (Integer[])arr.toArray(new Integer[0]);
			if (nums[0] < nums[1]) {
				System.out.println("a < b");
			} else if (nums[0] > nums[1]) {
				System.out.println("a > b");
			} else {
				System.out.println("a == b");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}