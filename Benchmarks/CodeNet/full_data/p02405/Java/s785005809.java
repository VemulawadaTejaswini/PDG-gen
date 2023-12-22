import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][]hw = new int[10000][2];

		int h = 1;
		int w = 1;

		//何セット分入力したか
		int count = 0;

		for (int i = 0; h != 0 || w != 0; i++) {

			String line = sc.nextLine();
			String[]HW = line.split(" ");
			h = Integer.parseInt(HW[0]);
			w = Integer.parseInt(HW[1]);

			hw[i][0] = h;
			hw[i][1] = w;

			count++;
		}



		//これで高さと横をint型で出せるようになった
		for (int i = 0; i < count-1 ; i++) {


			StringBuilder x = new StringBuilder();

			for (int j = 0; j < hw[i][1]; j++) {

				if (j == 0 || j%2 == 0 ) {
					x.append("#");
				} else {
					x.append(".");
				}

			}

			String z = x.toString();


			StringBuilder a = new StringBuilder();

			for (int j = 0; j < hw[i][1]; j++) {

				if (j == 0 || j%2 == 0 ) {
					a.append(".");
				} else {
					a.append("#");
				}

			}

			String b = a.toString();

			for (int j = 0; j < hw[i][0]; j++) {
				if (j == 0 || j%2 == 0) {
					System.out.println(z);
				} else {
					System.out.println(b);
				}
			}



			System.out.println("");
		}


	}

}

