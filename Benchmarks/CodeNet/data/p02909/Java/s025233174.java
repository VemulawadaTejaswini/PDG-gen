import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
		if(s.contains("Sunny")) System.out.println("Cloudy");
		else if(s.contains("Cloudy")) System.out.println("Rainy");
		else System.out.println("Sunny");
	}

}
