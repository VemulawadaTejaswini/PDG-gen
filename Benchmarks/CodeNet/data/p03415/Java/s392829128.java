import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [][] masu= new String[3][3];
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				masu [i][j] = scan.next();
			}
		}
		System.out.print(masu[1][1]);
		System.out.print(masu[2][2]);
		System.out.print(masu[3][3]);
	}

}
