import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int productBis = Integer.parseInt(line[0]);
		int neededTime = Integer.parseInt(line[1]);
		int allowedTime = Integer.parseInt(line[2]);
		
		System.out.println((allowedTime/productBis)*neededTime);

		
		
		
	}
}
	
	