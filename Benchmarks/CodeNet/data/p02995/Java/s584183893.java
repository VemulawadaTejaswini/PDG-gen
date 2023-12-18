import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long A = Long.valueOf(sc.next());
		long B = Long.valueOf(sc.next());
		long C = Long.valueOf(sc.next());
		long D = Long.valueOf(sc.next());

		int cnt = 0;
		for (long i = A; i < B; i++) {

			if(i%C!=0&&i%D!=0) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}
}
