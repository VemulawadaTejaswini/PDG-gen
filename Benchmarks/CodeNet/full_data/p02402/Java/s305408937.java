import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int min = 1000000, max = -1000000, sum = 0;
		for (int i = 0; i < n; i ++) {
			int a = scanner.nextInt();
			min = Math.min(min, a);
			max = Math.max(max, a);
			sum += a;
		}
		
		scanner.close();
		
		System.out.println(min + " " + max + " " + sum);
	}

}

