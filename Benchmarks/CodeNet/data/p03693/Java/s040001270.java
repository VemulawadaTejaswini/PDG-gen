
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int r = Integer.parseInt(scan.close());
	int g = Integer.parseInt(scan.close());
	int b = Integer.parseInt(scan.close());

	int numm = 100*r + 10*g + b;
	String ans = num%4 == 0 ? "YES" : "NO";
	System.out.println(ans);
	scan.close();
    }
}
