import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		sugo();
	}

	public static void sugo() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int count = 0;
		;
		int keep = 0;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for (int num : A) {
			if (num == 1) {
				keep++;
				if (count < keep) {
					count = keep;
				}
			} else {
				keep = 0;
			}
		}
		System.out.println(count + 1);
	}
}

