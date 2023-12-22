import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 int table[] = {0, 1, 2, 3, 5, 7, 8, 9};
		
		int n = scanner.nextInt();
		while(n != 0) {
			int on = n;
			long num = 0;
			long deg = 1;
			while(on != 0) {
				int r = on % 8;
				num += deg * table[r];
				on -= r;
				on /= 8;
				deg *= 10;
			}
			System.out.println(num);

			n = scanner.nextInt();
		}
	}

}