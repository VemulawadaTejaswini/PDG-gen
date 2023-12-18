import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main main = new Main();
		main.exec();

	}

	private void exec() {

		int a;
		String s;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		sc.nextLine();
		s = sc.nextLine();
		if(a >= 3200) {
			System.out.println(s);
		} else {
			System.out.println("red");
		}
		sc.close();

	}

}
