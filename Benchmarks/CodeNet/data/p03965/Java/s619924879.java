import java.util.Scanner;

public class Main {
	private static Main instance = new Main();
	
	private Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		instance.solve();
	}
	
	private void solve() {
		String n = scanner.nextLine();
		int numOfGames = n.length();
		int idealP = numOfGames / 2;
		int numOfP = n.replace("g", "").length();
		System.out.printf("%d", idealP - numOfP);
	}
}
