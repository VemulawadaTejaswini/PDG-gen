import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<Integer> list = new ArrayList<>();

		for(int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		int total = 0;
		for(int a : list) {
			total += a;
		}

		int half = total / 2;

		int left = 0;
		for(int a : list) {
			if(left >= half) {
				break;
			}
			left += a;
		}

		int right = total - left;

		int diff = Math.abs(left - right);


		System.out.println(diff);

		sc.close();
	}


}
