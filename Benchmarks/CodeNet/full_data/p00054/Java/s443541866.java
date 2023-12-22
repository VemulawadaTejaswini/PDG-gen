import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			
			String[] nico = line.split(" ");

			int a = Integer.parseInt(nico[0]);
			int b = Integer.parseInt(nico[1]);
			int n = Integer.parseInt(nico[2]);
			
			String s = String.valueOf(a / b);
			
			int ans = 0;
			for (int i = 0; i < n; i++) {
				ans = ans + s.charAt(i) - '0';
			}
			System.out.println(ans);
		}
	}
}