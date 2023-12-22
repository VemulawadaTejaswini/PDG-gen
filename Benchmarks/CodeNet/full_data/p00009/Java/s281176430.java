import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while ((scan.hasNext())) {
			int numberOfprimes = 0;
			int n = Integer.parseInt(scan.next());

			if (n >= 2) {
				numberOfprimes++;
			}

			if (n >= 3) {
				numberOfprimes++;
			}

			if (n >= 5) {
				for (int i = 5; i <= n; i += 2) {
					for(int j = 2; j<=i;j++){
						if ((i % j) == 0 && i != j) {
							break;
						}else if((i % j) == 0 && i == j){
							numberOfprimes++;
						}
					}

				}
			}

			System.out.println(numberOfprimes);
		}
	}
}