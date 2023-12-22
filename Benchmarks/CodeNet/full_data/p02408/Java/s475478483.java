import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int n, x;
		String c;
		boolean data[][] = new boolean[4][13];
		
		n = stdIn.nextInt();
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; j++) {
				data[i][j] = false;
			}
		}
		
		for( int i = 1; i <= n; i++) {
			c = stdIn.next();
			x = stdIn.nextInt();
			
			switch(c) {
			case "S":
				data[0][x - 1] = true;
				break;
			case "H":
				data[1][x - 1] = true;
				break;
			case "C":
				data[2][x - 1] = true;
				break;
			case "D":
				data[3][x - 1] = true;
				break;
			default:
				break;
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 1; j <= 13; j ++) {
				switch(i) {
				case 0:
					if(data[i][j - 1] == false) {
						System.out.println("S　" + j);
					}
					break;
				case 1:
					if(data[i][j - 1] == false) {
						System.out.println("H　" + j);
					}
					break;
				case 2:
					if(data[i][j - 1] == false) {
						System.out.println("C　" + j);
					}
					break;
				case 3:
					if(data[i][j - 1] == false) {
						System.out.println("D　" + j);
						
					}
					break;
				default:
					break;
				}
			}
			
		}
		
	}
}
