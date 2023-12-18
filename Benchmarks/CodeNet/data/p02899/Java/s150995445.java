import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(sc.next()));
		}

		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			ans[i] = list.indexOf(i + 1) + 1;
		}

		System.out.print(ans[0]);
		for (int i = 1; i < n; i++) {
			System.out.print(" " + ans[i]);
		}
		System.out.println();

	}

}
