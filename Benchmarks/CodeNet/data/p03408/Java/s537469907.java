import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//青いカード
		int N = scanner.nextInt();
		String[] array1 = new String[N];
		for (int i = 0; i < N; i++) {
			array1[i] = scanner.next();
		}

		//赤いカード
		int M = scanner.nextInt();
		String[] array2 = new String[M];
		for (int i = 0; i < M; i++) {
			array2[i] = scanner.next();
		}

		//最大で、差し引き何円貰うことができるか

		/*
		for (String s : array1) {
			System.out.println("青いカード：" + s);
		}
		for (String s : array2) {
			System.out.println("赤いカード：" + s);
		}
		*/

		int max = 0;
		for (int i = 0; i < N; i++) {
			String str = array1[i];
			//System.out.println("array1[" + i + "]：" + array1[i]);
			int count = 0;
			for (int j = 0; j < N; j++) {
				if (array1[j].equals(str)) {
					count++;
				}
			}

			for (int j = 0; j < M; j++) {
				if (array2[j].equals(str)) {
					count--;
				}
			}
			//System.out.println("count：" + count);
			if (max <= count) {
				max = count;
			}
		}
		System.out.println(max);
	}
}