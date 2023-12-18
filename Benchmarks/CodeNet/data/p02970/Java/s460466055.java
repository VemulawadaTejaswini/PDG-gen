import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);


		int trees = scan1.nextInt();
		int canSee =scan2.nextInt()*2+1;

		int needMen =(int)Math.ceil(trees/canSee);


		System.out.println(needMen);

	}



}
