import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private Scanner sc;

	int nico;
	
	int[][] map;
	
	int[][][] pat = {
			{{0, -1, 0, 1, 0},
			{0, 1, 1, 1, 2}},
			{{0, 1, 2, 0, 1, 2, 0, 1, 2},
			{0, 0, 0, 1, 1, 1, 2, 2, 2}},
			{{0, -1, 0, 1, -2, -1, 0, 1, 2, -1, 0, 1, 0},
			{0, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4}}
	};
	
	
	LinkedList<String> ans;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		nico = Integer.parseInt(sc.nextLine());
		
		map = new int[10][10];
		for (int i = 0; i < map.length; i++) {
			String[] data = sc.nextLine().split(" ");
			
			for (int j = 0; j < map.length; j++) {
				map[j][i] = Integer.parseInt(data[j]);
			}
		}
		
		ans = new LinkedList<String>();
		for (int i = 0; i < pat.length; i++) {
			check(0, 0, i);
		}
		
		while (ans.isEmpty() == false) {
			System.out.println(ans.pop());
		}
	}
	
	private boolean check(int x, int y, int p) {
		while (map[x][y] == 0) {
			x++;
			if (x == map.length) {
				x = 0;
				y++;
			}
			if (y == map.length) {
				boolean flag = true;
				for (int i = 0; i < map.length; i++) {
					for (int j = 0; j < map.length; j++) {
						if (map[i][j] != 0) {
							flag = false;
							break;
						}
					}
					if (flag == false) break;
				}
				if (ans.size() != nico) flag = false;
				
				return flag;
			}
		}
		
		for (int i = 0; i < pat[p][0].length; i++) {
			int nx = x + pat[p][0][i];
			int ny = y + pat[p][1][i];
			
			if ((nx < 0) || (nx >= map.length) || (ny < 0) || (ny >= map.length)) return false;
			if (map[nx][ny] == 0) return false;
		}
		
		String r = "";
		switch (p) {
		case 0:
			r = r + x + " " + (y + 1) + " " + 1;
			break;
		case 1:
			r = r + (x + 1) + " " + (y + 1) + " " + 2;
			break;
		case 2:
			r = r + x + " " + (y + 2) + " " + 3;
			break;
		}
		ans.push(r);
		
		for (int i = 0; i < pat[p][0].length; i++) {
			map[x + pat[p][0][i]][y + pat[p][1][i]]--;
		}
		
		boolean end = false;
		for (int i = 0; i < pat.length; i++) {
			end = end | check(x, y, i);
		}
		
		if (end == false) {
			for (int i = 0; i < pat[p][0].length; i++) {
				map[x + pat[p][0][i]][y + pat[p][1][i]]++;
			}
			ans.pop();
		}
		
		return end;
	}
}