import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int[] a = new int[N];
		String remain = "01234567";
		int over = 0;
		for (int i = 0; i < N; i++) {
			a[i] = reader.nextInt();
			int num = a[i]/400;
			if (a[i] < 3200) {
				remain = remain.replace(Integer.toString(num), "");
			} else {
				over++;
			}
		}
		int min = 8 - remain.length();
		int max = min + Math.min(over, remain.length());
		if (min < 1) {
			min = Math.min(1, max);
		}

		reader.close();
		System.out.print(min + " " + max);
	}
}

