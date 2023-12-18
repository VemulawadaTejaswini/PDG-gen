import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] map = new int[10][10];

		long count = 0;

		// 先頭と末尾の数値のmap
		for (int i = 1; i <= n; i++) {
			int len = String.valueOf(i).length();
			int d = (int) Math.pow(10, len - 1);
			int head = i / d;
			int tail = i % 10;
			map[head][tail]++;
		}

		for (int i = 1; i <= n; i++) {
			int len = String.valueOf(i).length();
			int d = (int) Math.pow(10, len - 1);
			int head = i / d;
			int tail = i % 10;
			count = count + map[tail][head];
		}

		print(count);
		sc.close();
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
