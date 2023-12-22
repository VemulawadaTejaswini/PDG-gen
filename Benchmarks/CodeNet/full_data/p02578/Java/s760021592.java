import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long answer = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			int height = sc.nextInt();
			if (height < max) {
				answer = answer + max - height;
				continue;
			}
			max = height;
		}
		sc.close();
		print(answer);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
