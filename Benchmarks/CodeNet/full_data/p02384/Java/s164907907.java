import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			Dice dice = new Dice(sc.nextLine().split(" "));
			int num = sc.nextInt();
			for(int i=0;i<num;i++) {
				dice.toTop(sc.nextInt());
				dice.toFront(sc.nextInt());
				System.out.println(dice.showN(2));
			}
		}
	}
	static class Dice{
		
		private int[] face;
		
		public Dice(int[] face) {
			this.face = face;
		}
		public Dice(String[] face) {
			this.face = new int[6];
			for(int i=0;i<this.face.length;i++) {
				this.face[i] = Integer.parseInt(face[i]);
			}
		}
		
		/**
		 * 東西南北EWSN+右左RLでさいころを回転させます
		 * @param to 回転向き?
		 */
		public void rotate(char to){
			int buf;
			switch(to) {
			case 'E':
				buf = this.face[0];
				this.face[0] = this.face[3];
				this.face[3] = this.face[5];
				this.face[5] = this.face[2];
				this.face[2] = buf;
				break;
			case 'W':
				buf = this.face[0];
				this.face[0] = this.face[2];
				this.face[2] = this.face[5];
				this.face[5] = this.face[3];
				this.face[3] = buf;
				break;
			case 'S':
				buf = this.face[0];
				this.face[0] = this.face[4];
				this.face[4] = this.face[5];
				this.face[5] = this.face[1];
				this.face[1] = buf;
				break;
			case 'N':
				buf = this.face[0];
				this.face[0] = this.face[1];
				this.face[1] = this.face[5];
				this.face[5] = this.face[4];
				this.face[4] = buf;
				break;
			case 'R':
				buf = this.face[1];
				this.face[1] = this.face[2];
				this.face[2] = this.face[4];
				this.face[4] = this.face[3];
				this.face[3] = buf;
				break;
			case 'L':
				buf = this.face[1];
				this.face[1] = this.face[3];
				this.face[3] = this.face[5];
				this.face[5] = this.face[2];
				this.face[2] = buf;
				break;
			}
		}
		
		/**
		 * 指定した数字を上面に持ってきます
		 * @param num
		 */
		public void toTop(int num) {
			if(this.showTop()==num) return;
			int i;
			for(i=0;i<4;i++) {
				this.rotate('N');
				if(this.showTop() == num) {
					return;
				}
			}
			for(i=0;i<4;i++) {
				this.rotate('W');
				if(this.showTop() == num) {
					return;
				}
			}
		}
		
		/**
		 * 指定した数字を手前に持ってきます
		 * 水平一線のみ可
		 * @param num
		 */
		public void toFront(int num) {
			if(this.showN(1)==num) return;
			for(int i=0;i<4;i++) {
				this.rotate('R');
				if(this.showN(1) == num) {
					return;
				}
			}
		}
		public int showTop() {
			return this.face[0];
		}
		public int showN(int n) {
			return this.face[n];
		}
	}
}
