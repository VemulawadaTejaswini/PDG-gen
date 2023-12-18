import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long deposit = 100;
		long result = 0;
		while(x > deposit) {
			deposit*=1.01;
			result++;
		}
		System.out.println(result);

	}

}
