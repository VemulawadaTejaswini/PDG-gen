import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(scan.next().substring(0, 1) + scan.next().substring(0, 1) + scan.next().substring(0, 1));
		
		scan.close();

	}

}
