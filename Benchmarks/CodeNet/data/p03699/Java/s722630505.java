import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] s = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			s[i] = Integer.parseInt(sc.next());
			sum += s[i];
		}
		int max = 0;
		if (sum % 10 == 0) {
			Arrays.sort(s);
			int index = 0;
			while (s[index] % 10 == 0) {
				index++;
				if (index == n) {
					System.out.println("0");
					return;
				}
			}
			max = s[index];
		}
		System.out.println(sum - max);
	}
}