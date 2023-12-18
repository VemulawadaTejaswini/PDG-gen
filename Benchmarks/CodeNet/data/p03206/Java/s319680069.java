import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String D = sc.nextLine();
		if(D.equals("25")) {
		System.out.println("Christmas");
		} else if(D.equals("24")){
			System.out.println("Christmas Eve");
		} else if(D.equals("23")) {
			System.out.println("Christmas Eve Eve");
		} else {
			System.out.println("Christmas Eve Eve Eve");
		}
	}
}
