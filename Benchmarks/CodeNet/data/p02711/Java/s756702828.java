import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String K = sc.nextLine();

		String[] k = K.split("");
		
		if(k[0].equals("7")) {
			System.out.println("Yes");
			return;
		}
		
		if(k[1].equals("7")) {
			System.out.println("Yes");
			return;
		}
		
		if(k[2].equals("7")) {
			System.out.println("Yes");
			return;
		}
		

		System.out.println("No");
		sc.close();

	}
}