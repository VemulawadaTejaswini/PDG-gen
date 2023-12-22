import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ints = new int[2];
		String[] mark = new String[] {"#", "."};

		do {
			for(int i = 0; i < 2; i++) {
				ints[i] = sc.nextInt();
			}

			if (ints[0] == 0 && ints[1] == 0) {
				break;
			}

			for (int i = 0; i < ints[0]; i++) {
				for (int j = 0; j < ints[1]; j++) {
					if (i % 2 == 0) {
						System.out.print( mark[j % 2] );
					}else {
						System.out.print( mark[(j+1) % 2] );
					}
				}
				System.out.println();
			}

			System.out.println();

		}while(true);

		sc.close();

	}

}
