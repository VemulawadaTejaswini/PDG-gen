import java.util.Scanner;

public class Main {

	void main() {
		try(Scanner sc = new Scanner(System.in)){

			for(;;) {
				int y = sc.nextInt();
				int x = sc.nextInt();
				if(x == 0 && y == 0) break;
				System.out.println(Math.min(x,y) + " " + Math.max(x,y));
			}
		}

	}
	public static void main(String[] args) {
		new Main().main();
	}
}

