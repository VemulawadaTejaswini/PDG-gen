import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j = 1;
		int i = 1;
		for (i = 1; i <= n; i++) {
			j *= i % (1000000000 + 7);
		}
		System.out.println(j);	
	}
}