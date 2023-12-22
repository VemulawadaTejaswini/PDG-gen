import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static class Dice {
		private int[] label;
		
		public static int ABOVE_INDEX = 0;
		public static int FRONT_INDEX = 1;
		public static int RIGHT_INDEX = 2;
		public static int LEFT_INDEX = 3;
		public static int BACK_INDEX = 4;
		public static int BELOW_INDEX = 5;
		
		public Dice(int[] num) {
			label = num;
		}
		
		public void roll(char op) {
			int tmp;
			
			switch (op) {
				case 'E':
					tmp = label[0];
					label[0] = label[3];
					label[3] = label[5];
					label[5] = label[2];
					label[2] = tmp;
					break;
				case 'N':
					tmp = label[0];
					label[0] = label[1];
					label[1] = label[5];
					label[5] = label[4];
					label[4] = tmp;
					break;
				case 'S':
					tmp = label[0];
					label[0] = label[4];
					label[4] = label[5];
					label[5] = label[1];
					label[1] = tmp;
					break;
				case 'W':
					tmp = label[0];
					label[0] = label[2];
					label[2] = label[5];
					label[5] = label[3];
					label[3] = tmp;
					break;
			}
		}
		
		public void horizontalRotation() {
			int tmp = label[1];
			label[1] = label[3];
			label[3] = label[4];
			label[4] = label[2];
			label[2] = tmp;
		}

		public void putDown(int aboveNum, int frontNum) {
			int i;
			for (i = 0; i < 4; i++) {
				roll('N');
				if (getAboveNum() == aboveNum) {
					break;
				}
			}
			
			if (i == 4) {
				for (i = 0; i < 4; i++) {
					roll('E');
					if (getAboveNum() == aboveNum) {
						break;
					}
				}
			}
			
			for (i = 0; i < 4; i++) {
				horizontalRotation();
				if (getNum(FRONT_INDEX) == frontNum) {
					break;
				}
			}
		}
		
		public int getAboveNum() {
			return label[0];
		}

		public int getNum(int index) {
			if (index >= label.length) {
				throw new IllegalArgumentException();
			}
			
			return label[index];
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[6];
		List<Integer> ans = new ArrayList<Integer>(); 
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}

		Dice dice = new Dice(nums);
		int q = scan.nextInt(); 
		
		for (int i = 0; i < q; i++) {
			int above = scan.nextInt();
			int front = scan.nextInt();
			dice.putDown(above, front);
			ans.add(dice.getNum(Dice.RIGHT_INDEX));
		}

		for (Integer n : ans) {
			System.out.println(n);
		}

		scan.close();
	}

}