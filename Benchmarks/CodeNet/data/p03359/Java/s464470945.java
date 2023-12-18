import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	System.out.println(day(a, b));
    }
    public static int day (int a, int b) {
	if (a > b) {
	    return a - 1;
	} else {
	    return a;
	}
    }
}

