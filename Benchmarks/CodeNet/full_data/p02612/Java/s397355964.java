import java.util.Scanner;

public class Test {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int price = sc.nextInt();

		int change = 1000 - (price % 1000);

		System.out.println(change);
	}

}