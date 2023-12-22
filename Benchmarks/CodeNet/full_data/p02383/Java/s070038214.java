import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dice dice = new Dice();

		for (int i = 1; i <= 6; i++) {
			dice.setFace(i,sc.nextInt());
		}
        
        String x = sc.nextLine();
		char[] arr = sc.nextLine().toCharArray();
		for (int i = 0; i < arr.length; i++) {
			dice.roll(arr[i]);
		}

		System.out.println(dice.getFace());

	}
}

	class Dice {
		// [1]-[6]がダイスの各面で[0]は入れ替え時の退避用
		public int[] faces = new int[7];

		public void setFace(int face, int value) {
			this.faces[face] = value;
		}

		public void roll(char direction) {
			faces[0] = faces[1];
			switch (direction) {
			case 'S':
				this.faces[1] = this.faces[5];
				this.faces[5] = this.faces[6];
				this.faces[6] = this.faces[2];
				this.faces[2] = this.faces[0];
				break;
			case 'W':
				this.faces[1] = this.faces[3];
				this.faces[3] = this.faces[6];
				this.faces[6] = this.faces[4];
				this.faces[4] = this.faces[0];
				break;
			case 'N':
				this.faces[1] = this.faces[2];
				this.faces[2] = this.faces[6];
				this.faces[6] = this.faces[5];
				this.faces[5] = this.faces[0];
				break;
			case 'E':
				this.faces[1] = this.faces[4];
				this.faces[4] = this.faces[6];
				this.faces[6] = this.faces[3];
				this.faces[3] = faces[0];
				break;
			}

		}

		public int getFace() {
			return this.faces[1];
		}

	}

