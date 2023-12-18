import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);
	String boxA = scanner.next();
	String boxB = scanner.next();
	String boxC = scanner.next();

	scanner.close();

	// cab
	String result = boxC + " " + boxA + " " + boxB;

	System.out.println(result);
    }

}