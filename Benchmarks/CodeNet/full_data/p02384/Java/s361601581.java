import java.util.Scanner;

public class Main {
	Dice dice;
	void run(){
		Scanner s = new Scanner(System.in);
		int[] num = new int[6];
		for(int i = 0;i < num.length;i++){
			num[i] = s.nextInt();
		}
		dice = new Dice(num);
		int q = s.nextInt();
		for(int i = 0 ; i < q ; i++){
			int top = s.nextInt();
			int front = s.nextInt();
			dice.label = dice.replaceLabel(top, front);
			dice.printLabel(2);
		}
	}
	public static void main(String args[]){
		new Main().run();
	}
}

class Dice {
	static final int labelNum = 6;
	int[] label;
	Dice(int[] num){
		label = new int[labelNum];
		for(int i = 0;i < labelNum;i++)
			label[i] = num[i];
	}
	
	int[] roll(String pro){
		int[] dice = new int[labelNum];
		switch(pro.hashCode()){
			case 69://E->3
				dice[0] = this.label[3];
				dice[1] = this.label[1];
				dice[2] = this.label[0];
				dice[3] = this.label[5];
				dice[4] = this.label[4];
				dice[5] = this.label[2];
				break;
			case 78://N->5
				dice[0] = this.label[1];
				dice[1] = this.label[5];
				dice[2] = this.label[2];
				dice[3] = this.label[3];
				dice[4] = this.label[0];
				dice[5] = this.label[4];
				break;
			case 83://S->2
				dice[0] = this.label[4];
				dice[1] = this.label[0];
				dice[2] = this.label[2];
				dice[3] = this.label[3];
				dice[4] = this.label[5];
				dice[5] = this.label[1];
				break;
			case 87://W->4
				dice[0] = this.label[2];
				dice[1] = this.label[1];
				dice[2] = this.label[5];
				dice[3] = this.label[0];
				dice[4] = this.label[4];
				dice[5] = this.label[3];
				break;
			default:
				break;
		}
		return dice;
	}
	/*
	int searchIndex(int label){
		int i;
		for(i=0;i<6;i++){
			if(label == this.label[i])break;
		}
		return i;
	}
	*/
	int[] replaceLabel(int top,int front){
		int[] dice = this.label;
		for(int i = 0 ; i < 5;i++){
			if(top == dice[0])break;
			int tmp = dice[0];
			dice[0] = dice[1];
			dice[1] = dice[5];
			dice[5] = dice[4];
			dice[4] = tmp;
		}
		for(int i = 0 ; i < 5;i++){
			if(front == dice[1])break;
			int tmp = dice[4];
			dice[4] = dice[3];
			dice[3] = dice[1];
			dice[1] = dice[2];
			dice[2] = tmp;
		}
		return dice;
	}	
	void print(){
		for(int i = 0;i<this.label.length;i++){
			System.out.println(this.label[i]);
		}
	}
	void printTop(){
		System.out.println(this.label[0]);
	}
	void printLabel(int index){
		System.out.println(this.label[index]);
	}

}