import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long A = sc.nextInt();
		long B = sc.nextInt();

		long ans=gcd(A,B);
		int count=1;
		for(int i=2;i<=ans;i++) {
			if(ans%i==0) {
				count++;
			}
			while (ans%i==0) {
				ans = ans/i;
			}
		}
		System.out.println(count);
	}

	public static long gcd(long m,long n) {
		long t;
		while (m % n != 0) {
			t = n;
			n = m%n;
			m = t;
		}
		return n;
	}

}
