import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner (System.in);
	int n = Integer.parseInt(scan.nextLine());
	String[] input;
	int a, b, c;
	for (int i = 0; i < n; i++) {
	    input = scan.nextLine().split(" ");
	    a = Integer.parseInt(input[0]);
	    b = Integer.parseInt(input[1]);
	    c = Integer.parseInt(input[2]);
	    if (isRightTriangle(a, b, c)) {
		System.out.println("YES");
	    } else {
		System.out.println("NO");
	    }
	}
    }
    static boolean isRightTriangle (int a, int b, int c) {
	int a2 = a * a, b2 = b * b, c2 = c * c;
	if (a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2) {
	    return true;
	}
	return false;
    }
}