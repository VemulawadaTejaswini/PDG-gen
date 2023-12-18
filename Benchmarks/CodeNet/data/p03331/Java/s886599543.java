import java.util.*;
public class Main {
	public static void main(String[] args){
		digitSum();
	}
	
	public static void digitSum() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = num/2, b = a;
		if (num % 2 != 0) a += 1;
		int res = Integer.MAX_VALUE;
		while (a < num && b > 0) {
			res = Math.min(res, digit(a) + digit(b));
			a++;
			b--;
		}
		System.out.println(res);
	}
	
	public static int digit(int a) {
		int res = 0;
		while (a > 0) {
			res += a % 10;
			a /= 10;
		}
		return res;
	}
}