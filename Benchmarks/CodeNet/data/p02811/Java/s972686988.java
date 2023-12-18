import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		
		String result = x <= 500*k ? "Yes" : "No";
		System.out.println(result);
	}		
}