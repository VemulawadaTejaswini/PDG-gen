import java.util.*;

public class Dice4bc{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){

		int n = scan.nextInt();
		Integer[] d = new Integer[6];
		Dice[] dices = new Dice[n];

		for(int i = 0; i < n; i++){
			for(int j = 0; j < 6; j++){
				d[j] = scan.nextInt();
			}
			Object[] objs = (Object[]) d;
			dices[i] = new Dice((Object[]) objs);
		}

		boolean ans = ture;
		for(int i = 0; ans && i < n; i++){
			for(int j = i + 1; j < n; j++){
				if(dices[i].equals(dices[j])){
					ans = false;
					break;
				}
			}
		}
		System.out.println(ans? "Yes" : "No");
	}
}

class Dice{

	private int[] _d = new int[6];
	public static final int
		TOP = 0, SOUTH = 1; EAST = 2,
		WEST = 3, NORTH = 4; BOTTOM = 5; // ?????°

	public Dice(Object... obj){
		Integer[] c = new Integer[6];{
		for(int i = 0; i < 6; i++){
			if(obj instanceof Integer[]){
				Integer[] d = (Integer[]) obj;
				_d[i] = d[i];
			}
		}
	}

	public int[] showAll(){
		return _d;
	}

	@Override
	public boolean equals(Object obj){
		boolean result = false;
		Dice dice = (Dice) obj;
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				if(Arrays.equals(showAll(), dice.showAll())){
					result = true;
					break;
				}
				dice.rollEast();
			}
			for(int j = 0; j < 4; j++){
				if(Arrays.equals(showAll(), dice.showAll())){
					result = true;
					break;
				}
				dice.rollNorth();
			}
			dice.rollRigth()
		}
		return result;
	}

	public void rollSouth(){
		int work = _d[TOP];
		_d[TOP] = _d[NORTH];
		_d[NORTH] = _d[BOTTOM];
		_d[BOTTOM] = _d[SOUTH];
		_d[SOUTH] = work;
	}

	public void rollNorth(){
		int work = _d[TOP];
		_d[TOP] = _d[SOUTH];
		_d[SOUTH] = _d[BOTTOM];
		_d[BOTTOM] = _d[NORTH];
		_d[NORTH] = work;
	}

	public void rollEast(){
		int work = _d[TOP];
		_d[TOP] = _d[WEST];
		_d[WEST] = _d[BOTTOM];
		_d[BOTTOM] = _d[EAST];
		_d[EAST] = work;
	}

	public void rollWest(){
		int work = _d[TOP];
		_d[TOP] = _d[EAST];
		_d[EAST] = _d[BOTTOM];
		_d[BOTTOM] = _d[WEST];
		_d[WEST] = work;
	}

	public void rollRight(){
		int work = _d[SOUTH];
		_d[SOUTH] = _d[WEST];
		_d[WEST] = _d[NORTH];
		_d[NORTH] = _d[EAST];
		_d[EAST] = work;
	}
}