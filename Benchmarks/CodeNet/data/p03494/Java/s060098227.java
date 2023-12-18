import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] list = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = in.nextInt();
		}
		int count = 0;
		Boolean flag = true;
		flag = Check(list, flag);
		while (flag) {
			for (int i = 0; i < N; i++) {
				list[i] = list[i] / 2;
			}
			flag = Check(list, flag);
			count++;
		}
		System.out.println(count);
	}

	private static Boolean Check(int[] list, Boolean flag) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] % 2 == 1) {
				flag = false;
			}
		}
		return flag;
	}
}
