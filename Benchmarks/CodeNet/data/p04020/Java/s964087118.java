import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long cnt = 0;
		boolean odd = false;
		for (int i=0; i<N; i++) {
			long A = sc.nextLong();
			cnt += A/2;
			if (odd && A%2==1) {
				cnt++;
				odd = false;
			} else {
				odd = A%2==1;
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}
