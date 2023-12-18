import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextInt();
		long b = sc.nextInt();
		long x = sc.nextInt();

		int count = 0;
		for (long i = a; i <= b; i++) {
			long result = i % x;
			if(result == 0){
				count++;
			}
		}
		System.out.println(count);
	}
}
