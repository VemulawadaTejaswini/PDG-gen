import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		String str = "";
		String ans = "";
		while (sc.hasNext() == true) {
			str = sc.nextLine();
			
			for (int i = 0; i < str.length(); i++) {
				ans = ans + (str.charAt(i) + 1);
			}
			
			ans = ans + " ";
		}
		ans.trim();
		
		System.out.println(ans);
	}
}