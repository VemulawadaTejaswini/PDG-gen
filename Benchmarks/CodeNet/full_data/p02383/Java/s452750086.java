import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);
	static final int
		TOP = 0, SOUTH = 1, EAST = 2,
		WEST = 3, NORTH = 4, BOTTOM = 5;

	public static void main(String[] args){
		int[] d = new int[6];
		for(int i = 0; i < 6; i++){
			d[i] = scan.nextInt();
		}

		String dirs = scan.next();
		int len = dirs.length();
		for(int i = 0; i < len; i++){
			char ch = dirs.charAt(i);
			switch(ch){
				case 'E' :
					rollEast();
					break;
				case 'W' :
					rollWest();
					break;
				case 'S' :
					rollSouth();
					break;
				case 'N' :
					rollNorth();
					break;
				default :
					break;
			}
		}
		System.out.println(d[TOP]);
	}

	public static void rollEast(){
		int work = d[TOP];
		d[TOP] = d[WEST];
		d[WEST] = d[BOTTOM];
		d[BOTTOM] = d[EAST];
		d[EAST] = work;
	}

	public static void rollWest(){
		int work = d[TOP];
		d[TOP] = d[EAST];
		d[EAST] = d[BOTTOM];
		d[BOTTOM] = d[WEST];
		d[WEST] = work;
	}

	public static void rollSouth(){
		int work = d[TOP];
		d[TOP] = d[NORTH];
		d[NORTH] = d[BOTTOM];
		d[BOTTOM] = d[SOUTH];
		d[SOUTH] = work;
	}

	public static void rollNorth(){
		int work = d[TOP];
		d[TOP] = d[SOUTH];
		d[SOUTH] = d[BOTTOM];
		d[BOTTOM] = d[NORTH];
		d[NORTH] = work;
	}
}