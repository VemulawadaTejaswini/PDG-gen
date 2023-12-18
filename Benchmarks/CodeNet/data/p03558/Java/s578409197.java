import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long k = in.nextLong();
		int min = digitSum(k);
		for(int i=2;i<=1000000;i++) {
			min = Math.min(min, digitSum(k*i));
		}
		System.out.println(min);

	}
	
	public static int digitSum(long x) {
		int ret = 0;
		while(x>0) {
			ret += x%10;
			x /= 10;
		}
		return ret;
	}

}
