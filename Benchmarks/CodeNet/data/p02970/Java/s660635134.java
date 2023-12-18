import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);


		int trees = scan.nextInt();
		int canSee =scan.nextInt()*2+1;

		int needMen =(int)Math.ceil(trees/canSee)+1;


		System.out.println(needMen);

	}
}
