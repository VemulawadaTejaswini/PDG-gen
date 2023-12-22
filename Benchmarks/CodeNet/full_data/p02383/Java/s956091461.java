
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		String s = sc.next();
		Dice dice = new Dice(a, b, c, d, e, f);
		dice.move(s);
		System.out.println(dice.top);
	}
}
class Dice {
	int north;
	int south;
	int east;
	int west;
	int top;
	int bottom;
	public Dice(int... ary){
		this.top = ary[0];
		this.south = ary[1];
		this.east = ary[2];
		this.west = ary[3];
		this.north = ary[4];
		this.bottom = ary[5];
	}
	public void move(String s){
		char[] chars = s.toCharArray();
		for(char c : chars){
			switch(c){
				case 'N': this.toNorth();
				break;
				case 'S': this.toSouth();
				break;
				case 'E': this.toEast();
				break;
				case 'W': this.toWest();
				break;
			}
		}
	}
	public void toNorth(){
		int swap = north;
		north = top;
		top = south;
		south = bottom;
		bottom = swap;
	}
	public void toSouth(){
		int swap = south;
		south = top;
		top = north;
		north = bottom;
		bottom = swap;
	}
	public void toEast(){
		int swap = east;
		east = top;
		top = west;
		west = bottom;
		bottom = swap;
	}
	public void toWest(){
		int swap = west;
		west = top;
		top = east;
		east = bottom;
		bottom = swap;
	}
}

