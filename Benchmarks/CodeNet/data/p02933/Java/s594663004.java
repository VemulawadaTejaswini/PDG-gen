import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		String T = sc.next();
		if (a>=3200) {
			System.out.println(T);
		} else {
			System.out.println("red");
		}
	}

}