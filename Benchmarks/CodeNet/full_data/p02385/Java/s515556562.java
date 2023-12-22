import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int[] num = new int[Dice.SURFACE];

		for(int i = 0; i < input.length; i++){
			num[i] = Integer.parseInt(input[i]);
		}

		Dice dice_1 = new Dice(num);
		input = br.readLine().split(" ");

		for(int i = 0; i < input.length; i++){
			num[i] = Integer.parseInt(input[i]);
		}

		Dice dice_2 = new Dice(num);

		if(dice_1.equals(dice_2)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}
}

class Dice{

	static final int SURFACE = 6;
	static final int TOP = 1;
	static final int FRONT = 2;
	static final int RIGHT = 3;
	static final int LEFT = 4;
	static final int REAR = 5;
	static final int BOTTOM = 6;
	private int[] num = new int[SURFACE];

	public Dice(int[] set){

		for(int i = 0; i < SURFACE; i++){
			num[i] = set[i];
		}

	}

	public int getNum(int rabel){

		return num[rabel - 1];

	}

	public int getRabel(int n){

		for(int i = 0; i < SURFACE; i++){

			if(n == num[i]){
				return i + 1;
			}

		}

		return -1;

	}

	public void moveE(){

		int temp = num[0];
		num[0] = num[3];
		num[3] = num[5];
		num[5] = num[2];
		num[2] = temp;

	}

	public void moveN(){

		int temp = num[0];
		num[0] = num[1];
		num[1] = num[5];
		num[5] = num[4];
		num[4] = temp;

	}

	public void moveS(){

		int temp = num[0];
		num[0] = num[4];
		num[4] = num[5];
		num[5] = num[1];
		num[1] = temp;

	}

	public void moveW(){

		int temp = num[0];
		num[0] = num[2];
		num[2] = num[5];
		num[5] = num[3];
		num[3] = temp;

	}

	public void spinL(){

		int temp = num[1];
		num[1] = num[2];
		num[2] = num[4];
		num[4] = num[3];
		num[3] = temp;

	}

	public void spinR(){

		int temp = num[1];
		num[1] = num[3];
		num[3] = num[4];
		num[4] = num[2];
		num[2] = temp;

	}

	public void fixing(int top, int front){

		switch(getRabel(top)){
			case 2:
				moveN();
				break;
			case 3:
				moveW();
				break;
			case 4:
				moveE();
				break;
			case 5:
				moveS();
				break;
			case 6:
				moveN();
				moveN();
				break;
		}

		switch(getRabel(front)){
			case 3:
				spinL();
				break;
			case 4:
				spinR();
				break;
			case 5:
				spinR();
				spinR();
				break;
		}

	}

	public boolean equals(Dice another){

		another.fixing(num[0], num[1]);

		for(int i = 0; i < SURFACE; i++){

			if(num[i] != another.getNum(i + 1)){
				return false;
			}

		}

		return true;

	}

}