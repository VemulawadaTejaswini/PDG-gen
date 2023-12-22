import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int[] num = new int[w];
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			String[] ab = str.split(",");
			int a = Integer.parseInt(ab[0]) - 1;
			int b = Integer.parseInt(ab[1]) - 1;
			int c = 0;
			c = num[a];
			num[a] = num[b];
			num[b] = c;
		 }
		for (int i = 0; i < w; i++) {
			System.out.println(num[i]);
		}

	}

}