import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
 
		int num = Integer.parseInt(sc.nextLine());
		int ans = 1;
		while (ans <= num) {
			ans = ans * 2;
		}
		System.out.println(ans / 2);
	}
}