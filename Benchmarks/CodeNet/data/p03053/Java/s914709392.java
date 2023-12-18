import java.util.Scanner;

public class Main {
	static char[][] field;
	static int[][] not;
	static int h;
	static int w;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		h = Integer.parseInt(sc.next());
		w = Integer.parseInt(sc.next());

		field = new char[h][w];

		for(int i = 0; i < h; i++) {
			String s = sc.next();
			for(int j = 0; j < w; j++) {
				field[i][j] = s.charAt(j);
			}
		}
		not = new int[h][w];
		
		int count = 0;
		
		while(true) {
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(field[i][j] == '#') {
						
						try {
							if(field[i+1][j] == '.') field[i+1][j] = 't';
						}catch(Exception e) {
						}
						try {
							if(field[i-1][j] == '.')field[i-1][j] = 't';
						}catch(Exception e) {
						}
						try {
							if(field[i][j+1] == '.')field[i][j+1] = 't';
						}catch(Exception e) {
						}
						
						try {
							if(field[i][j-1] == '.')field[i][j-1] = 't';
						}catch(Exception e) {
						}
					}
				}
			}
			
			for(int i =0 ; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(field[i][j] == 't') field[i][j] = '#';
				}
			}
			
			if(is()) break;
			
			count++;
		}
System.out.println(count);
	}
	private static boolean is() {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(field[i][j] != '#') {
					return false;
				}
			}
		}
		return true;
	}
}