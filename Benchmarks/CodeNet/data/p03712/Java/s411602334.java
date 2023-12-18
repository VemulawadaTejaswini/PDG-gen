
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int H = Integer.parseInt(scan.next());
	int W = Integer.parseInt(scan.next());

	StringBuilder str = new StringBuilder();
	for (int i = 0; i < W+2; i++) {
	    str.append("#");
	}
	str.append("\n");
	for (int i = 0; i < H; i++) {
	    str.append("#");
	    str.append(scan.next());
	    str.append("#\n");
	}
	for (int i = 0; i < W+2; i++) {
	    str.append("#");
	}
	System.out.println(str.toString());
	scan.close();
    }
}
