import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
			int x = sc.nextInt();
			if(x == 0) {
				break;
			}
			int a = x / 1000;
			int b = (x - a*1000) / 100;
			int c = (x - a*1000 - b*100) / 10;
			int d = x % 10;
			System.out.println(a + b + c + d);
		}
	}
}