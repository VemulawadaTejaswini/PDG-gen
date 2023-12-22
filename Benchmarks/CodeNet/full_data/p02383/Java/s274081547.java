import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String[] inputs = scan.nextLine().split(" ");
	int[] face = new int[6];
	int SOUTH = 2;
	int NORTH = 5;
	int WEST = 4;
	int EAST = 3;
	int TOP = 1;
	int BOTTOM = 6;
	for (int i = 0; i < 6; i++) {
	    face[i] = Integer.parseInt(inputs[i]);
	}
	String commands = scan.nextLine();
	for (int i = 0; i < commands.length(); i++) {
	    String command = commands.substring(i, i+1);
	    if (command.equals("S")) {
		SOUTH = BOTTOM;
		TOP = NORTH;
		NORTH = 7 - SOUTH;
		BOTTOM = 7 - TOP;
	    } else if (command.equals("N")) {
		NORTH = BOTTOM;
		TOP = SOUTH;
		SOUTH = 7 - NORTH;
		BOTTOM = 7 - TOP;
	    } else if (command.equals("W")) {
		WEST = BOTTOM;
		TOP = EAST;
		EAST = 7 - WEST;
		BOTTOM = 7 - TOP;
	    } else if (command.equals("E")) {
		EAST = BOTTOM;
		TOP = WEST;
		WEST = 7 - EAST;
		BOTTOM = 7 -TOP;
	    }
	}
	System.out.println(face[TOP-1]);
    }
    
}