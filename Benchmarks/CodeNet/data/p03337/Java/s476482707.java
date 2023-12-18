import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//
		int a = sc.nextInt();
		int b = sc.nextInt();

		int [] haco = {(a)+(b), (a)-(b), (a)*(b)};

		int max = 0;

		if(haco[0] > haco[1]) {
			max = haco[0];
		}else {
			max = haco[1];
		}

		if(max < haco[2]) {
			max = haco[2];
		}

		System.out.println(max);
	}
}