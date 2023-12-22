import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	double x1, x2, x3, x4, y1, y2, y3, y4;
	String[] input;
	double slopeAB, slopeCD;
	for (int i = 0; i < n; i++) {
	    input = scan.nextLine().split(" ");
	    x1 = Double.parseDouble(input[0]);
	    y1 = Double.parseDouble(input[1]);
	    x2 = Double.parseDouble(input[2]);
	    y2 = Double.parseDouble(input[3]);
	    x3 = Double.parseDouble(input[4]);
	    y3 = Double.parseDouble(input[5]);
	    x4 = Double.parseDouble(input[6]);
	    y4 = Double.parseDouble(input[7]);
	    slopeAB = (y1 - y2) / (x1 - x2);
	    slopeCD = (y3 - y4) / (x3 - x4);
	    if (slopeAB == slopeCD) {
		System.out.println("YES");
	    } else {
		System.out.println("NO");
	    }
	}
    }
}