
import java.util.Scanner;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();

		int[][] a = new int[M][2];

		String ans = "あ";

		for (int i = 0; i < M; i++) {
			a[i][0] = scan.nextInt();
			a[i][1] = scan.nextInt();
		}

		for (int i = 0; i < M; i++) {

			if (a[i][0] == 1) {
				for (int j = 0; j < M; j++) {
					if (a[i][1] == a[j][0]) {
						if (a[j][1] == N) {
							ans = "POSSIBLE";
							break;
						} else {
							ans = "INPOSSIBLE";
						}
					}
				}
			}
			if(ans == "POSSIBLE"){
				break;
			}
			
		}
		if(ans == "あ"){
			ans = "INPOSSIBLE";
		}
		System.out.println(ans);
		return;

	}

}