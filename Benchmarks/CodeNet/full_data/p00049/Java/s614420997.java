import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		int[] g = new int[4];
		for (int i = 0; i < g.length; i++) {
			g[i] = 0;
		}
		
		while (sc.hasNextLine()) {
			String[] nico = sc.nextLine().split(",");
			
			switch (nico[1]) {
			case "A":
				g[0]++;
				break;
			case "B":
				g[1]++;
				break;
			case "AB":
				g[2]++;
				break;
			case "O":
				g[3]++;
				break;
			}
		}
		
		for (int i = 0; i < g.length; i++) {
			System.out.println(g[i]);
		}
	}
}