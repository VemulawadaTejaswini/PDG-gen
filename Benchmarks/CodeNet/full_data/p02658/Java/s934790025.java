import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
      	Long a = sc.nextLong();
		double b = sc.nextDouble();
      	Long ans = (long)(a*b);
      	
		sc.close();

		System.out.println(ans);
	}
}