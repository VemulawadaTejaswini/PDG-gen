import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	static final long divider = 1_000_000_007;
	static Long[][] func;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int blue = sc.nextInt();
		int red = n - blue;
		func = new Long[n + 1][n + 1];
		for(int i = 1; i <= blue; i ++){
			long ans;
			if(i > red + 1){
				ans = 0;
			}
			ans = func(blue - i, i) * combination(red + 1, i) % divider;
			System.out.println(ans);
		}
	}
	static long func (int a, int b){
		if(func[a][b] != null){
			return func[a][b];
		}
		if(b == 1){
			func[a][b] = (long)1;
			return 1;
		}
		long ret = 0;
		for(int i = 0; i <= a; i ++){
			ret += func(i, b - 1);
			ret %= divider;
		}
		func[a][b] = ret;
		return ret;
	}
	static long combination(int a, int b){
		long ret = 1;
		b = Math.min(b, a - b);
		for(int i = a; i > a - b; i--){
			ret *= i;
		}
		for(int i = 1; i <= b; i++){
			ret /= i;
		}
		return ret % divider;
	}
}
