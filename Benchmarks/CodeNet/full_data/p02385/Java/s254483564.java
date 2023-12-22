import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		
		int[] d = new int[6];
		char[] c = { 'E', 'E', 'E', 'N', 'N', 'N', 'R','R', 'R', 'E', 'N', 'R', 'E'};
		for(int i = 0; i < 6; i++){
			d[i] = scan.nextInt();
		}
		Dice dice1 = new Dice(d);
		for(int i = 0; i < 6; i++){
			d[i] = scan.nextInt();
		}
		Dice dice2 = new Dice(d);

		
		boolean flg = false;
		for(char cc : c){
			if(Arrays.equals(dice1._d, dice2._d)){
				flg = true;
				break;
			}
			dice2.roll(cc);
		}
		System.out.println(flg? "Yes" : "No");
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

	public void roll(char c){
		switch(c){
			case 'E' :
				rollEast();
				break;
			case 'N' :
				rollNorth();
				break;
			case 'R' :
				rollRight();
				break;
			default :
				break;
		}
	}

	public int show(int side){ // ??????????????????????????????
		return _d[side];
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