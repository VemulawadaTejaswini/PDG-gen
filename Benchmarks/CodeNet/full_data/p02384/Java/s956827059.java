import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] num = new int[6];
		for (int i=0; i<6; i++) {
			num[i] = stdIn.nextInt();
		}
		Dice dice = new Dice();
		int n = stdIn.nextInt();
		for (int i=0; i<n; i++) {
			int t = stdIn.nextInt();
			int f = stdIn.nextInt();
			System.out.println(num[dice.solve(t,f)-1]);
		}
	}

	static class Dice {

		private int top = 1;
		private int front = 2;
		private int right = 3;
		private int left = 4;
		private int back = 5;
		private int bottom = 6;

		Dice(){
		}

		void change(char dir) {
			int temp = 0;
			switch(dir){
				case 'N': moveN(); break;
				case 'S': moveS(); break;
				case 'E': moveE(); break;
				case 'W': moveW(); break;
			}
		}

		void moveN(){
			int temp = top;
			top = front;
			front = bottom;
			bottom = back;
			back = temp;
		}

		void moveS(){
			int temp = top;
			top = back;
			back = bottom;
			bottom = front;
			front = temp;
		}

		void moveE(){
			int temp = top;
			top = left;
			left = bottom;
			bottom = right;
			right = temp;
		}

		void moveW(){
			int temp = top;
			top = right;
			right = bottom;
			bottom = left;
			left = temp;
		}

		int isTop(){
			return top;
		}

		int isRight(){
			return right;
		}

		int solve(int top,int front){
			boolean flag = false;
			for (int i=0; i<3; i++) {
				moveN();
				if(this.top == top){
					flag = true;
					break;
				}
			}
			if(!flag){
				while(this.top != top){
					moveE();
				}
			}
			while(this.front != front){
				turn();
			}
			return this.right;
		}

		void turn(){
			int temp = this.front;
			this.front = right;
			right = back;
			back = left;
			left = temp;
		}
	}
}