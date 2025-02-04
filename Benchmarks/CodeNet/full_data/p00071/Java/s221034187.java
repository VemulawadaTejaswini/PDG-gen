import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private Scanner sc;

	int[][] map;
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		int sets = Integer.parseInt(sc.nextLine());
		
		for (int index = 0; index < sets; index++) {
			sc.nextLine();
			
			map = new int[8][8];
			for (int i = 0; i < map.length; i++) {
				String line = sc.nextLine();
				for (int j = 0; j < map.length; j++) {
					map[j][i] = line.charAt(j) - '0';
				}
			}
			
			LinkedList<Integer[]> boms = new LinkedList<Integer[]>();
			Integer[] xy = new Integer[2];
			xy[0] = Integer.parseInt(sc.nextLine()) - 1;
			xy[1] = Integer.parseInt(sc.nextLine()) - 1;
			if (map[xy[0]][xy[1]] == 1) {
				map[xy[0]][xy[1]] = 0;
				boms.add(xy);
			}
			
			while (boms.isEmpty() == false) {
				xy = boms.pop();
				
				int tx = xy[0];
				int ty = xy[1];
				
				
				for (int i = -3; i < 4; i++) {
					if ((tx + i) < 0) continue;
					if ((tx + i) > 7) break;
					
					if (map[tx + i][ty] == 1) {
						map[tx + i][ty] = 0;
						xy[0] = tx + i;
						xy[1] = ty;
						boms.add(xy);
					}
				}

				for (int i = -3; i < 4; i++) {
					if ((ty + i) < 0) continue;
					if ((ty + i) > 7) break;	
					
					if (map[tx][ty + i] == 1) {
						map[tx][ty + i] = 0;
						xy[0] = tx;
						xy[1] = ty + i;
						boms.add(xy);
					}
				}
			}
			
			System.out.println("Data " + (index + 1) + ":");
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					System.out.print(map[j][i]);
				}
				System.out.println();
			}
		}
	}
}