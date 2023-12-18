import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		BoxesandCandies bc = new BoxesandCandies();
		bc.run();
	}
}

class BoxesandCandies {
	
	int N;
	long x;
	long[] nums;
	
	BoxesandCandies() {
		Scanner cin = new Scanner(System.in);
		this.N = cin.nextInt();
		this.x = cin.nextLong();
		this.nums = new long[N];
		for (int i = 0; i < N; i++) {
			nums[i] = cin.nextLong();
		}
	}
	
	void run() {
		long count = 0;
		long prev = nums[0];
		for (int i = 1; i < N; i++) {
			long next = nums[i];
			if (prev + next > x) {
				if (prev > next && i == 1) {
					long after = x - next;
					count += prev - after;
					nums[i - 1] = after;
				} else {
					long after = x - prev;
					count += next - after;
					nums[i] = after;
				}
			}
			prev = nums[i];
		}
		System.out.println(count);
	}
}
