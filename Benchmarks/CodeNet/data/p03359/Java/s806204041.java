import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int ans = 0;
		for(int i=1; i<=a; i++) 
			for(int j=1; j<=b; j++)
				if(i==j) ans++;
		
		System.out.println(ans);
	}
}