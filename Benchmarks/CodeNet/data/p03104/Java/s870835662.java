import java.util.Scanner;
public class Main {
	public static long f(long a) {
		if (a < 0) a = 0;
		if(a % 2 == 0) {
			if(a % 4 == 0) return a;
			else return a+1;
		}
		else {
			if((a+1) % 4 == 0) return 0;
			else return 1;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		System.out.println(f(A-1) ^ f(B));
	}

}