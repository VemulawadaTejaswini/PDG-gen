import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		final int floor_num = 3;
		final int room_num = 10;
		int[][] building_1 = new int[floor_num][room_num];
		int[][] building_2 = new int[floor_num][room_num];
		int[][] building_3 = new int[floor_num][room_num];
		int[][] building_4 = new int[floor_num][room_num];

		for(int i = 0; i < floor_num; i++){
			for(int j = 0; j < room_num; j++){
				building_1[i][j] = 0;
				building_2[i][j] = 0;
				building_3[i][j] = 0;
				building_4[i][j] = 0;
			}
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input_num = Integer.parseInt(br.readLine());

		for(int i = 0; i < input_num; i++){

			String[] token = br.readLine().split(" ");
			int select_building = Integer.parseInt(token[0]);
			int select_floor = Integer.parseInt(token[1]);
			int select_room = Integer.parseInt(token[2]);
			int resident = Integer.parseInt(token[3]);

			switch(select_building){
				case 1:
					building_1[select_floor - 1][select_room - 1] += resident;
					break;
				case 2:
					building_2[select_floor - 1][select_room - 1] += resident;
					break;
				case 3:
					building_3[select_floor - 1][select_room - 1] += resident;
					break;
				case 4:
					building_4[select_floor - 1][select_room - 1] += resident;
					break;
			}

		}

		output(building_1, floor_num, room_num);
		separate();
		output(building_2, floor_num, room_num);
		separate();
		output(building_3, floor_num, room_num);
		separate();
		output(building_4, floor_num, room_num);

	}

	public static void output(int[][] building, int floor_num, int room_num){

		for(int i = 0; i < floor_num; i++){
			for(int j = 0; j < room_num; j++){

				System.out.print(" " + building[i][j]);

			}
			System.out.print("\n");
		}

	}

	public static void separate(){

		for(int i = 0; i < 20; i++){
			System.out.print("#");
		}

		System.out.print("\n");

	}
}