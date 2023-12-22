import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public class Dice {

		int[] diceInit = new int[6];
		int[] dice = new int[6];

		/**
		 * サイコロを用意する
		 * @param nums
		 */
		public Dice(int[] nums) {
			dice = nums;
			diceInit = nums;
		}

		/**
		 * サイコロの状態を確認
		 */
		public int[] checkSurface() {
			return dice;
		}


		/**
		 * 入力された方向に移動
		 * @param order
		 */
		public void move(String order) {

			for(Character s : order.toCharArray()) {
				int buf;
				switch(s){
				case 'N':{
					buf = dice[0];
					dice[0] = dice[1];
					dice[1] = dice[5];
					dice[5] = dice[4];
					dice[4] = buf;
					break;
				}
				case 'E':{
					buf = dice[0];
					dice[0] = dice[3];
					dice[3] = dice[5];
					dice[5] = dice[2];
					dice[2] = buf;
					break;
				}
				case 'W':{
					buf = dice[0];
					dice[0] = dice[2];
					dice[2] = dice[5];
					dice[5] = dice[3];
					dice[3] = buf;
					break;
				}
				case 'S':{
					buf = dice[0];
					dice[0] = dice[4];
					dice[4] = dice[5];
					dice[5] = dice[1];
					dice[1] = buf;
					break;
				}
				case 'R': {
					buf = dice[1];
					dice[1] = dice[2];
					dice[2] = dice[4];
					dice[4] = dice[3];
					dice[3] = buf;
				}
				}
			}
		}

		/**
		 * 指定された状態になるまで回転を行う
		 * @param upper
		 * @param flont
		 * @return dice サイコロの状態
		 */
		public int[] checkRight(int upper, int front) {

			// サイコロを初期状態にリセット
			dice = diceInit;

			// 上面が指定の面になるまで回転
			for(int i=0; i<3; i++) {
				if(dice[0] == upper) break;
				move("W");
			}
			if(dice[0] != upper) {
				for(int i=0; i<3; i++) {
					if(dice[0] == upper) break;
					move("N");
				}
			}

			// 正面が指定の面になるまで回転
			for(int i=0; i<3; i++) {
				if(dice[1] == front) break;
				move("R");
			}

			return dice;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Boolean sameFlag = false;

		int[] nums1 = new int[6];
		int[] nums2 = new int[6];
		
		for(int i=0; i<6; i++) {
			nums1[i] = sc.nextInt();
		}

		for(int i=0; i<6; i++) {
			nums2[i] = sc.nextInt();
		}

		Dice dice1 = new Main().new Dice(nums1);
		Dice dice2 = new Main().new Dice(nums2);

		// 共通の数値２つを取り出す
		int upper = -1;
		int front = -1;
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(nums1[i] == nums2[j]) upper = nums1[i];
			}
		}
		for(int i=0; i<6; i++) {
			if(nums1[i] == upper) continue;
			for(int j=0; j<6; j++) {
				if(nums1[i] == nums2[j]) front  = nums1[i];
			}
		}

		sc.close();

		int[] surface1 = dice1.checkRight(upper, front);
		int[] surface2 = dice2.checkRight(upper, front);

		if(Arrays.equals(surface1, surface2)) sameFlag = true;

		if(sameFlag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}

