import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		int b[] = new int[a];
		int minimum = 0;
		int flower[] = new int[a];
//		populate input
		String readline = sc.nextLine();
		String[] test = readline.split(" ");
		for (int i = 0; i < a; i++) {
			flower[i] = 0;
			b[i] = Integer.parseInt(test[i]);
		}
		boolean flag = true;
		while (flag) {
			int i = 0;
			int j = 0;
			while (j < a)
				if (flower[i + j] < b[i + j]) {// if less
					flower[i + j] += 1;// +1 here
					j = j + 1;// increase j
					if (j == a)
						minimum += 1;
				} else if (flower[i + j] == b[i + j]) {

					if (j + 1 == a) {
						if(Arrays.equals(flower, b)) {
							minimum += 1;
							flag=false;
						}
						break;
					}
					j = j + 1;// increase j

				} else {
					flag = false;
					break;
				}

		}
		System.out.print(minimum);
	}
}
