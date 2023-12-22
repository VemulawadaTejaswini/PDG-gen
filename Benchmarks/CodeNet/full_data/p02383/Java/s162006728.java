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

		Dice dice = new Dice(num);
		char[] ope = br.readLine().toCharArray();

		for(int i = 0; i < ope.length; i++){

			if(ope[i] == 'N'){
				dice.moveN();
			}else if(ope[i] == 'E'){
				dice.moveE();
			}else if(ope[i] == 'W'){
				dice.moveW();
			}else if(ope[i] == 'S'){
				dice.moveS();
			}

		}

		System.out.println(dice.getNum(1));

	}
}

class Dice{

	static final int SURFACE = 6;
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

}