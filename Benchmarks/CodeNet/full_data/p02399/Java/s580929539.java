import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
        stdIn.close();
        System.out.printf("%d %d %f",x/y,x%y,(double)x/y);
	}
}
