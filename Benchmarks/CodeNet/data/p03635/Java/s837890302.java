import java.util.Scanner;

public class Main {
	private Scanner sc;
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		String[] nico = sc.nextLine().split(" ");

		int m = Integer.parseInt(nico[0]) - 1;
		int n = Integer.parseInt(nico[1]) - 1;
		
		System.out.println(n * m);
	}
}