import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();

		int canBuy = 0;
		if (X /105 +1 == X / 100){
			canBuy = 1;
		}
		System.out.print(canBuy);
	}
}
