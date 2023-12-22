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

		for(int i = 0; i < n - 1; i++){
			for(int j = n - 1; j > i; j--){
				flag = checkSameDice(Dice[j], Dice[j - 1]);
				if(flag == true)break;
			}
			if(flag == true)break;
		}
		System.out.println(flag? "No" : "Yes");
	}

	public static boolean checkSameDice(Dice diceA, Dice diceB){
		flag = false;
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				flag = Arrays.equals(diceA._d, diceB._d);
				if(flag == true)break;
				diceB.rollEast();
			}
			for(int j = 0; j < 4; j++){
				flag = Arrays.equals(diceA._d, diceB._d);
				if(flag == true)break;
				diceB.rollSouth();
			}
			flag = Arrays.equals(diceA._d, diceB._d);
			if(flag == true)break;
			diceB.rollRight();
		}
		return flag;
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