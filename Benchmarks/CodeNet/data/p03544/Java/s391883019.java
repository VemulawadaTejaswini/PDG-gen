
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		Arrays.fill(memo, -1);
		Main main = new Main();
		System.out.println(main.searchRucasNum(N));

	}
	static long[] memo= new long[87];
	public long searchRucasNum(int n) {
		long ans;
		if (memo[n] != -1) {
			ans = memo[n];
		}else {
			if (n == 0) {
				ans =  2;
			}else if (n == 1) {
				ans =  1;
			}else {
				ans =  searchRucasNum(n-1)+searchRucasNum(n-2);
			}
		}
		if (memo[n] == -1) {memo[n] = ans;}
		return ans;
	}

}

