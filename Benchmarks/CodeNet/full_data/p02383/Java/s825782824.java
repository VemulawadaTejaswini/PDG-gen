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
		String str = s.next();
		for(int i = 0;i < str.length();i++){
			dice.label = dice.roll(str.substring(i,i+1));
		}
		dice.printTop();
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
	
	void print(){
		for(int i = 0;i<this.label.length;i++){
			System.out.println(this.label[i]);
		}
	}
	void printTop(){
		System.out.println(this.label[0]);
	}
}