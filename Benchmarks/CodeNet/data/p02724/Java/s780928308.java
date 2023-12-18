
import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int ans = 0;

		for (int i = 0; i< 1000000000; i++ ) {
			if (X >= 500) {
			X = X - 500;
			ans =ans+ 1000;
			}
		}

		for (int i = 0; i< 1000000000; i++ ) {
			if (X >= 5) {
			X = X - 5;
			ans =ans+ 5;
			}
		}
		System.out.print(ans);
			}

	}






