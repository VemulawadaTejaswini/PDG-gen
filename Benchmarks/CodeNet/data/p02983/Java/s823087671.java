import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		int l = Integer.parseInt(tmp[0]);
		int r = Integer.parseInt(tmp[1]);

		if(l * r < 2019) {

			System.out.println(l * r);

		}else {

			int min = (int) Math.floor(l / 2019);
			int temp = min * 2019;
			min = Math.min(l % 2019, (r - 1) % 2019);
			for(int i = 1; i < r - l - 1; i++) {

				if(min == 0) {
					break;
				}

				min = Math.min(min, (l + i) % 2019);
			}

			System.out.println(min * (min + 1));

		}

	}
}