import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		while (true) {
			  if (x==0 && y==0) break;
			  if (x>y) System.out.println(y + " " + x);
			  else System.out.println(x + " " + y);
			  x = stdIn.nextInt();
			  y = stdIn.nextInt();
		}
        stdIn.close();
	}
}

