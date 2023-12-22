import java.util.*;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a, b, c;
	String[] line = sc.nextLine().split(" ");
	a = Integer.parseInt(line[0]);
	b = Integer.parseInt(line[1]);
	c = Integer.parseInt(line[2]);

	if (a < b && b < c) {
	    System.out.println("Yes");
	} else {
	    System.out.println("No");
	}
    }
}