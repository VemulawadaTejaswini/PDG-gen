import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int x, y, i, j;
		x = scn.nextInt();
		y = scn.nextInt();
		
		for (i = 0; i < x; i++){
			for (j = 0; j < y; j++){
				System.out.print("#");
			}
			System.out.print("\n");
		}
	}
}