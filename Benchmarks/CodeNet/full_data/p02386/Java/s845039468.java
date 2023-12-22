import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);
	static boolean flag = false;

	public static void main(String[] args){
		
		int n = scan.nextInt();
		int[] d = new int[6];
		Dice[] dices = new Dice[n];

		for(int i = 0; i < n; i++){
			for(int j = 0; j < 6; j++){
				d[j] = scan.nextInt();
			}
			dices[i] = new Dice(d);
		}

		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				flag = checkSameDice(dices[i], dices[j]);
			}
		}
		System.out.println(flag? "No" : "Yes");
	}

	public static boolean checkSameDice(Dice diceA, Dice diceB){
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				if(rigthtCheck(diceA, diceB) == true)return true;
				diceB.rollNorth();
			}
			for(int j = 0; j < 4; j++){
				diceB.rollEast();
				if(rigthtCheck(diceA, diceB) == true)return true;
			}
		}
		return false;
	}
	public static boolean rigthtCheck(Dice dice1, Dice dice2){
		for(int k = 0; k < 4; k++){
			flag = Arrays.equals(dice1._d, dice2._d);
			if(flag == true)return true;
			dice2.rollRight();
		}
		return false;
	}
}

class Dice{

	int[] _d = new int[6];
	public static final int
		TOP = 0, SOUTH = 1, EAST = 2,
		WEST = 3, NORTH = 4, BOTTOM = 5; // ?????°

	public Dice(int[] d){ // ?????????????????????
		for(int i = 0; i < 6; i++){
			_d[i] = d[i];
		}
	}

	public void rollSouth(){
		int tmp = _d[TOP];
		_d[TOP] = _d[NORTH];
		_d[NORTH] = _d[BOTTOM];
		_d[BOTTOM] = _d[SOUTH];
		_d[SOUTH] = tmp;
	}

	public void rollNorth(){
		int tmp = _d[TOP];
		_d[TOP] = _d[SOUTH];
		_d[SOUTH] = _d[BOTTOM];
		_d[BOTTOM] = _d[NORTH];
		_d[NORTH] = tmp;
	}

	public void rollEast(){
		int tmp = _d[TOP];
		_d[TOP] = _d[WEST];
		_d[WEST] = _d[BOTTOM];
		_d[BOTTOM] = _d[EAST];
		_d[EAST] = tmp;
	}

	public void rollWest(){
		int tmp = _d[TOP];
		_d[TOP] = _d[EAST];
		_d[EAST] = _d[BOTTOM];
		_d[BOTTOM] = _d[WEST];
		_d[WEST] = tmp;
	}

	public void rollRight(){
		int tmp = _d[SOUTH];
		_d[SOUTH] = _d[WEST];
		_d[WEST] = _d[NORTH];
		_d[NORTH] = _d[EAST];
		_d[EAST] = tmp;
	}
}