import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String arare[] = new String[N];
		boolean answer = false;
		for (int i = 0; i < N; i++) {
			arare[i] = sc.next();
		}
		for (int i = 0; i < N; i++) {
			if (arare[i].equals("Y")) {
				answer = true;
			}
		}
		if (answer == true) {
			System.out.println("Four");
		} else {
			System.out.println("Three");
		}
	}

}