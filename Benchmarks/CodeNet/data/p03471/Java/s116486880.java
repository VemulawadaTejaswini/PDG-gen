import java.util.Scanner;

public class Otoshidama {

	public static void Main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int y = Integer.parseInt(scan.next());

		int man = -1;
		int gosen = -1;
		int sen = -1;

		loop: for(int i = 0; i <= 2000; ++i) {
			for(int j = 0; j<= 2000; ++j) {
				for(int k = 0; k<= 2000; ++k) {
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
