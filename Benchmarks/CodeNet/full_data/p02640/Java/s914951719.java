import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		
		

		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();  //ноги
		
		String reString = "Yes";
		
		if (y % 2 != 0) {
			reString = "No";
		}
		
		if(x * 4 < y) {
			reString = "No";
		}
		if(x * 2 > y) {
			reString = "No";
		}
		
		
		System.out.println(reString);

	}}