import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n 		    = Integer.parseInt(scanner.nextLine());
		String[] temp   = scanner.nextLine().split(" ");
		int tmp         = 0;
		int count       = 0;
		int min         = Integer.parseInt(temp[0]);
		for(int i = 1; i < n ; i++) {

			tmp = Integer.parseInt(temp[i]);

			if(tmp == Math.min(min, tmp)) {

				count++;
				min = tmp;

			}		}

			System.out.println(count + 1);
	}
}