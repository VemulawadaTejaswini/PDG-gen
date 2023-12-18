import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int ans = 700;
        for (char c: str.toCharArray()) {
        	if (c == 'o')
        		ans += 100;
        }
        System.out.println(ans);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}
