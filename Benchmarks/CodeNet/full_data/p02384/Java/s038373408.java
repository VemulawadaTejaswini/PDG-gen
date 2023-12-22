import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Dice dice = new Dice(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		int count,up,front;
		count =sc.nextInt();
		for(int x= 0; x<count; x++) {
			up = sc.nextInt();
			front = sc.nextInt();
			String shijirow = "EEENEEENEEESEEESEEENEEEN";
			for(int i =0; i<shijirow.length(); i++) {
			    	if(dice.up==up&&dice.front==front) {
					System.out.println(dice.left);
					break;
				}
				dice.roll(shijirow.charAt(i));
			}
		}
	}
}

class Dice {
	int up =1;
	int front = 2;
	int left = 3;
	int right = 4;
	int back = 5;
	int down = 6;

	Dice(){};

	Dice(int up,int front,int left,int right, int back, int down){
		this.up = up;
		this.front = front;
		this.left =left;
		this.right = right;
		this.back = back;
		this.down = down;

	}


	void roll(char Shiji) {
		int  tmp;
		switch(Shiji) {
		case 'N':{
			tmp = up;
			this.up = this.front;
			this.front = this.down;
			this.down = this.back;
			this.back = tmp;
			break;
		}
		case 'E':{
			tmp = this.up;
			this.up = this.right;
			this.right = this.down;
			this.down = this.left;
			this.left = tmp;
			break;
		}
		case 'W':{
			tmp = this.up;
			this.up = this.left;
			this.left = this.down;
			this.down = this.right;
			this.right = tmp;
			break;
		}
		case 'S':{
			tmp = this.up;
			this.up = this.back;
			this.back = this.down;
			this.down = this.front;
			this.front = tmp;
			break;
		}
		}

	}

}

