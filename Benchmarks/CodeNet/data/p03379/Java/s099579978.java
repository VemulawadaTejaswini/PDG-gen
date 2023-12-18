import java.util.*;

public class Main {
	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int[] arr = new int[N];
		sc.nextLine();
		String[] input = sc.nextLine().split(" ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		int[] sortedArr = arr.clone();
		Arrays.sort(sortedArr);
		int m1 = sortedArr[N / 2 - 1];
		int m2 = sortedArr[N / 2];
		for (int i = 0; i < N; i++) {
			int x = arr[i];
			if (x <= m1) {
				System.out.println(m2);
			} else {
				System.out.println(m1);
			}
		}
		sc.close();

	}

}
