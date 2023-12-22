import java.util.Scanner;
public class Main {
    public static final int DICE_NUM = 6;
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String[] inputs = scan.nextLine().split(" ");
	int[] face = new int[DICE_NUM];
	for (int i = 0; i < DICE_NUM; i++) {
	    face[i] = Integer.parseInt(inputs[i]);
	}
	Dice dice = new Dice(face);
	int q = Integer.parseInt(scan.nextLine());
	int[] side = new int[4];
	for (int i = 0; i < q; i++) {
	    String[] topfront = scan.nextLine().split(" ");
	    int top = Integer.parseInt(topfront[0]);
	    int front = Integer.parseInt(topfront[1]);
	    dice.setTop(top);
	    while(dice.getFace(1) != front) {
		dice.turnRight();
	    }
	    System.out.println(dice.getFace(2));
	}
    }
}
class Dice{
    int NORTH = 4;
    int SOUTH = 1;
    int WEST = 3;
    int EAST = 2;
    int TOP = 0;
    int BOTTOM = 5;
    int[] face = new int[6];
	
    Dice(int[] face){
	this.face = face;
    }

    void setTop(int top){
	int cnt = 0;
	while(face[TOP] != top && cnt < 4){
	    turnSouth();
	    cnt++;
	}
	while(face[TOP] != top){
	    turnEast();
	}
    }

    void turnRight(){
	turnEast();
	turnSouth();
	turnWest();
    }

    void turnEast(){
	int bottom = face[BOTTOM];
	int west = face[WEST];
	face[BOTTOM] = face[EAST];
	face[EAST] = face[TOP];
	face[WEST] = bottom;
	face[TOP] = west;
    }

    void turnWest(){
	int bottom = face[BOTTOM];
	int east = face[EAST];
	face[BOTTOM] = face[WEST];
	face[WEST] = face[TOP];
	face[EAST] = bottom;
	face[TOP] = east;
    }
	
    void turnNorth(){
	int bottom = face[BOTTOM];
	int south = face[SOUTH];
	face[BOTTOM] = face[NORTH];
	face[NORTH] = face[TOP];
	face[SOUTH] = bottom;
	face[TOP] = south;
    }

    void turnSouth(){
	int bottom = face[BOTTOM];
	int north = face[NORTH];
	face[BOTTOM] = face[SOUTH];
	face[SOUTH] = face[TOP];
	face[NORTH] = bottom;
	face[TOP] = north;
    }
    int getFace(int index){
	return face[index];
    }
}
    