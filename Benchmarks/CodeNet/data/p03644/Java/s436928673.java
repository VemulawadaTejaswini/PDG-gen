import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		System.out.println(search(N));
	}

	public static int search(int N) {
		int work_n;
		int ans = 1;
		int count = 0;
		int max_count = 0;

		for(int n = 1; n <= N; n++) {
			count = 0;
			work_n = n;
			while ((work_n % 2 == 0) && (work_n > 0)) {
				work_n /= 2;
				count++;
			}
			if (max_count < count) {
				ans = n;
				max_count = count;
			}
		}
		return ans;
	}
}
