import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long re = Main.count(A, B);
		int count =1;
		boolean b = false;
		for (long i=2;i*i<=re;i++) {
			if (re%i==0) {
				b = true;
				break;
			}
		}
		if (re>1&&b==false) {
			System.out.println(2);
			return ;
		}
//		long temp = re;
		for (long i=2;i<=1000000 &&i<=re;i++) {
			if (re%i==0) {
				while (re%i==0) {
					re/=i;
				}
				count ++;
			}
		}
		System.out.println(count);
	}

	public static long count(long A,long B) {
		if (A<B) {
			return count(B,A);
		}
		if (B==0) {
			return A;
		}
		return count(B,A%B);
	}
}