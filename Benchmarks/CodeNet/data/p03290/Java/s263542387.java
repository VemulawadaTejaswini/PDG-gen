import java.util.Scanner;

public class Main {

	static int D;
	static int G;
	static int[] p;
	static int[] c;
	static int problemNumber = 0;
	static int[] solve;
	static int count = 0;
	static int min;
	static int total = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		D = scan.nextInt();
		G = scan.nextInt();

		p = new int[D];
		c = new int[D];
		solve = new int[D];

		for (int input = 0; input < D; input++) {
			p[input] = scan.nextInt();
			c[input] = scan.nextInt();
		}

		min = (int)Math.pow(2, 30);

		over();

		System.out.println(min);

	}

	public static void over() {
		if (problemNumber >= D) {

			for (int k = 0; k < D; k++) {
				count += solve[k];
				total += 100*(k+1)*solve[k];
				if (p[k] == solve[k]) {
					total += c[k];
				}
			}

			if (total >= G && min > count) {
				min = count;
			}

			count = 0;
			total = 0;

		} else {

			for (int i = 0; i <= p[problemNumber]; i++) {
				solve[problemNumber] = i;
				problemNumber++;
				over();
				problemNumber--;
			}

		}
	}
}