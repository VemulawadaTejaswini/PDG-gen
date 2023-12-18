import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		LiningUp lu = new LiningUp();
		lu.run();
	}
}

class LiningUp {
	
	int N;
	int[] A;
	
	int[] nums;
	int MOD;
	
	LiningUp() {
		Scanner cin = new Scanner(System.in);
		this.N = cin.nextInt();
		this.A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = cin.nextInt();
		}
		
		this.nums = new int[N];
		this.MOD = (int) Math.pow(10, 9) + 7;
	}
	
	void run() {
		if (invalid()) {
			System.out.println(0);
			return;
		}
		
		long ans = pow(2, N / 2);
		System.out.println(ans);
	}

	long pow(int x, int n) {
		int ans = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				ans = ans * x % MOD;
			}
			x = x * x % MOD;
			n >>= 1;
		}
		return ans;
	}
	
	boolean invalid() {
		for (int num: A) {
			
			if (num >= N) 
				return true;
			
			if (N % 2 == 0 && num % 2 == 0)
				return true;
			
			if (N % 2 != 0 && num % 2 != 0)
				return true;
				
			nums[num]++;
			if (nums[num] > 2)
				return true;
			
			if (num == 0 && nums[num] == 2)
				return true;
				
		}
		return false;
	}
	
}
