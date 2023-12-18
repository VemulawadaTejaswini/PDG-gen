import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int y = Integer.parseInt(scan.next());

		int man = -1;
		int gosen = -1;
		int sen = -1;

		loop: for(int i = 0; i <= n; ++i) {
			for(int j = 0; j<= n; ++j) {
				for(int k = 0; k<= n; ++k) {
					int sumMaisu = i + j + k;
					if(sumMaisu <= 2000 && sumMaisu == n) {
						int sum = 10000 * i + 5000 * j + 1000 * k;
						if(sum == y) {
							man = i;
							gosen = j;
							sen = k;
							break loop;
						}
					}
				}
			}
		}

		System.out.println(man + " " + gosen + " " + sen);

	}

}
