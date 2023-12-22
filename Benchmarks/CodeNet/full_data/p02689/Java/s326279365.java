import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] ten = new int[n];
		int[][] miti = new int[m][2];
		int count_ten = 0;
		boolean sw = false;
		boolean enc = false;

		for(int i = 0;i < n;i++) {
			ten[i] = scan.nextInt();
		}

		for(int i = 0;i < m;i++) {
			for(int j = 0;j < 2;j++) {
				miti[i][j] = scan.nextInt();
			}
		}

		for(int i = 1;i <= n;i++) {
			for(int j = 0;j < m;j++) {
				for(int k = 0;k < 2;k++) {
					if(k == 1) {
						if(miti[j][1] == i) {
							enc = true;

							if(ten[i - 1] > ten[(miti[j][0]) - 1]) {
								sw = true;
							}else {
								sw = false;
							}
						}
					}else {
						if(miti[j][0] == i) {
							enc = true;

							if(ten[i - 1] > ten[(miti[j][1]) - 1]) {
								sw = true;
							}else {
								sw = false;
							}
						}
					}
				}
			}

			if(sw == true) {
				count_ten += 1;
			}

			if(enc == false) {
				count_ten += 1;
			}

			sw = false;
			enc = false;
		}

		System.out.println(count_ten);
	}
}
