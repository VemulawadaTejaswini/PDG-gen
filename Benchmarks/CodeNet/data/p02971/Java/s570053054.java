import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}

		for (int i = 0; i < n; i++) {
			int max = 0;
			for (int j = 0; j < n; j++) {
				if(i==j)continue;
				if(max < arr[j]) {
					max = arr[j];
				}
			}
			System.out.println(max);
		}
	}
}