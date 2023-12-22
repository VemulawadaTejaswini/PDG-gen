import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		int value = 0;
		int num = 0;
		int lines = 0;
		while (sc.hasNextLine()) {
			String[] nico = sc.nextLine().split(",");

			int v = Integer.parseInt(nico[0]);
			int n = Integer.parseInt(nico[1]);
			value = value + v * n;
			num = num + n;
			lines++;
		}

		System.out.println(value);
		System.out.println(Math.round((double)num / lines));
	}
}