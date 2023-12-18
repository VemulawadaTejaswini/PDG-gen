
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long x = sc.nextLong();
			TreeSet<Long> set = new TreeSet<Long>();

			for (int i = 0; i < n; i++) {
				long tmp = sc.nextLong() - x;
				if (tmp < 0) {
					set.add(-tmp);
				} else if (tmp != 0){
					set.add(tmp);
				}
			}

			long near = set.first();
			long result = set.first();
			int cnt = 1;
			while(1 < result) {
				boolean flg = true;
				for (int i = cnt; i < near; i++) {
					if (near % i == 0) {
						result = near / i;
						cnt = i;
						break;
					}
				}
				if (near <= cnt) {
					System.out.println("1");
					return;
				}
				for (long l : set) {
					if (l % result != 0) {
						flg = false;
						break;
					}
				}
				if (flg) {
					System.out.println(result);
					return;
				}
				cnt++;
			}
			System.out.println("1");
		}
	}
}
