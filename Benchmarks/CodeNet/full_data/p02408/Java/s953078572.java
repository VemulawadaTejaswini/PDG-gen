import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();

		int cards[][] = new int[4][13];
		int m = 0;
		int n = 0;
		char l = 'a';

		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 13; j++){
				cards[i][j] = 0;
			}
		}

		for(int k = 0; k < number * 2; k++){
			m = scan.nextInt();
			n = scan.nextInt();
			cards[m][n] = 1;
		}

		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 13; j++){
				if(cards[i][j] == 0){
					if(i == 0){
						l = 'S';
					}else if(i == 1){
						l = 'H';
					}else if(i == 2){
						l = 'C';
					}else if(i == 3){
						l = 'D';
					}
				}
				System.out.println(l + " " + j);
			}
		}
	}
}