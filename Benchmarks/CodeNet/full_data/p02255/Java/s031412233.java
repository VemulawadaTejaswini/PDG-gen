import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int nums[] = new int[n];
		String str[] = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(str[i]);
		}
		for (int j = 0; j < n; j++) {
			int v = nums[j];
			int s = j - 1;
			while (s >= 0 && nums[s] > v) {
				nums[s + 1] = nums[s];
				s--;
			}
			nums[s + 1] = v;
			for (int p = 0; p < n; p++) {
				if (p == (n - 1)) {
					System.out.println(nums[p]);
				} else {
					System.out.print(nums[p] + " ");
				}
			}
		}
	}
}