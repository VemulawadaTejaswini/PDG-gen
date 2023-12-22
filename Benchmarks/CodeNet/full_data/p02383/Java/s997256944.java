import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[6];
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		String order = scan.next();
		scan.close();
		Dice dice = new Dice(array);
		dice.roll(order);
		System.out.println(dice.getNumber(0));
	}
}
	

class Dice {
	int[] num = new int[6];
	Dice() {
	}

	Dice(int[] array) {
		for (int i = 0; i < array.length; i++) {
			this.num[i] = array[i];
		}
	}
	
	public void setNum(int[] array) {
		this.num = array;
	}
	
	public int[] getNum() {
		return this.num;
	}
	
	public int getNumber(int i) {
		return this.num[i];
	}
	
	public void roll(String order) {
		int now_1 = 0;	int now_2 = 1;	int now_3 = 2;	int tmp;
		int[] array = getNum();
		char[] check = {'N', 'E', 'S', 'W'};
		for (int i = 0; i < order.length(); i++) {
			for (int j = 0; j < check.length; j++) {
				if (order.charAt(i) == check[j]) {
					switch (j + 1) {
						case 1:
							tmp = now_1;
							now_1 = now_2;
							now_2 = 5 - tmp;
							break;
						case 2:
							tmp = now_1;
							now_1 = 5 - now_3;
							now_3 = tmp;
							break;
						case 3:
							tmp = now_1;
							now_1 = 5 - now_2;
							now_2 = tmp;
							break;
						case 4:
							tmp = now_1;
							now_1 = now_3;
							now_3 = 5 - tmp;
							break;
					}
				}
			}
		}
		int[] cp_array = new int[array.length];
		cp_array[0] = array[now_1]; cp_array[1] = array[now_2];
		cp_array[2] = array[now_3]; cp_array[3] = array[5 - now_3];
		cp_array[4] = array[5 - now_1]; cp_array[5] = array[5 -now_2];
		setNum(cp_array);
	}
}