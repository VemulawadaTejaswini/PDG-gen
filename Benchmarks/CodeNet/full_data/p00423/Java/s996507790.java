import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) {
				break;
			}
			int point0 = 0;
			int point1 = 0;
			for(int i = 0; i < n; i++) {
				int a = stdIn.nextInt();
				int b = stdIn.nextInt();
				
				if(a == b) {
					point0 += a;
					point1 += b;
				}
				else if(a > b) {
					point0 += a + b;
				}
				else if(a < b) {
					point1 += a + b;
				}
			}
			System.out.println(point0 + " " + point1);
		}
	}
}