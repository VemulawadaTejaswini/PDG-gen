
import java.util.Scanner;

public class MainA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(c-b==b-a) System.out.println("YES");
		else System.out.println("NO");

	}

}
