import java.util.*;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a, b, c;
	String[] line = sc.nextLine().split(" ");
	a = Integer.parseInt(line[0]);
	b = Integer.parseInt(line[1]);
	c = Integer.parseInt(line[2]);

	int tmp;
	if (a > b) {
	    tmp = a;
	    a = b;
	    b = tmp;
	}
	if (b > c) {
	    tmp = b;
	    b = c;
	    c = tmp;
	}
	if (a > b) {
	    tmp = a;
	    a = b;
	    b = tmp;
	}

	System.out.println(a + " " + b + " " + c);
    }
}