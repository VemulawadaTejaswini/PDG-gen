
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt() + sc.nextInt() + sc.nextInt();
		if(a >= 22)
			System.out.println("bust");
		else
			System.out.println("win");
	}

}
