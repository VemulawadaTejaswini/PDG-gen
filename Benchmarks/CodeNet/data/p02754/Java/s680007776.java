import java.util.Scanner;
public class Main{

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int allBalls = sc.nextInt();
		int blueBalls = sc.nextInt();
		int redBalls = sc.nextInt();
		if(blueBalls == 0) {
			System.out.println("0");
		}
		else
			System.out.println(allBalls - redBalls);
		
		
		sc.close();
	}
	
	public static void main(String[] args) {
		solve();

	}

}
