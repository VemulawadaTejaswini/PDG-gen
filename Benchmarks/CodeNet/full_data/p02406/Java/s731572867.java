import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


				int j = sc.nextInt();
				int a;
				int flag = 0;

				for(int i = 1; i <= j; i++) {

					if(i % 3 == 0) {
						System.out.print(" " + i);
					} else {

						a = i;
						while(true) {

							if(a % 10 == 3) {
								flag = 1;
								break;
							}

							if(a < 10) {
								break;
							}
							a = a / 10;

						}

						if(flag == 1) {
							System.out.print(" " + i);
							flag = 0;
						}

					}
				}
				System.out.println();
	}
}