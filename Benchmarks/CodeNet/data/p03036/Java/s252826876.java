import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int x = scanner.nextInt();
	    int y = scanner.nextInt();
	    int z = scanner.nextInt();

	    for (int i = 1; i <= 10; i++) {
	    	z =  x * z - y;
	    	System.out.println(z);
	    }
	}
}