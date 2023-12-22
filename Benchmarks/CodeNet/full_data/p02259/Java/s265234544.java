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
			
			for (int i = 0; i < a.length; i++) {
				a[i] = Integer.parseInt(nums[i]);
			}
			
			int cnt = 0;
			for (int i = 0; i < a.length; i++) {
				for (int j = (a.length - 1); j > i; j--) {
					if (a[j] < a[j - 1]) {
						int tmp = a[j];
						a[j] = a[j - 1];
						a[j - 1] = tmp;
						cnt++;
					}
				}
			}
			
			System.out.print(a[0]);
			for (int i = 1; i < a.length; i++) {
				System.out.print(" " + a[i]);
			}
			System.out.println();
			
			System.out.println(cnt);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}