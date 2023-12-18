import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int diff = r - l;
		int min = Integer.MAX_VALUE;
		int index1 = -1;
		for (int i = l; i <= r; i++) {
			if (min > i % 2019) {
				min = i % 2019;
				index1 = i;
			}
		}
		min = Integer.MAX_VALUE;
		int index2 = -1;
		for (int i = l; i <= r; i++) {
			if (min > i % 2019 && i != index1) {
				min = i % 2019;
				index2 = i;
			}
		}
		System.out.println(index1 * index2 % 2019);
	}
}
