import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int num = sc.nextInt();

		while(num-- != 0) {
			int[] side =  new int[3];
			for(int count = 0; count < 3; count++) {
				side[count] = (int)Math.pow(sc.nextInt(), 2);
			}

			if(side[0] == side[1] + side[2] || side[1] == side[0] + side[2] || side[2] == side[0] + side[1]) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

}