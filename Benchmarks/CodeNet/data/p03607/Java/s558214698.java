import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(s);
		boolean[] nums = new boolean[1000000000];
		int max = 0;
		for (int i = 0; i < n; i++) {
			s = br.readLine();
			int number = Integer.parseInt(s);
			if(number > max)
				max = number;
			if(nums[number])
				nums[number]=false;
			else {
				nums[number] = true;
			}
		}
		int count = 0;
		for (int i = 0; i <= max; i++) {
			if(nums[i])
				count++;
		}
		System.out.println(count);

	}

}
