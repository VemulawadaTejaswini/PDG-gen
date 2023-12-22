import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int max = 1000000;
		int min = -1000000;
		int sum = 0;
		int n;

		Scanner stdIn = new Scanner(System.in);

		n = stdIn.nextInt();

		for (int i = 0, tmp = 0; i < n; i++) {
			tmp = stdIn.nextInt();

			if(max < tmp) {
				max = tmp;
			}
			if(min > tmp) {
				min = tmp;
			}
			sum += tmp;
		}
		System.out.println(min + " " + max + " " + sum);
	}
}