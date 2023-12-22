import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			int a = sc.nextInt();
			int[] arr = new int[a];
			for (int i = 0; i < a; i++) {
				arr[i] = sc.nextInt();
			}

			System.out.println(Arrays.stream(arr).min().getAsInt() + " " + Arrays.stream(arr).max().getAsInt() + " "
					+ Arrays.stream(arr).mapToLong(r -> r).sum());
		}
	}
}
