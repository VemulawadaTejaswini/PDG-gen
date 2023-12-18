
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int a = Integer.parseInt(scan.next());
	int b = Integer.parseInt(scan.next());
	int h = Integer.parseInt(scan.next());

	System.out.println((a+b)*h/2);
	scan.close();
    }
}
