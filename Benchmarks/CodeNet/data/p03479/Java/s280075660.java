import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = Long.parseLong(sc.next());
		long Y = Long.parseLong(sc.next());

		int cnt = 0;
		while(X<=Y) {
			cnt++;
			X=X*2;
		}
		System.out.println(cnt);
	}

}