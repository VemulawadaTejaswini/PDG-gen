import java.util.Scanner;

public class Main {

	public static long gozyohou(long a, long b) {
		if(b == 0) {
			return a;
		}else {
			return gozyohou(b, a%b);
		}
	}


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		//Tの最小公倍数を求めればいい

		Long LeastCommonMultiple = sc.nextLong();

		for(int i = 1; i < N; i++) {
			long  k = sc.nextLong();
			LeastCommonMultiple = LeastCommonMultiple * k / gozyohou(LeastCommonMultiple,k);
		}

		System.out.println(LeastCommonMultiple);
	}
}
