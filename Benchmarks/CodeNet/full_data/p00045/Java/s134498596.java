import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] goods = new int[2];
		int sum = 0;
		int num = 0;
		while(sc.hasNext()) {
			String[] str = sc.next().split(",");
			for(int $ = 0; $ < str.length; $++) {
				goods[$] = Integer.parseInt(str[$]);
			}

			sum += goods[0] * goods[1];
			num += goods[1];
		}
		System.out.println(sum);
		System.out.println(Math.round((double)sum / (double)num));

	}

}