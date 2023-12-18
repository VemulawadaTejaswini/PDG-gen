import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int min = scan.nextInt();
		int max = scan.nextInt();
		int k = scan.nextInt();
		int num = 0;
		int minnum = 0;
		int flg = 0;

		for (int i=0; i<k; i++) {
			minnum = min + i;
			System.out.println(minnum);
			if (max <= minnum) {
				flg = 1;
				break;
			}
		}

		if (flg == 0) {

			num = max - k +1;

			for (int j=0; j<k; j++) {
				if (num != minnum) {
					System.out.println(num);
				}
				num += 1;
			}

		}
		scan.close();

	}

}
