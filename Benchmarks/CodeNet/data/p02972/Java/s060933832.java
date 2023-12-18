import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];

		for (int i = 0; i < N; i++)
			A[i] = sc.nextInt();

		int[] hako = new int[N+1];
		Arrays.fill(hako, 0);

		boolean flag = true;
		ArrayList<Integer> array = new ArrayList<>();

		for (int i = 0; i < N; i++) {

			if (A[i] == 0) {
				if (calc(A, i+1) % 2 == 0) {
					//array.add(i+1);
				} else {
					array.add(i+1);
				}
			} else {
				if (calc(A, i+1) % 2 != 0) {
					//array.add(i+1);
				} else {
					array.add(i+1);
				}
			}
		}

		if (array.size() != 0) {
			for (int i = 0; i < array.size(); i++) {
				hako[array.get(i)]++;
			}
			for (int i = 1; i <= N; i++) {
				if (calc(hako, i) % 2 != A[i-1]) {
					flag = false;
					break;
				}
			}
		}


		if (!flag) {
			System.out.println(-1);
		} else if (array.size() == 0) {
			System.out.println(0);
		} else {
			System.out.println(array.size());
			for (int i = 0; i < array.size(); i++) {
				System.out.println(array.get(i));
			}
		}
	}
	static int calc(int[] A, int x) {

		int sum = 0;
		for (int i = x; i < A.length; i += x) {
			sum += A[i];
		}
		return sum;
	}

}