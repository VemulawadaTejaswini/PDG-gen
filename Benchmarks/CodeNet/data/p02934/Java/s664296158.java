import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		int n = sc.nextInt();
		double sum = 0;
		for(int i =0 ; i < n ; i++) {
			sum += 1.0/sc.nextDouble();
		}
		System.out.println(1/sum);
	}
}
