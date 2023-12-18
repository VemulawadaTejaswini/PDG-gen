import java.util.Scanner;

public class Main {
	/**
	 * Main method.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int A = s.nextInt();
		int B = s.nextInt();
		
		int count = 0;
		
		for (int i = B; i >= A; i--) {
			int tenThousand = (int)(i / 10000);
			int thousand = (i / 1000) % 10;
			int ten = (i / 10) % 10;
			int one = i % 10;
			
			if (tenThousand == one && thousand == ten) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}