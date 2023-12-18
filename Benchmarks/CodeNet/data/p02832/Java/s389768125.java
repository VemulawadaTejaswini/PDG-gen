import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int count = 0;
		int exp = 1;
		boolean possible = false;

		for(int i = 1; i <= n; i++) {
			int a = sc.nextInt();

			if(a != exp) {
				count++;
				continue;
			}

			exp++;
			possible = true;

		}

		if(possible) {
			System.out.println(count);
		}else {
			System.out.println(-1);
		}

		sc.close();

	}

}
