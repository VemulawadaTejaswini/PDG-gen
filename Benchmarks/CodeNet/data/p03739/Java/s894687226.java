import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<Integer> alist = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			alist.add(sc.nextInt());
		}

		int cntOdd = 0;
		int cntEvn = 0;
		int sum = 0;

		for (int i = 0; i < alist.size(); i++) {

			sum += alist.get(i);

			if(i%2 != 0) {
				if(sum >= 0) {
					while(sum >= 0) {
						sum--;
						cntOdd++;
					}
				} else {
					continue;
				}
			} else {
				if(sum <= 0) {
					while(sum <= 0) {
						sum++;
						cntOdd++;
					}
				} else {
					continue;
				}
			}
		}

		sum = 0;

		for (int i = 0; i < alist.size(); i++) {

			sum += alist.get(i);

			if (i%2 != 0) {
				if(sum <= 0) {
					while(sum <= 0) {
						sum ++;
						cntEvn++;
					}
				} else {
				continue;
				}
			} else {
				if(sum >= 0) {
					while(sum >= 0) {
						sum --;
						cntEvn++;
					}
				} else {
					continue;
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
