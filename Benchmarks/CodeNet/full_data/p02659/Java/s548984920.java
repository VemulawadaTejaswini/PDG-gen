import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			long a = sc.nextLong();
			double b = sc.nextDouble();
			
			System.out.println((long)(a*b));


		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
