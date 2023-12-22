import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean[] table = new boolean[300000];

		for (int i = 2; i < 300000; i++) {
			table[i] = true;
		}
		table[0] = false;
		table[1] = false;
		for (int i = 2; i < 300000; i++) {
			if(table[i]){
				for(int j = i+i;j<300000;j+=i)table[j]=false;
			}
		}

		while (true) {
			int n;
			int n2 = 0;

			int ncou = 0;
			int n2cou = 0;
			int sum = 0;

			// boolean flag = true;

			n = scan.nextInt();
			if (n == 0) {
				break;
			}

			n2 = n * 2;

			for (int i = 2; i < n + 1; i++) {
				if (table[i])
					ncou++;
			}

			for (int i = 2; i < n2 + 1; i++) {
				if (table[i])
					n2cou++;
			}

			// for (int i = 2; i < n + 1; i++) {
			// for (int j = 2; j < (i / 2 + 1); j++) {
			// if (i % j == 0)
			// flag = false;
			//
			// }
			// if (flag)
			// ncou++;
			// flag = true;
			//
			// }
			//
			// for (int i = 2; i < n2 + 1; i++) {
			// for (int j = 2; j < (i / 2 + 1); j++) {
			// if (i % j == 0)
			// flag = false;
			//
			// }
			// if (flag)
			// n2cou++;
			// flag = true;
			// }

			sum = n2cou - ncou;

			System.out.println(sum);
		}
		scan.close();
	}

}