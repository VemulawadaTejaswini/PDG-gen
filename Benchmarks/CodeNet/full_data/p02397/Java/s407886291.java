import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
			
			int small = 0;
			int large = 0;
			
			if ( x < y ) {
				small = x;
				large = y;
			} else {
				small = y;
				large = x;
			}
			
            System.out.println(String.format("%d %d", small, large));
        }

	}
}