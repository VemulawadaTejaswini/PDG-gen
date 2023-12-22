
import java.io.*;
import java.util.Arrays;

public class Main {

	//@2000 óÎñû
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for(;;) {
			
			int[][] map = new int[21][21];
			
			// óÎ
			int gn = Integer.parseInt(reader.readLine());
			if (gn == 0)
				break;
			for(int i = 0; i < gn; i++) {
				String s = reader.readLine();
				String[] sp = s.split(" ");
				int x = Integer.parseInt(sp[0]);
				int y = Integer.parseInt(sp[1]);
				map[x][y] = 1;
				
			}
	
			// Ú®
			int n = Integer.parseInt(reader.readLine());

			int x = 10;
			int y = 10;
			if (map[x][y] != 0) {
				// óÎæ¾
				gn--;
				map[x][y] = 0;
			}
			
			for(int loop = 0; loop < n; loop++) {
				
				String s = reader.readLine();
				String[] sp = s.split(" ");
				
				int step = Integer.parseInt(sp[1]);
				for(int k = 0; k < step; k++) {
					if (sp[0].equals("N"))
						y++;
					else if (sp[0].equals("S"))
						y--;
					else if (sp[0].equals("E"))
						x++;
					else if (sp[0].equals("W"))
						x--;
					else assert false;
					
					if (map[x][y] != 0) {
						// óÎæ¾
						gn--;
						map[x][y] = 0;
					}

				}
			}
			if (gn == 0) {
				System.out.printf("Yes\n");
			}
			else {
				System.out.printf("No\n");
			}
		}
	}
}