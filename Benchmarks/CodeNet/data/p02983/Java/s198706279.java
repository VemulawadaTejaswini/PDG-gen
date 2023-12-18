import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int L = stdIn.nextInt();
		int R = stdIn.nextInt();
		int a, b, min = 100000000;
		
		for(a = L; a <= R; a++) {
			for(b = L + 1; b <= R; b++) {
				if((a * b) % 2019 < min) {
					min = (a * b) % 2019;
				}
			}
		}
		System.out.println(min);
		stdIn.close();
	}
}