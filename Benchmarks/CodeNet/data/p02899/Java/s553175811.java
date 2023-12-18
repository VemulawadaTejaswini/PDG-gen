import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Man[] arr = new Man[n];
		for (int i = 0; i < arr.length; i++) {
			Man m = new Man();
			m.i = i;
			m.a = sc.nextInt();
			arr[i] = m;
		}
		sc.close();

		Arrays.parallelSort(arr, (x, y) -> x.a - y.a);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].i + 1);
		}
	}

	static class Man {
		int i, a;
	}
}
