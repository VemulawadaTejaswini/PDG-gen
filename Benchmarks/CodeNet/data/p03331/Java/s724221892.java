import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		if(n%10 == 0) System.out.println(10);
		else {
			String nn = n+"";
			String m[] = nn.split("");
			int ans = 0;
			for(int i=0; i<m.length; i++) {
				ans += Integer.parseInt(m[i]);
			}
			System.out.println(ans);
		}
	}
}