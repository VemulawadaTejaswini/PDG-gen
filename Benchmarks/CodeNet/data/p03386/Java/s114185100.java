import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		int now = A;
		for (int i=0;i<K;i++) {
			if (A+i<=B) {
				now =A+i;
				System.out.println(now);
			}
		}
		for (int i=K-1;i>=0;i--) {
			if (B-i>now) {
				System.out.println(B-i);
			}
		}
	}
}