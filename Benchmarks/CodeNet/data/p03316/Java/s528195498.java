import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = n % 3 == 0 ? "Yes" : "No";
		System.out.println(ans);
		
		sc.close();
	}
}


