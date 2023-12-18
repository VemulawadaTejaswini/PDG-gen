import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		if(k==0) {
			System.out.println(a + " " + b);
		return;
		}
		if(a >= k) {
			System.out.println(a-k + " " + b);
			return;
		}
		k -= a;
		if(b >= k) {
			System.out.println("0 " + (b-k));
		return;
		}
		System.out.println("0 0");
	}

}
