import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		sc.close();
		
		if(x-a >= 0 && b >= x)
			System.out.println("YES");
		else System.out.println("NO");
	}
}