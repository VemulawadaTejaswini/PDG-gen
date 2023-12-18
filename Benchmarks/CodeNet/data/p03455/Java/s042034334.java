import java.util.Scanner;

public class Product {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int surplus = (a * b) %2;

		if(surplus == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
}