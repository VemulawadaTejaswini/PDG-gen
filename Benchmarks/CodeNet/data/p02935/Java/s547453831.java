import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());

		String[] temp = scanner.nextLine().split(" ");
		int[] list = new int[n];
		double ans = 0;
		for(int i = 0; i < n; i++) {

			list[i] = Integer.parseInt(temp[i]);
		}

		Arrays.sort(list);


		ans = (list[0] + list[1]) / 2.0;


		for(int i = 2; i < n; i++) {

			ans = (ans + list[i]) / 2;

		}



		System.out.println(ans);







	}



}