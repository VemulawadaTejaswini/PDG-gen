import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();
		long a = X;
		int cnt = 0;
		while(a <= Y) {
			a = a * 2;
			cnt++;
		}
		System.out.println(cnt);
		sc.close();

	}

}