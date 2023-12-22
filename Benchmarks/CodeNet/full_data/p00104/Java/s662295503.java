import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final int max_size = 100;
		final char flag = 1;
		
		char map[][] = new char[max_size][max_size];
		Scanner scanner = new Scanner(System.in);
		int w, h;
		
		h = scanner.nextInt();
		w = scanner.nextInt();
		scanner.nextLine();
		
		while(w != 0 || h != 0) {
			//
			for(int i = 0; i < w; i++) {
				for(int j = 0; j < h; j++) {
					map[j][i] = 0;
				}
			}
			//
			for(int i = 0; i < h; i++) {
				String s = scanner.nextLine();
				map[i] = s.toCharArray();
			}
			//
			int x = 0;
			int y = 0;
			
			while (map[y][x] != flag && map[y][x] != '.') {
				switch (map[y][x]) {
					case '>':
						map[y][x] = flag;
						x++;
						break;
					case 'v':
						map[y][x] = flag;
						y++;
						break;
					case '<':
						map[y][x] = flag;
						x--;
						break;
					case '^':
						map[y][x] = flag;
						y--;
						break;
				}
			}
			
			if (map[y][x] == flag) {
				System.out.println("LOOP");
			} else {
				System.out.println(String.format("%d %d", x, y));
			}
			
			h = scanner.nextInt();
			w = scanner.nextInt();
			scanner.nextLine();
		}
	}
}