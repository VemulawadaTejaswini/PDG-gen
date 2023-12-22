import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);	
	public static void main(String[] args) {
		int n = Integer.parseInt(scan.next());
		for(int i = 1; i <= n; i++) {
			if(i % 3 == 0) {
				System.out.print(" " + i);
			} else {
			int a = i;
				while(true) {
					if(a % 10 == 3) {
						System.out.print(" " + i);
						break;
					}
					a = a / 10;
					if(a == 0) {
						break;
					}
				}
			}
		}
		System.out.println();

	}
}