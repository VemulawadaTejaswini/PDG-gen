import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int hp = scan.nextInt();
		int damage = scan.nextInt();
		
		if (hp % damage == 0) {
			System.out.println(hp / damage);
		} else {
			System.out.println(hp / damage + 1);
		}
	}
}
