import java.util.Scanner;
public class Main{
	public static void  main(String[] args){
		Scanner scan = new Scanner(System.in);
		int number  = scan.nextInt();
		int[][] house1 = new int[3][10];
		int[][] house2 = new int[3][10];
		int[][]	house3 = new int[3][10];
		int[][] house4 = new int[3][10];
		for(int k = 0; k<number; k++){
			int building = scan.nextInt();
			int floor = scan.nextInt();
			int room_number = scan.nextInt();
			int change = scan.nextInt();
			if(building==1){
				house1[floor-1][room_number-1] += change;
			}else if(building==2){
				house2[floor-1][room_number-1] += change;
			}else if(building==3){
				house3[floor-1][room_number-1] += change;
			}else if(building==4){
				house4[floor-1][room_number-1] += change;
			}

			for(int i = 0; i<3; i++){
				for(int j= 0; i<10;j++){
					System.out.print(" "+house1[i][j]);
				}
				System.out.println();
			}
			System.out.println("####################");


			for(int i = 0; i<3; i++){
				for(int j= 0; i<10;j++){
					System.out.print(" "+house2[i][j]);
				}
				System.out.println();
			}
			System.out.println("####################");


			for(int i = 0; i<3; i++){
				for(int j= 0; i<10;j++){
					System.out.print(" "+house3[i][j]);
				}
				System.out.println();
			}
			System.out.println("####################");


			for(int i = 0; i<3; i++){
				for(int j= 0; i<10;j++){
					System.out.print(" "+house4[i][j]);
				}
				System.out.println();
			}

		}
	}
}