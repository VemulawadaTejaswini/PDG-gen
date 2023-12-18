import java.util.Scanner;

public class Main {

	public static int digit(int n) {
		int tmp = n;
		if(n == 0)return 1;
		int count = 0;
		while(tmp != 0) {
			tmp /= 10;
			++count;
		}
		return count;
	}
	
	public static int sumdigit(int n) {
		int d = digit(n);
		int tmp = n, sum = 0;
		for(int i = 0; i < d; ++i) {
			int tmp2 = tmp / 10;
			tmp -= tmp2 * 10;
			sum += tmp;
			tmp = tmp2;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a =sc.nextInt(), b = sc.nextInt();
		sc.close();
		int ans = 0;
		for(int i = 1; i <= n; ++i) {
			int tmp = sumdigit(i);
			if(tmp >= a && tmp <= b)ans += i;
		}
		System.out.println(ans);
	}

}
