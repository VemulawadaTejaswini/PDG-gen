import java.util.Scanner;

class Main {
	public static void main(String[] args) {
	
	Scanner stdIn = new Scanner(System.in);
	
	int ab = stdIn.nextInt();
	int bc = stdIn.nextInt();
	int ca = stdIn.nextInt();
	
	System.out.println(ab * bc / 2);
	
	}
}