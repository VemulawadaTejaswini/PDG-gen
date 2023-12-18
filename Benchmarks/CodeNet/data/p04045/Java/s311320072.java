import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();

		ArrayList<Integer> unused_numbers = new ArrayList<Integer>();
		for (int i = 0 ; i < K ; i++) {
			unused_numbers.add(scanner.nextInt());
		}

		ArrayList<Integer> usable_numbers = new ArrayList<Integer>();
		for (int i = 0 ; i < 10 ; i++) {
			if (!unused_numbers.contains(i)) {
				usable_numbers.add(i);
			}
		}

		// 使用可能な数字の中で、Nを超える最大の整数値を探す
		System.out.println(get_payment(usable_numbers, N));

		scanner.close();
	}

	private static int get_payment(ArrayList<Integer> usable_numbers, int N) {
		List<Integer> n = Arrays.asList(String.valueOf(N).split("")).stream().map(value -> Integer.parseInt(value)).collect(Collectors.toList());
		Collections.reverse(n);

		int tmp = N;
		int before_size = n.size();
		int after_size;

		for (int i = 0 ; i < n.size() ; i++) {
			if(!usable_numbers.contains(n.get(i))) {
				int next_min = get_next_min_number(usable_numbers, n.get(i));

				// 次の位を上げる
				if(n.get(i) > next_min ) {
					tmp = (int) (tmp + Math.pow(10, i + 1));
					n = Arrays.asList(String.valueOf(tmp).split("")).stream().map(value -> Integer.parseInt(value)).collect(Collectors.toList());
					Collections.reverse(n);
				}

				n.set(i, next_min);

				// 最大桁が上がった場合は、それ以下を最小値に変更
				after_size = n.size();
				if((before_size < after_size) ||
						(N / Math.pow(10, before_size - 1) < tmp / Math.pow(10, after_size - 1))) {
					for (int j = 0 ; j < n.size() - 1 ; j++) {
						n.set(j, usable_numbers.get(0));
					}
				}
			}
		}

		Collections.reverse(n);
		return Integer.parseInt(String.join("", n.stream().map(value -> String.valueOf(value)).collect(Collectors.toList())));
	}

	private static int get_next_min_number(ArrayList<Integer> usable_numbers, int number) {
		while(true) {
			number = (number + 1) % 10;
			if(usable_numbers.contains(number)) {
				return number;
			}
		}
	}
}
