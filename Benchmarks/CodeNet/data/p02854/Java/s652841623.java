import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<Long> list = new ArrayList<>();

		for(int i = 0; i < n; i++) {
			list.add(sc.nextLong());
		}

		Long total = 0L;
		for(long a : list) {
			total += a;
		}

		Long half = total / 2;

		Long left = 0L;
		for(Long a : list) {
			if(left == half) {
				break;
			}
			if(left + a > half) {
				if(left > total - left - a || left + a == total) {
					break;
				}
			}
			left += a;
		}

		Long right = total - left;

		Long diff = Math.abs(left - right);


		System.out.println(diff);

		sc.close();
	}


}
