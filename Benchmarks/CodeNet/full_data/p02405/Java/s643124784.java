import java.util.Scanner;
import java.lang.Math;
public class Main{
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	while (scan.hasNext()) {
	    String input = scan.nextLine();
	    String[] inputs = input.split(" ");
	    int height = Integer.parseInt(inputs[0]);
	    int width = Integer.parseInt(inputs[1]);
	    if (height == 0 && width == 0) {
		break;
	    }
	    int line = 0;
	    while(line < height) {
		if (line % 2 == 0) {
		    printcheck1(width);
		} else {
		    printcheck2(width);
		}
		line++;
	    }
	    System.out.println();
	}
    }
    public static void printcheck1(int width) {
	for (int i = 0; i < width; i++) {
	    if (i % 2 == 0) {
		System.out.print("#");
	    } else {
		System.out.print(".");
	    }
	}
	System.out.println();
    }
    public static void printcheck2(int width) {
	for (int i = 0; i < width; i++) {
	    if (i % 2 == 0) {
		System.out.print(".");
	    } else {
		System.out.print("#");
	    }
	}
	System.out.println();
    }
}