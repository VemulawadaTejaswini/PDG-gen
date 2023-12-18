import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int x;
		int k;
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		x = sc.nextInt();

		int min = x - k + 1;
		int max = x + k - 1;

		if(k == 1) {
			System.out.println(x);
			System.exit(0);
		}
		for(int i = min ; i <= max ; i++) {
			System.out.println(i);
		}

		sc.close();

	}

}
