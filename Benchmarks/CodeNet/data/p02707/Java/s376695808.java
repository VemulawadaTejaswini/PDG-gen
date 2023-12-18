import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n 	     = Integer.parseInt(scanner.nextLine());
		String[] tmp = scanner.nextLine().split(" ");
		int[] list   = new int[n];
		int[] ans   = new int[n];
		Arrays.fill(ans, 0);
		int cha = 0;
		int cou = 1;


		list[0] = Integer.parseInt(tmp[0]);

		for(int j = 1; j < n - 1; j++) {

			list[j] = Integer.parseInt(tmp[j]);

			if(list[j] != list[j - 1]) {

				ans[cha] += cou;
				cha++;
				cou = 0;

			}
			cou++;

			if(j == n - 2) {

				ans[cha] += cou;

			}


		}

		for(int a : ans) {

			System.out.println(a);

		}



	}
}