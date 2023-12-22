import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			Dice dice = new Dice(sc.nextLine().split(" "));
			char[] str = sc.next().toCharArray();
			
			for(char ch: str) {
				dice.rotate(ch);
			}
			System.out.println(dice.showTop());
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
			}
		}
		public int showTop() {
			return this.face[0];
		}
	}
}
