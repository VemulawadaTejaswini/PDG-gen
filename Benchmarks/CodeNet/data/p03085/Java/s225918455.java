import java.util.Scanner;

public class DoubleHelix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String Base = sc.nextLine();
		switch(Base) {
			case "A":
				System.out.println("T");
				break;
			case "T":
				System.out.println("A");
				break;
			case "C":
				System.out.println("G");
				break;
			default:
				System.out.println("C");
		}
	}
}
