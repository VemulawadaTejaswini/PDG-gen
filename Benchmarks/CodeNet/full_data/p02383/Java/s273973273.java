import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int[] d = new int[6];
		for(int i = 0; i < 6; i++){
			d[i] = scan.nextInt();
		}

		Dice dice = new Dice(d);
		String dirs = scan.next();
		int len = dirs.length();
		for(int i = 0; i < len; i++){
			char ch = dirs.charAt(i);
			switch(ch){
				case 'E' :
					dice.rollEast();
					break;
				case 'W' :
					dice.rollWest();
					break;
				case 'S' :
					dice.rollSouth();
					break;
				case 'N' :
					dice.rollNorth();
					break;
				default :
					break;
			}
		}
		System.out.println(dice.show(Dice.TOP));
	}
}

class Dice{
	int[] d_ = new int[6];
	public static final int
		TOP = 0, SOUTH = 1, EAST = 2,
		WEST = 3, NORTH = 4, BOTTOM = 5;

	public Dice(int[] d){
		for(int i = 0; i < 6; i++){
			d_[i] = d[i];
		}
	}

	public int show(int side){
		return d_[side];
	}

	public void rollEast(){
		int work = d_[TOP];
		d_[TOP] = d_[WEST];
		d_[WEST] = d_[BOTTOM];
		d_[BOTTOM] = d_[EAST];
		d_[EAST] = work;
	}

	public void rollWest(){
		int work = d_[TOP];
		d_[TOP] = d_[EAST];
		d_[EAST] = d_[BOTTOM];
		d_[BOTTOM] = d_[WEST];
		d_[WEST] = work;
	}

	public void rollSouth(){
		int work = d_[TOP];
		d_[TOP] = d_[NORTH];
		d_[NORTH] = d_[BOTTOM];
		d_[BOTTOM] = d_[SOUTH];
		d_[SOUTH] = work;
	}

	public void rollNorth(){
		int work = d_[TOP];
		d_[TOP] = d_[SOUTH];
		d_[SOUTH] = d_[BOTTOM];
		d_[BOTTOM] = d_[NORTH];
		d_[NORTH] = work;
	}
}