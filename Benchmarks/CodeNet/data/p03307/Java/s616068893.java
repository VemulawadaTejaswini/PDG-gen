import java.util.Scanner;

public class MAin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		if(N % 2 == 0) {
			System.out.println(N);
		}else {
			System.out.println(N * 2);
		}
		scan.close();
	}
}