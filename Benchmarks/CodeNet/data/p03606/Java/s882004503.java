import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] left = new int[N];
		int[] right = new int[N];
		for(int i = 0; i < N; i++) {
			left[i] = Integer.parseInt(sc.next());
			right[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		int seat = 0;
		for(int i = 0; i < N; i++) {
			seat += right[i] - left[i] + 1;
		}
		System.out.println(seat);
	}

}