import java.util.Scanner;

class Main{
	static int[] dh = {0, 0, 1, -1, -1, -1, 1, 1};
	static int[] dw = {-1, 1, 0, 0, -1, 1, -1, 1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int ans = 0;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += a[i];
			if(sum == 0) {
				if(sum - a[i] < 0) sum += 1;
				else sum -= 1;
				ans++;
			}
			if(i == 0) continue;

			if(sum - a[i] < 0 && sum < 0) {
				ans += Math.abs(sum) + 1;
				sum = 1;
			}
			else if(sum - a[i] > 0 && sum > 0){
				ans += Math.abs(sum) + 1;
				sum = -1;
			}
		}
		System.out.println(ans);
	}
}