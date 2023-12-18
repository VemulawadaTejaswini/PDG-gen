import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), sum = 0;
		int[] s = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
			sum += s[i];
		}
		if (sum % 10 != 0) {
			System.out.println(sum);
			return;
		} else {
			int idx = 0;
			Arrays.sort(s);
			while(sum%10 == 0 && idx < s.length) {
				sum -= s[idx];
				idx++;
			}
			System.out.println(sum);
		}
	}

}
