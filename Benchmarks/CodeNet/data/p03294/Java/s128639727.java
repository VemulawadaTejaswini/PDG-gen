import java.util.Scanner;

class Main{

	public static void main(String[] args) {


		int[][] data = {{1,11},{5,3}};
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[]a = new int[N];
		long sum = 1;
		for(int i = 0;i < N;i++){
			a[i] = scan.nextInt();
			sum *= a[i];

		}
		int max = 0;
		for(int i= 0;i < N;i++){
			max = Math.max(max, a[i]);
		}

		int ans = 0;
		for(int i= 0;i < N;i++){
			ans += (sum-1)%a[i];
			System.out.println((sum-1)%a[i]);

		}



		System.out.println(ans);

	}
}






