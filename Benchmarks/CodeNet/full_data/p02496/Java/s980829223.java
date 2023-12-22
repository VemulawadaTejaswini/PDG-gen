import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int cards[][] = new int[4][13];
		//Initialize array
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String suit = sc.next();
			int num = sc.nextInt();
			if(suit.equals("S")) {
				cards[0][num - 1] = 1; 
			} else if(suit.equals("H")) {
				cards[1][num - 1] = 1;
			} else if(suit.equals("C")) {
				cards[2][num - 1] = 1;
			} else if(suit.equals("D")) {
				cards[3][num - 1] = 1;
			}
		}
		
		//Output Data
		for(int s = 0; s < 4; s++) {
			for(n = 0; n < 13; n++) {
				if(cards[s][n] == 0) {
					switch(s) {
					case 0:
						System.out.println("S " + (n + 1));
						break;
					case 1:
						System.out.println("H " + (n + 1));
						break;
					case 2:
						System.out.println("C " + (n + 1));
						break;
					case 3:
						System.out.println("D " + (n + 1));
					}
				}
			}
		}
	}
}