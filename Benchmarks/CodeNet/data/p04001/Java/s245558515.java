import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int len = arr.length;
		long total = 0;
		for (int i = 0; i < pow2(len - 1); i++) {
			ArrayList<Long> list = new ArrayList<>();
			long tmp = arr[0] - '0';
			for (int j = 1; j < len; j++) {
				int x = arr[j] - '0';
				if ((i / pow2(j - 1)) % 2 == 1) {
					tmp  = tmp * 10 + x;
				} else {
					list.add(tmp);
					tmp = x;
				}
			}
			long sum = tmp;
			for (long x : list) {
				sum += x;
			}
			total += sum;
		}
		System.out.println(total);
	}
	
	static int pow2(int x) {
		if (x == 0) {
			return 1;
		} else {
			return 2 * pow2(x - 1);
		}
	}
	
}
