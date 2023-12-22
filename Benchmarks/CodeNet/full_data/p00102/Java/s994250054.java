import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		int lines = Integer.parseInt(sc.nextLine());
		while (lines != 0) {
			int[][] table = new int[lines + 1][lines + 1];
			for (int i = 0; i < lines; i++) {
				String line = sc.nextLine();
				String[] data = line.split(" ");
				
				for (int j = 0; j < lines; j++) {
					table[i][j] = Integer.parseInt(data[j]);
					table[i][lines] = table[i][lines] + table[i][j];
					table[lines][j] = table[lines][j] + table[i][j];
					
					spprint(table[i][j]);
				}
				table[lines][lines] = table[lines][lines] + table[i][lines];
				spprint(table[i][lines]);
				System.out.println();
			}
			
			for (int j = 0; j < lines; j++) {
				spprint(table[lines][j]);
			}
			spprint(table[lines][lines]);
			System.out.println();
			
			lines = Integer.parseInt(sc.nextLine());
		}
	}
	
	public void spprint(int num) {
		int width = String.valueOf(num).length();
		for (int i = 0; i < (5 - width); i++) {
			System.out.print(" ");
		}
		System.out.print(num);
	}
}