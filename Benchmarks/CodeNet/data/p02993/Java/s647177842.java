import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pass = sc.next();

		boolean good = true;

		for(int i = 0; i < 3; i++) {
			if(pass.charAt(i)==pass.charAt(i+1)){
				good = false;
			}
		}

		if(good) {
			System.out.println("Good");
		}else {
			System.out.println("Bad");
		}
	}
}