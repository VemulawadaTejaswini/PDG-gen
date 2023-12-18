import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String l1 = scan.nextLine();
		String l2 = scan.nextLine();
		scan.close();

		int N = Integer.valueOf(l1);
		ArrayList<Integer> AN = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			AN.add(Integer.valueOf(l2.split(" ")[i]));
		}

		for (int i = 0; i < N; i++) {
			System.out.println(find(AN, i + 1));
		}
	}

	static int find(ArrayList<Integer> source, int k) {
		ArrayList<Integer> source2 = new ArrayList<Integer>();

		for (int i = 0; i < source.size(); i++) {
			if (i == (k - 1)) continue;
			source2.add(source.get(i));
		}

		int result = 0;

		for (int i = 0; i < source2.size(); i++) {
			for (int j = i + 1; j < source2.size(); j++) {
				int a = source2.get(i);
				int b = source2.get(j);

				if (a == b) {
					result++;
				}
			}
		}

		return result;
	}
}