import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int a = sc.nextInt();
		String line = sc2.nextLine();
		String[] x = line.split(" ");
		int[] y = null;

		for (int i = 0; i < x.length; i++) {
			y[i] = Integer.parseInt(x[i]);

		}

		Arrays.sort(y);
		int z = 0;
		for (int i = 0; i < y.length; i++) {
			z += y[i];
		}

		System.out.println(y[y.length] + " " + y[0] + " " + z);

	}

}

