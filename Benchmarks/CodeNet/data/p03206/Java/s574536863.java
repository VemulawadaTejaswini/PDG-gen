import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		byte day = stdIn.nextByte();
		
		switch	(day) {
			case 22:
				System.out.println("Christmas Eve Eve Eve");
				break;
			case 23:
				System.out.println("Christmas Eve Eve");
				break;
			case 24:
				System.out.println("Christmas Eve");
				break;
			case 25:
				System.out.println("Christmas");
				break;
			}
		
	}
}