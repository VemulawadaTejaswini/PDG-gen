import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] nums = new int[N];
		
		for(int i = 0; i < N; i++) {
			nums [i] = sc.nextInt();
		}
		
		int[] L = new int[N+1];
		int[] R = new int[N+1];
		
		L[0] = 0;
		R[N] = 0;
		
		for(int i = 0; i < N; i++) {
			L[i+1] = gcd(nums[i], L[i]);
		}
		
		for(int j = N-1; 0 < j; j--) {
			R[j] = gcd(nums[j], R[j+1]);
		}
		
		int answer = 1;
		int gcd = 1;
		
		for(int i = 0; i < N; i++) {
			gcd = gcd(L[i], R[i+1]);
			if(gcd > answer) {
				answer = gcd;
			}
		}
		
		System.out.println(answer);
	}

	public static int gcd(int num1, int num2){
		//ユークリッドの互除法により２数の最大公約数を求めるメソッド
		int num3 =1;

		if(num2 > num1) {
			//num1 >= num2 となるように並べ替え
			num3 = num2;
			num2 = num1;
			num1 = num3;
		}
		
		if(num2 <= 0) {
			return num1;
		}

		num3 = num1 % num2;

		while(num3 != 0){
			num1 = num2;
			num2 = num3;
			num3 = num1 % num2;
		}
		//割り切れた時の小さいほうの数がgcd
		return num2;
	}
}