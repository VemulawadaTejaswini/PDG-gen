import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");

		int bio = Integer.parseInt(tmp[0]);
		int leg = Integer.parseInt(tmp[1]);

		double diff = leg - (2.0 * bio);
		double Knum = diff / 2.0;
		double Tnum = bio - Knum;

		int bioSum = (int) (Knum + Tnum);
		int legSum = (int) (Knum * 4 + Tnum * 2);

		if(Knum < 0 || Tnum < 0) {

			System.out.println("No");

		}else if(leg % 2 != 0) {

			System.out.println("No");

		}else if(bioSum == bio && legSum == leg) {

			System.out.println("Yes");

		}else {

			System.out.println("No");

		}


	}

}