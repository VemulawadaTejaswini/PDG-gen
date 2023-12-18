import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Receive number
    	Scanner sc = new Scanner(System.in);
    	int west = sc.nextInt();
    	int east = sc.nextInt();

    	// calc
    	int diff = east - west;
    	int height = calcHeight(diff);

    	int snow = height - west;
    	System.out.print(snow);
	}

	public static int calcHeight (int diff) {

		int height = 0; // Height of west tower
		for (int i=1;i < diff; i++) {
			height += i;
		}
		return height;
	}
}