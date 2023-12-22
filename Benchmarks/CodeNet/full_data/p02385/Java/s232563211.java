import java.util.Scanner;

public class Main {
	void runA(){
		Scanner s = new Scanner(System.in);
		int[] num = new int[6];
		for(int i = 0;i < num.length;i++){
			num[i] = s.nextInt();
		}
		Dice dice = new Dice(num);
		String str = s.next();
		for(int i = 0;i < str.length();i++){
			dice.label = dice.roll(str.substring(i,i+1));
			//Character.hashCode(str.charAt(i));
		}
		dice.printTop();
	}
	void runB(){
		Scanner s = new Scanner(System.in);
		int[] num = new int[6];
		for(int i = 0;i < num.length;i++){
			num[i] = s.nextInt();
		}
		Dice dice = new Dice(num);
		int q = s.nextInt();
		for(int i = 0 ; i < q ; i++){
			int top = s.nextInt();
			int front = s.nextInt();
			dice.label = dice.replaceLabel(top, front);
			//System.out.println(i+ "回目");
			//System.out.println(top + ":" + front);
			dice.printLabel(2);
		}
	}
	void runC(){
		Scanner s = new Scanner(System.in);
		Dice[] dice = new Dice[2];
		for(int i = 0;i < 2;i++){
			int[] num = new int[6];
			for(int j = 0;j < num.length;j++){
				num[j] = s.nextInt();
			}
			dice[i] = new Dice(num);
		}
		if(dice[0].checkSameDice(dice[1])){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	public static void main(String args[]){
		new Main().runC();
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
			case 69://E(東)->3
				dice[0] = this.label[3];
				dice[1] = this.label[1];
				dice[2] = this.label[0];
				dice[3] = this.label[5];
				dice[4] = this.label[4];
				dice[5] = this.label[2];
				break;
			case 78://N(北)->5
				dice[0] = this.label[1];
				dice[1] = this.label[5];
				dice[2] = this.label[2];
				dice[3] = this.label[3];
				dice[4] = this.label[0];
				dice[5] = this.label[4];
				break;
			case 83://S(南)->2
				dice[0] = this.label[4];
				dice[1] = this.label[0];
				dice[2] = this.label[2];
				dice[3] = this.label[3];
				dice[4] = this.label[5];
				dice[5] = this.label[1];
				break;
			case 87://W(西)->4
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
		int j = 0;
		while(j < 26){
			if(top == dice[0]&&front == dice[1])break;
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
			j++;
		}
		return dice;
	}	
	boolean checkSameDice(Dice dice){
		boolean check = true;
		for(int i = 0;i < 4;i++){
			for(int j = 0;j < 4;j++){
				/*
				for(int k = 0;k < 6;k++){
					System.out.print(this.label[k]);
				}
				System.out.println();
				for(int k = 0;k < 6;k++){
					System.out.print(dice.label[k]);
				}
				System.out.println();
				*/
				check = true;
				for(int k = 0;k < 6;k++){
					if(this.label[k] != dice.label[k]){
						check = false;
						//System.out.println("No");
						break;
					}
				}
				if(check)break;
				dice.label = dice.rollInt(i,j);
			}
			if(check)break;
		}
		return check;
	}
	int[] rollInt(int n,int m){
		for(int i = 0;i < n;i++){
			this.label = this.roll("E");
			/*
			int tmp = this.label[0];
			this.label[0] = this.label[1];
			this.label[1] = this.label[5];
			this.label[5] = this.label[4];
			this.label[4] = tmp;
			*/
		}
		for(int i = 0;i < m;i++){
			this.label = this.roll("S");
			/*
			int tmp = this.label[4];
			this.label[4] = this.label[3];
			this.label[3] = this.label[1];
			this.label[1] = this.label[2];
			this.label[2] = tmp;
			*/
		}
		return this.label;
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