import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		sc.close();
		
		long ans = 0;
		int xpos = 0;
		int ypos = x;
		int vector = 0;
		int[][] t = new int[n+1][n+1];
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= n; j++) {
				t[i][j] = -1;
			}
		}
		for(int i = 0; i <= n; i++) {
			t[0][i] = 2;
			t[i][n] = 0;
			t[i][i] = 1;
		}
		
		do {
			ans++;
			switch(vector) {
			case 0:
				xpos++;
				break;
			case 1:
				xpos++;
				ypos++;
				break;
			case 2:
				ypos++;
				break;
			case 3:
				xpos--;
				break;
			case 4:
				xpos--;
				ypos--;
				break;
			case 5:
				ypos--;
				break;
			}
			if(t[xpos][ypos] == -1) {
				t[xpos][ypos] = vector%3;
			} else {
				switch(t[xpos][ypos]) {
				case 0:
					switch(vector) {
					case 1:
						vector = 5;
						break;
					case 2:
						vector = 4;
						break;
					case 4:
						vector = 2;
						break;
					case 5:
						vector = 1;
						break;
					}
					break;
				case 1:
					switch(vector) {
					case 0:
						vector = 2;
						break;
					case 2:
						vector = 0;
						break;
					case 3:
						vector = 5;
						break;
					case 5:
						vector = 3;
						break;
					}
					break;
				case 2:
					switch(vector) {
					case 0:
						vector = 4;
						break;
					case 1:
						vector = 3;
						break;
					case 3:
						vector = 1;
						break;
					case 4:
						vector = 0;
						break;
					}
					break;
				}
			}
		} while(!(xpos == 0 && ypos == x));
		
		System.out.println(ans);
	}
	
}