import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		char[] cha = stdIn.next().toCharArray();
		int max = 0;
		int num = 0;
		for (int i = 0; i < 3; i++) {
			if (cha[i] == 'R') {
				num++;
				max = Math.max(num, max);
			} else {
				num = 0;
			}
		}

		System.out.println(max);

		stdIn.close();
	}
}
