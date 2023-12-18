import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int one = 0;
		int two = 0;
		int cnt = 0;
		int last = Integer.parseInt(sc.next());
		int[] array = new int[N];
		array[0] = last;
		for (int i = 1; i < N; i++) {
			int current = Integer.parseInt(sc.next());
			if (cnt >= 2) {
				System.out.println("NO");
				sc.close();
				return;
			}
			if (cnt == 1) {
				if (one != 1 &&array[one - 1] > current) {
					System.out.println("NO");
					sc.close();
					return;
				}
			}
			array[i] = current;
			if (current < last) {
				cnt++;
				if (cnt == 1) {
					one = i;
				} else if (cnt == 2) {
					two = i;
				}
			}
			last = current;

		}
		sc.close();
		if (cnt == 1) {
			if (one != 1) {
				if (array[one - 2] > array[one]) {
					System.out.println("NO");
					return;
				}
			}
		} else if (cnt == 2) {
			int tmp = array[two];
			array[two] = array[one - 1];
			array[one - 1] = tmp;
			for (int i = 1; i < N; i++) {
				if (array[i - 1] > array[i]) {
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.println("YES");
	}
}