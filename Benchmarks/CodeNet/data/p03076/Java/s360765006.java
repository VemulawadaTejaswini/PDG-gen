import java.util.Scanner;

public class Main {
	void run() {
		int sum = 0, min = Integer.MAX_VALUE;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			int n = scan.nextInt();
			sum += Math.ceil((double) n / 10) * 10;
			if (n % 10 != 0)
				min = Math.min(min, n % 10);
		}
		if (min == Integer.MAX_VALUE)
			System.out.println(sum);
		else
			System.out.println(sum - 10 + min);
	}
    public static void main(String[] args) {
    	new Main().run();
    }
}
