import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//n x
		String[] temp = scanner.nextLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int x = Integer.parseInt(temp[1]);

		//list 差を求める
		String[] temp2 = scanner.nextLine().split(" ");

		int ans = Math.abs(Integer.parseInt(temp2[0]) - x);
		int ne  = 0;
		int temp3 = 0;

		for(int i = 1; i < n; i++) {

			ne = Math.abs(Integer.parseInt(temp2[i]) - x);

			if(ans > temp3) {
				ne = ans;
				ans = temp3;
				ne = 0;
			}

			while((ne = temp3 % ans) != 0) {

				ans = temp3;
				temp3 = ne;
			}
			ne = 0;
		}
		System.out.println(ans);
	}
}
