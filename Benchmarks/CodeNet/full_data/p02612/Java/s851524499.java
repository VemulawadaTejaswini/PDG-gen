import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int exchange = 1000*((N-1)/1000+1)-N;
		System.out.println(exchange);
	}
}
