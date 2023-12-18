import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		System.out.println(f(B)^f(A-1));
	}
	static long f(long x) {
		if (x%2==1) {
			if (x/2%2==1) {
				return (long)0;
			}else {
				return (long)1;
			}
		}else {
			if (x/2%2==0) {
				return x;
			}else {
				return x+1;
			}
		}
	}
}