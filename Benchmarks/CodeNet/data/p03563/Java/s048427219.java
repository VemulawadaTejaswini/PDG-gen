import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int rating = scanner.nextInt();
		int goal = scanner.nextInt();
		
		int ans = (goal*2)-rating;
		
		System.out.println(ans);
		
		scanner.close();
	}

}