import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	BigDecimal[][] map;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			int lines = Integer.parseInt(sc.nextLine());
			if (lines == 0) break;

			BigDecimal[] x = new BigDecimal[lines];
			BigDecimal[] y = new BigDecimal[lines];
			for (int i = 0; i < lines; i++) {
				String[] nico = sc.nextLine().split(",");
				x[i] = new BigDecimal(nico[0]);
				y[i] = new BigDecimal(nico[1]);
			}
			
			map = new BigDecimal[lines][lines];
			for (int i = 0; i < lines; i++) {
				for (int j = 0; j < lines; j++) {
					map[i][j] = x[i].subtract(x[j]).multiply(x[i].subtract(x[j]))
							.add(y[i].subtract(y[j]).multiply(y[i].subtract(y[j])));
				}
			}
			
			int max = 0;
			for (int i = 0; i < lines; i++) {
				LinkedList<Integer> nodes = new LinkedList<Integer>();
				nodes.push(i);
				
				int tmp = dfs(nodes);
				if (max < tmp) max = tmp;
			}
			System.out.println(max);
		}
	}
	
	private int dfs(LinkedList<Integer> nodes) {
		int max = 0;
		for (int i = (nodes.getFirst() + 1); i < map.length; i++) {
			int j = 0;
			for (j = 0; j < nodes.size(); j++) {
				if (map[nodes.get(j)][i].compareTo(BigDecimal.valueOf(4.0)) > 0.0) break;
			}
			
			int tmp = 0;
			if (j == nodes.size()) {
				nodes.push(i);
				tmp = dfs(nodes);
				nodes.pop();
			}
			if (max < tmp) max = tmp;
		}
		
		return (max + 1);
	}
}