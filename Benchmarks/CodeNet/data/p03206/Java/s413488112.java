import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		sc.close();
		if(S == 25) {
			System.out.println("Christmas");
		}else if(S == 24) {
			System.out.println("Christmas Eve");
		}else if(S == 23) {
			System.out.println("Christmas Eve Eve");
		}else {
			System.out.println("Christmas Eve Eve Eve");
		}
	}

}