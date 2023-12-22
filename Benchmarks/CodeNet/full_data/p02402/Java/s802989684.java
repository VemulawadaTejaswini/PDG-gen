import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String d = sc.nextLine();
		int a = Integer.parseInt(d);
		
		Scanner sc2 = new Scanner(System.in);
		
		String line = sc2.nextLine();
		String[] x = line.split(" ");
		int[] y = new int [a];

		for (int i = 0; i < a; i++) {
			y[i] = Integer.parseInt(x[i]);

		}

		Arrays.sort(y);
		int z = 0;
		for (int i = 0; i < y.length; i++) {
			z += y[i];
		}

		System.out.println(y[0] + " " + y[y.length-1] + " " + z);

	}

}

