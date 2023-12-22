import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long amount = 100;
		long res = 0;
		while(amount<X) {
			amount+=amount/100;
			res++;
		}
		System.out.println(res);
	}
}