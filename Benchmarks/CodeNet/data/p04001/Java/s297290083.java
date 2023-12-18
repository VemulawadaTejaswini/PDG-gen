import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
		int l = s.length();

		long answer = 0;
		for (int i = 0; i < (1 << (l - 1)); i++) {
			String ss = s;
			for (int j = l - 1; j >= 0; j--) {
				if ((1 & (i >> j)) == 1) {
					ss = ss.substring(0, j+1) + "-" + ss.substring(j+1);
				}
			}
			String[] nums = ss.split("-");
			long sum = 0;
			for (int j = 0; j < nums.length; j++) {
				sum += Long.parseLong(nums[j]);
			}

			answer += sum;
		}

		System.out.println(answer);
	}
}
