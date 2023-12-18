import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.nextLine();
		
		int y = Integer.parseInt(n.substring(0, 4));
		int m = Integer.parseInt(n.substring(5, 7));
		int d = Integer.parseInt(n.substring(8, 10));
		
		if (y <= 2019 && m <= 4 && d <= 30) {
			System.out.println("Heisei");
		}else {
			System.out.println("TBD");
		}
		sc.close();
	}

}
