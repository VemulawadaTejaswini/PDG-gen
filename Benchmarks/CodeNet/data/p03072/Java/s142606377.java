import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int max = 0;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int h = scan.nextInt();
			if (max <= h) {
				ans++; 
				max = h;
			}
		}
		System.out.println(ans);
	}
    public static void main(String[] args) {
    	new Main().run();
    }
}
