import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int i = 2;
		for (; i <= n; i = i * 2) {
		}
		System.out.println(i / 2);
	}
}
