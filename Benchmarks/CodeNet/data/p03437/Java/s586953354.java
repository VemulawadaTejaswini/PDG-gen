import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();
		int m = sc.nextInt();

		if(n%m == 0){
			System.out.println(-1);
			return;
		}
		
		System.out.println((long)(n*m)+1);
	}
}
