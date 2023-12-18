import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<Long> alist = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			alist.add(sc.nextLong());
		}

		int cntOdd = 0;
		int cntEvn = 0;
		long sum = 0;

		for (int i = 0; i < alist.size(); i++) {

			sum += alist.get(i);

			//iが偶数のとき正
			if(i%2 == 0) {
				if(sum > 0) {
					continue;
				} else {
					long diff = 1-sum;
					cntEvn += 1-sum;
					sum += diff;
				}
			} else {
				if(sum < 0) {
					continue;
				} else {
					long diff = 1+sum;
					cntEvn += 1+sum;
					sum -= diff;
				}
			}
		}

		sum =0;

		for (int i = 0; i < alist.size(); i++) {

			sum += alist.get(i);

			//iが偶数のとき負
			if (i%2 == 0) {
				if(sum < 0) {
					continue;
				} else {
					long diff = 1+sum;
					cntOdd += 1+sum;
					sum -= diff;
				}
			} else {
				if(sum > 0) {
					continue;
				} else {
					long diff = 1-sum;
					cntOdd += 1-sum;
					sum += diff;
				}
			}
		}
		if(cntOdd <= cntEvn) {
			System.out.println(cntOdd);
		} else {
			System.out.println(cntEvn);
		}
	}
}
