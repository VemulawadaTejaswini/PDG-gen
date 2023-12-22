import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int h = reader.nextInt(), w = reader.nextInt(), targets = reader.nextInt();
		int[][] grid = new int[h][w];
		int[] rowTargets = new int[h], columnTargets = new int[w];
		
		int maxRowTarget = 0, maxColumnTarget = 0;
		ArrayList<Integer> rowMaxes = new ArrayList<Integer>(), columnMaxes = new ArrayList<Integer>();
		for (int i = 0; i < targets; i++) {
			int targetx = reader.nextInt(), targety = reader.nextInt();
			grid[targetx - 1][targety - 1] = 1;
			rowTargets[targetx - 1]++;
			columnTargets[targety - 1]++;
		}
      
      	System.out.println("RUNTIME ERROR");
      
		for (int i = 0; i < rowTargets.length; i++) {
			if (rowTargets[i] > maxRowTarget) {
				rowMaxes.clear();
				rowMaxes.add(i);
				maxRowTarget = rowTargets[i];
			}
			else if (rowTargets[i] == maxRowTarget) {
				rowMaxes.add(i);
			}
		}
		for (int j = 0; j < columnTargets.length; j++) {
			if (columnTargets[j] > maxColumnTarget) {
				columnMaxes.clear();
				columnMaxes.add(j);
				maxColumnTarget = columnTargets[j];
			}
			else if (columnTargets[j] == maxColumnTarget) {
				columnMaxes.add(j);
			}
		}
      
      
      
      
		boolean yeet = false;
		for (int row: rowMaxes) {
			for (int col: columnMaxes) {
				if (grid[row][col] == 0) {
					System.out.println(maxRowTarget + maxColumnTarget);
					yeet = true;
					break;
				}
			}
			if (yeet) {
				break;
			}
		}
		if (!yeet) {
			System.out.println(maxRowTarget + maxColumnTarget - 1);
		}
		
		
		reader.close();
	}
	
}
