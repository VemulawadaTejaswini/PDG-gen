import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int[][][] array = new int [4][3][10];
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		for(int i = 0; i<number; i++){
			int building = scan.nextInt();
			int floor = scan.nextInt();
			int room_number = scan.nextInt();
			int change = scan.nextInt();

			array[building-1][floor-1][room_number-1] += change;

		}
		for(int j = 0; j<4; j++){
			for(int k = 0; k<3; k++){
				for(int l = 0; l<10; l++){
					System.out.print(" "+array[j][k][l]);
				}
				System.out.println();
			}
			if(j!=3){
				System.out.println("####################");
			}
		}
	}
}
