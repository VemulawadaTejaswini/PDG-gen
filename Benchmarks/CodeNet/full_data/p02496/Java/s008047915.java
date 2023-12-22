import java.util.Scanner;

class Main {
	public static void main(String args[]){
		int card[][] = new int[4][13];
		int n;
		String suit;
		int num;
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 13; j++){
				card[i][j] = 0;
			}
		}
		
		n = scan.nextInt();
		
		for (int i = 0; i < n; i++){
			
			suit = scan.next();
			num = scan.nextInt();
			
			if (suit.equals("S")){
				card[0][num-1] = 1;
			}
			else if (suit.equals("H")){
				card[1][num-1] = 1;
			}
			else if (suit.equals("C")){
				card[2][num-1] = 1;
			}
			else if (suit.equals("D")){
				card[3][num-1] = 1;
			}
		}
		
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 13; j++){
				if (card[i][j] == 0){
					if (i == 0){
						System.out.printf("S %d\n", j + 1);
					}
					else if (i == 1){
						System.out.printf("H %d\n", j + 1);
					}
					else if (i == 2){
						System.out.printf("C %d\n", j + 1);
					}
					else if (i == 3){
						System.out.printf("D %d\n", j + 1);
					}
				}
			}
		}
	}
}