import java.util.Scanner;


// ?????????????????????????????????????????????????????????
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 2;
		boolean same = true; 
		Dice[] dice = new Dice[n];
		int[] array = new int[6 + 1];
		array[0] = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < 7; j++) {
				array[j] = scan.nextInt();
			}
			dice[i] = new Dice(array);
		}
		
		array = dice[0].getNum();
		if (dice[1].check(array)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
	

class Dice {
	private int[] num = new int[6 + 1];
	Dice() {
	}

	Dice(int[] array) {
		for (int i = 0; i < array.length; i++) {
			this.num[i] = array[i];
		}
	}
	
	public int[] getNum() {
		return this.num;
	}
	
	public int getNumber(int i) {
		return this.num[i];
	}
	
	// ??????????????¢??????????????????
	public int[] roll(int[]ary, String order) {
		int now_1 = 1;	int now_2 = 2;	int now_3 = 3;	int tmp;
		int[] array = ary;
		char[] check = {'N', 'E', 'S', 'W'};
		for (int i = 0; i < order.length(); i++) {
			for (int j = 0; j < check.length; j++) {
				if (order.charAt(i) == check[j]) {
					switch (j + 1) {
						case 1:
							tmp = now_1;
							now_1 = now_2;
							now_2 = 7 - tmp;
							break;
						case 2:
							tmp = now_1;
							now_1 = 7 - now_3;
							now_3 = tmp;
							break;
						case 3:
							tmp = now_1;
							now_1 = 7 - now_2;
							now_2 = tmp;
							break;
						case 4:
							tmp = now_1;
							now_1 = now_3;
							now_3 = 7 - tmp;
							break;
					}
				}
			}
		}
		int[] cp_array = new int[array.length];
		cp_array[1] = array[now_1]; cp_array[2] = array[now_2];
		cp_array[3] = array[now_3]; cp_array[4] = array[7 - now_3];
		cp_array[5] = array[7 - now_2]; cp_array[6] = array[7 -now_1];
		return cp_array;
	}
	
	
	// ??????????????????????????????????????????
	public boolean check(int[] tarary) {
		int[] ary = tarary;
		String[] str = {"null", "N", "N", "N", "E", "WW"};
		int sum = 0;
		int[] array = new int[this.num.length];
		for (int i = 0; i < this.num.length; i++) {
			array[i] = this.num[i];
		}
		boolean decision = false;
		for (int i = 0; i < str.length; i++) {
			array = this.roll(array, str[i]);
			for (int j = 0; j < 4; j++) {
				if (array[1] == ary[1]) {
					if (array[2] == ary[2]) {
						for (int k = 3; k < ary.length; k++) {
							
							if (array[k] != ary[k]) {
								decision = false;
								break;
							}
							decision = true;
						}
					}
					if (decision) {
						break;
					} else {
						array = this.roll(array, "NWS");
					}
				} else {
					break;
				}
			}
			if (decision) break;
		}
		

		return decision;
	}
}