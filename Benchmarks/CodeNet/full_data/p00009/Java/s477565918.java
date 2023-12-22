import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()){
		int n = scan.nextInt();
		int c = 0;
		for (int j = 1; j <= n; j++) {
			if (j == 2) {
				c++;
			}
			for (int i = 2; i < j; i++) {
				if (j % i == 0) {
					break;
				}
				if (i == j - 1) {
					c++;
				}
			}
		}
		System.out.println(c);
		}
	}

}