import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		sc.close();

		if(Math.abs(x - a) < Math.abs(x - b)) {
			System.out.println("A");
		}else {
			System.out.println("B");
		}

	}
}