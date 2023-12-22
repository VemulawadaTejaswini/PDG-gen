import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		int answer = 10 - x / 200;

		print(answer);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}
}
