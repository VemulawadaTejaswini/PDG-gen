import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		int[][] table = new int[2][1000];
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[0].length; j++) {
				table[i][j] = 0;
			}
		}

		int index = 0;
		while (sc.hasNextLine() == true) {
			String line = sc.nextLine();
			
			if (line.equals("")) {
				index++;
				continue;
			}
			
			String[] nico = line.split(",");
			table[index][Integer.parseInt(nico[0]) - 1]++;
		}
		
		for (int i = 0; i < table[0].length; i++) {
			int num = 0;
			boolean flag = true;
			
			for (int j = 0; j < table.length; j++) {
				if (table[j][i] > 0) num = num + table[j][i];
				else flag = false;
			}
			
			if (flag == true) {
				System.out.println((i + 1) + "," + num);
			}
		}
	}
}