import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int j = 0;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			int subsum = 0;
			j = i;
			while (j>0) {
				subsum +=j%10;
				j = j/10;
			}
			if (a <= subsum && subsum <= b) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
