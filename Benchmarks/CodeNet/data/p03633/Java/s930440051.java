import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			Long[] t = new Long[n];
			for(int i = 0 ; i < n ; i++) {
				t[i] = sc.nextLong();
			}
			Arrays.sort(t, Comparator.reverseOrder());
			long max = (long)Math.pow(10d, 18d);
			for(long i = 1 ; t[0] * i <= max ; i++) {
				boolean success = true;
				for(int j = 1 ; j < n ; j++) {
					if(t[0] * i % t[j] != 0) {
						success = false;
						break;
					}
				}
				if(success) {
					System.out.println(t[0] * i);
					break;
				}
			}
		}

	}

}
