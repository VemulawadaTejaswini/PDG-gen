import java.util.Scanner;

public class Main{
	static long GCD(long x, long y) {
		if(Math.max(x, y) % Math.min(x, y) == 0) return Math.min(x, y);
		return GCD(Math.min(x, y), Math.max(x, y) % Math.min(x, y));
	}
	static int GCD(int x, int y) {
		return (int)GCD((long)x, (long)y);
	}
	static long LCM(long x, long y){
		return (x / GCD(x,y)) * y;
	}
	static int LCM(int x, int y) {
		return (int)LCM((long)x, (long)y);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long ans = 1;
		for(int i = 0; i < N; i++) {
			long T = sc.nextLong();
			ans = LCM(ans, T);
		}
		System.out.println(ans);
	}
}