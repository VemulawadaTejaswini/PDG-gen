import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 情報の数を取得
		Scanner sc = new Scanner(System.in);
		int information = sc.nextInt();

		// informationの中身
		// building = 棟
		int building = 0;
		// floor = 階
		int floor = 0;
		// room = 番
		int room = 0;
		// visitor = 人数
		int visitor = 0;

		// 部屋をつくる
		int[][][] resident = new int[][][] {
			{
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
			},
			{
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
			},
			{
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
			},
			{
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
			}
			};

		// 入力した情報から各部屋にv人を入れる
		for (int cnt = 1; cnt <= information; cnt++) {
			building = (sc.nextInt()-1);
			floor = (sc.nextInt()-1);
			room = (sc.nextInt()-1);
			visitor = sc.nextInt();
			resident[building][floor][room] = resident[building][floor][room] + visitor;
		}

		//入居者数を出力
		for (building = 0; building < 4; ++building) {
			for (floor = 0; floor < 3; ++floor) {
				for (room = 0; room < 10; ++room) {
					//1棟目
					if(building == 0){
					System.out.print(" " + resident[building][floor][room]);
					}

					//2棟目
					if(building == 1){
					System.out.print(" " + resident[building][floor][room]);
					}

					//3棟目
					if(building == 2){
					System.out.print(" " + resident[building][floor][room]);
					}

					//4棟目
					if(building == 3){
					System.out.print(" " + resident[building][floor][room]);
					}
				}System.out.println("");
			}
			if(building != 3){
			System.out.println("####################");
			}
		}
	}
}

