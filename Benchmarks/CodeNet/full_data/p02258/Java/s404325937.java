import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		try {
			int lim = Integer.parseInt(in.readLine());
			
			String[] nums = in.readLine().split(" ");
			int[] a = new int[nums.length];
			for (int i = 0; i < lim; i++) {
				a[i] = Integer.parseInt(nums[i]);
			}
			
			int max = 0;
			for (int i = 1; i < lim; i++) {
				int minus = a[i] - a[i - 1];
				
				if (max == 0) max = minus;
				if (max < minus) max = minus;
			}
			System.out.println(max);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}