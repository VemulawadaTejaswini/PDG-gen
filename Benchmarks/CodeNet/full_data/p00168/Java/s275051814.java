public class Main {

	public static void main(String[] args) {
		System.out.println(solve(25, 3));
	}

	public static int solve(int n, int skip) {

		int[] step = new int[n+1];
		step[1] = 1;
		step[2] = 2;
		step[3] = 4;
		
		for (int j = 4; j <= n; ++j) {
			step[j] = step[j-1]+step[j-2]+step[j-3];
		}

		if (step[n]%365==0) {
			return step[n]/365/10;
		} else {
			return (step[n]/365/10)+1;
		}
	}
}