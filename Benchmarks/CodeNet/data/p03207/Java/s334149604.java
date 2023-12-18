import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int amt = 0;
		int max = 0;

		for(int i = 0; i < n; i++) {
			int v = sc.nextInt();
			amt += v;
			max = Math.max(max, v);
		}

		amt -= max/2;

		System.out.println(amt);

	}

}

