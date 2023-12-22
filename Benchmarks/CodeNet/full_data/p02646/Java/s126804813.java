import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp1 = scanner.nextLine().split(" ");
		String[] tmp2 = scanner.nextLine().split(" ");

		int A = Integer.parseInt(tmp1[0]);
		int a = Integer.parseInt(tmp1[1]);
		int B = Integer.parseInt(tmp2[0]);
		int b = Integer.parseInt(tmp2[1]);
		int t = Integer.parseInt(scanner.nextLine());

		int range = Math.abs(A - B);

		int diff  = a - b;


		double time = 0;

		if(diff != 0) {
			time = range / diff;

		}

		if(range == 0) {
			System.out.println("YES");
		}else if(diff <= 0) {
			System.out.println("NO");
		}else if(time > t) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}


	}

}
