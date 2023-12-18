import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		long n = sc.nextInt();
		long ans = (n - 1 + 1) * (n - 1) / 2;
		System.out.println(ans);
	}
}
