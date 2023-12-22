import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] num1 = new int[6];
		int[] num2 = new int[6];

		for (int i=0; i<6; i++) {
			num1[i] = stdIn.nextInt();
		}
		for (int i=0; i<6; i++) {
			num2[i] = stdIn.nextInt();
		}

		int[] num1Copy = num1.clone();
		int[] num2Copy = num2.clone();
		Arrays.sort(num1Copy);
		Arrays.sort(num2Copy);
		for (int i=0; i<6; i++) {
			if(num1Copy[i] != num1Copy[i]){
				System.out.println("No");
				return;
			}
		}

		Dice dice1 = new Dice(num1);
		Dice dice2 = new Dice(num2);
		if(dice1.solve(num2[0],num2[1])){
			if(dice1.compareTo(dice2))
				System.out.println("Yes");
			else
				System.out.println("No");
		}else{
			System.out.println("No");
		}
	}

	static class Dice {

		int top;
		int front;
		int right;
		int left;
		int back;
		int bottom;

		Dice(int[] num){
			top = num[0];
			front = num[1];
			right = num[2];
			left = num[3];
			back = num[4];
			bottom = num[5];
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

		void turn(){
			int temp = front;
			front = right;
			right = back;
			back = left;
			left = temp;
		}

		boolean solve(int top,int front){
			boolean flag = false;
			for (int i=0; i<4; i++) {
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

			flag = false;

			for (int i=0; i<4; i++) {
				turn();
				if(this.front == front){
					flag = true;
					break;
				}
			}
			return flag;
		}

		boolean compareTo(Dice x){
			if(x.top == this.top
				&& x.front == this.front
				&& x.right == this.right
				&& x.left == this.left
				&& x.back == this.back
				&& x.bottom == this.bottom)
				return true;
			else
				return false;
		}

		void show(){
			System.out.println("top "+this.top);
			System.out.println("front "+this.front);
			System.out.println("right "+this.right);
			System.out.println("left "+this.left);
			System.out.println("back "+this.back);
			System.out.println("bottom "+this.bottom);
		}
	}
}