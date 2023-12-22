import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> inputs = new ArrayList<>();

		while(true) {

			int input = sc.nextInt();
			if(input == 0) break;

			inputs.add(input);

		}
		sc.close();

		for(Integer input : inputs) {

			int tmp = input;
			if(tmp < 0) tmp = -tmp;

			int ans = 0;
			while(tmp > 0) {
				ans += tmp%10;
				tmp /= 10;
			}
			System.out.println(ans);
		}
	}
}