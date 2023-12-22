import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x, y;
	while (true) {
	    String[] line = sc.nextLine().split(" ");
	    x = Integer.parseInt(line[0]);
	    y = Integer.parseInt(line[1]);
	    if (x == 0 && y == 0) break;

	    if (x > y) {
		System.out.println(y + " " + x);
	    } else {
		System.out.println(x + " " + y);
	    }
	}
    }
}