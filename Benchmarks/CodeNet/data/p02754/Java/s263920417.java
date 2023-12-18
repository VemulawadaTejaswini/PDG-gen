import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		if(A+B == 0) {
			pl(0);
			System.exit(0);
		}
		long itr = N/(A+B);
		long ans = 0L;
		ans += A * itr;
		if(N%(A+B) >= A) {
			ans += A;
		}
		else {
			ans += (N%(A+B));
		}
		pl(ans);
	}
	public static void pl(Object o) {
		System.out.println(o);
	}

}