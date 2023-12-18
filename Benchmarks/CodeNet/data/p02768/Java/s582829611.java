//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);

		long n, a, b;

		//花の種類
		n = scan.nextLong();

		//苦手な数
		a = scan.nextLong();
		b = scan.nextLong();

		//合計通り
		long sum = 0;

		for (long n_count = 2; n_count <= n; n_count++) {
			if (n_count == a || n_count == b) {
				continue;
			}

			long bunbo, bunshi;
			bunbo = 1;
			bunshi = 1;

			long loop_count = 0;
			while (true) {
				bunshi *= n - loop_count;
				loop_count++;

				if (n_count - 1 == loop_count)
					break;
			}

			long loop_count_bunbo = 0;
			while (true) {
				bunbo *= n_count - loop_count_bunbo;
				loop_count_bunbo++;

				if (n_count - loop_count_bunbo == 1)
					break;
			}

			sum += bunshi / bunbo;

		}

		System.out.println(sum);

	}

}