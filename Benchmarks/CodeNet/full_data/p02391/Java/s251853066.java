import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		switch(compareTo(scan.nextInt(), scan.nextInt())) {
		case -1:
			System.out.println("a < b");	break;
		case 0:
			System.out.println("a == b");	break;
		case 1:
			System.out.println("a > b");	break;
		default:
			;
		}
		
	}
	
	public static int compareTo(int a, int b) {
		if (a == b)
			return 0;
		
		return a > b ? 1 : -1;
	}

}

