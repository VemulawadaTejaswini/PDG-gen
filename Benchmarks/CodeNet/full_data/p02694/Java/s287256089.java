import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 
		Long i = sc.nextLong();
		int money = 100;
		int count = 0;
 
		while (money < i) {
			money = (int) (money * 1.01);
			count++;
		}
 
		System.out.println(count);

	}

}