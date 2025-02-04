import java.util.Scanner;
public class Main {
    public static final int DICE_NUM = 6;
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String[] input = scan.nextLine().split(" ");
	String[] input2 = scan.nextLine().split(" ");
	int[] face1 = new int[6];
	int[] face2 = new int[6];
	for (int i = 0; i < 6; i++) {
	    face1[i] = Integer.parseInt(input[i]);
	    face2[i] = Integer.parseInt(input2[i]);
	}
	Dice dice1 = new Dice(face1);
	Dice dice2 = new Dice(face2);
	if (dice1.checkSameDice(dice2)) {
	    System.out.println("Yes");
	} else {
	    System.out.println("No");
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

    void setFront(int front){
	while(face[SOUTH] != front){
	    turnRight();
	}
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
    
    int getTop() {
	return getFace(TOP);
    }

    boolean checkSameDice(Dice dice2){
	int top1 = getTop();
	dice2.setTop(top1);
	int front1 = getFace(SOUTH);
	dice2.setFront(front1);
	for (int i = 0; i < 4; i++) {
	    if (getFace(i) != dice2.getFace(i)) {
		return false;
	    }
	}
	return true;
    }
}
    