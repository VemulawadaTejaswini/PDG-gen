import java.util.Scanner;

public class Main {
	private Scanner sc;
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		String nico = sc.nextLine();
		
		int i = nico.length() - 2;

		
		System.out.println("" + nico.charAt(0) + i + nico.charAt(nico.length() - 1));
	}
}