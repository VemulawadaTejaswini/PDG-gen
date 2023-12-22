import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	int result = 0;
	int a, b, c;
	Scanner sc = new Scanner(System.in);
	try {
	    a = sc.nextInt();
	    b = sc.nextInt();
	    c = sc.nextInt();
	    for (int i = a; i <= b; i++) {
		if (canMod(i, c)) {
		    result++;
		}
	    }
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	} finally {
	    sc.close();
	}
	System.out.println(result);
    }

    private static boolean canMod(int a, int c) {
	return c % a == 0 ? true : false;
    }
}