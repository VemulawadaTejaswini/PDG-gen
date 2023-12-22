import java.util.Scanner;
public class Main{
    public static int NUM_NUMBERS = 5;
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int[] numbers = new int[NUM_NUMBERS];
	for (int i = 0; i < NUM_NUMBERS; i++) {
	    String input = scan.next();
	    numbers[i] = Integer.parseInt(input);
	}
	int width = numbers[0];
	int height = numbers[1];
	int x = numbers[2];
	int y = numbers[3];
	int r = numbers[4];
	if (r <= x && x <= width - r && r <= y && y <= height - r) {
	    System.out.println("Yes");
	} else {
	    System.out.println("No");
	}
    }
}