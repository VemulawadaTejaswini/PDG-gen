import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[][][] data = new int[4][3][10];

		for(int i = 0; i < n; i++) {
			int b = scan.nextInt() - 1;
			int f = scan.nextInt() - 1;
			int r = scan.nextInt() - 1;
			int v = scan.nextInt();

			try {
				if(data[b][f][r] < 0 || 9 < data[b][f][r]) {
					throw new Exception();
				}
				data[b][f][r] += v;
			}
			catch(Exception e) {

			}
		}

		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 10; k++) {
					System.out.printf(" %d", data[i][j][k]);
				}
				System.out.println();
			}
			if(i != 3) {
				System.out.println("####################");
			}
		}

		scan.close();
	}
}
