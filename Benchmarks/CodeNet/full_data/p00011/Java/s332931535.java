import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[] x = new int[w];
		String empty = sc.nextLine();

		for (int i = 0; i < x.length; i++) {
			x[i] = i + 1;
		}

		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			String ints[] = str.split(",", 0);
			int a = Integer.parseInt(ints[0]) - 1;
			int b = Integer.parseInt(ints[1]) - 1;
			Swap(a, b, x);
		}
		for (int i = 0; i < x.length; i++) {
			System.out.printf("%d\n", x[i]);
		}
	}

	private static void Swap(int a, int b, int[] x) {
		// TODO Auto-generated method stub
		int tmp = 0;
		tmp = x[a];
		x[a] = x[b];
		x[b] = tmp;
	}

}