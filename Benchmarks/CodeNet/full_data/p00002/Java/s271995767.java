import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		print();
	}

	private static void print()  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String str = null;
			try {
				str = br.readLine();
				while(str != null){
				String[] nums = str.split(" ", 0);
				int a = Integer.parseInt(nums[0]);
				int b = Integer.parseInt(nums[1]);

		        System.out.println(a+b);
				}
			} catch (IOException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			}

	}

}