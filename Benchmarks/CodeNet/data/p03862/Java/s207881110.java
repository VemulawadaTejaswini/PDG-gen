import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		BoxesandCandies bc = new BoxesandCandies();
		bc.run();
	}
}

class BoxesandCandies {
	
	int N;
	int x;
	int[] nums;
	
	BoxesandCandies() {
		Scanner cin = new Scanner(System.in);
		this.N = cin.nextInt();
		this.x = cin.nextInt();
		this.nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = cin.nextInt();
		}
	}
	
	void run() {
		int count = 0;
		int prev = nums[0];
		for (int i = 1; i < N; i++) {
			int next = nums[i];
			if (prev + next > x) {
				if (prev > next) {
					int after = x - next;
					count += prev - after;
					nums[i - 1] = after;
				} else {
					int after = x - prev;
					count += next - after;
					nums[i] = after;
				}
			}
			prev = nums[i];
		}
		System.out.println(count);
	}
}
