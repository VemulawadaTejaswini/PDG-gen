import java.util.Scanner;
 
public class Main {
	static char[][] field;
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		
		field = new char[h][w];
		
		for(int i = 0; i < h; i++) {
			String s = sc.next();
			for(int j = 0; j < w; j++) {
				field[i][j] = s.charAt(j);
			}
		}
		
		int count = 0;
		
		loop: while(true) {
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w;j++) {
					if(field[i][j] == '#') {
						try {
							if(field[i+1][j] == '.') field[i+1][j] = 't';
						}catch(Exception e) {
							
						}
						try {
							if(field[i-1][j] == '.') 	field[i-1][j] = 't';
						}catch(Exception e) {
							
						}
						try {
							if(field[i][j-1] == '.') 						field[i][j-1] = 't';
						}catch(Exception e) {
							
						}
						try {
							if(field[i][j+1] == '.') field[i][j+1] = 't';
						}catch(Exception e) {
							
						}
						
					}
				}
			}
			
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w;j++) {
					if(field[i][j] == 't') field[i][j] = '#';
				}
			}
			
			if(isallblack()) break loop;
			count++;
			
		}
		System.out.println(count);
				
	}
	
	public static boolean isallblack() {
		for(char[] c : field) {
			for(char ch : c) {
				if(ch != '#') {
					return false;
				}
			}
		}
		return true;
	}
}