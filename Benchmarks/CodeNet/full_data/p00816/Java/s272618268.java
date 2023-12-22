import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int n, target;
	int ans = -1;
	boolean rejected = true;
	int nums[];
	int temp[] = new int[6];

	public void shred(int x, int num, int index) {
		for (int i = 10; i <= (num * 10); i *= 10) {
			int mod = num % i;
			temp[index] = mod;
			if (x + mod > n)
				break;
			if (num / i == 0) {
				if (x + mod > ans) {
					rejected = false;
					ans = x + mod;
					nums = Arrays.copyOf(temp, temp.length);
				} else if (x + mod == ans) {
					rejected = true;
				}
			} else {
				shred(x + mod, num / i, index + 1);
			}
			temp[index] = -1;
		}
	}

	public void run() {
		Scanner in = new Scanner(System.in);
		while (true) {
			ans = -1;
			Arrays.fill(temp, -1);
			n = in.nextInt();
			target = in.nextInt();
			if ((n | target) == 0)
				break;
			shred(0, target, 0);
			if (ans == -1)
				System.out.println("error");
			else if (rejected)
				System.out.println("rejected");
			else {
				System.out.print(ans);
				for (int i = nums.length - 1; i >= 0; i--) {
					if (nums[i] == -1)
						continue;
					System.out.print(" " + nums[i]);
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}