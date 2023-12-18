import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int s = sc.nextInt();
		
		if(3 * k < s) {
			System.out.println("");
			System.exit(0);
		}
		
		int r = 0;
		for(int x = 0; x <= k; x++) {
			for(int y = 0; y <= x; y++) {
				for(int z = 0; z <= y; z++) {
					if(x + y + z == s) {
						r++;
						if(x == y && x != z || x == z && x != y || y == z && y != x) {
							r += 2;
						}
					}
				}
			}
		}
		
		
		System.out.println(r);

	}

}
