import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	void run() {
		Scanner scan = new Scanner(System.in);
		int n, temp, tarosP = 0, hanakosP = 0;
		String taro, hanako;
		
		// input
		n = scan.nextInt();
		
		// loop
		for (int i = 0; i < n; i++) {
			taro = scan.next(); hanako = scan.next();
			temp = taro.compareTo(hanako);
			if (temp > 0) tarosP += 3;
			else if (temp < 0) hanakosP += 3;
			else {
				tarosP++; hanakosP++;
			}
		}
		
		// output
		System.out.println(tarosP + " " + hanakosP);
	}
}

