import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numberOfMeals = sc.nextInt();
		
		System.out.println(800 * numberOfMeals - (numberOfMeals / 15) * 200);
	}
}
