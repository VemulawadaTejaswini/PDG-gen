import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		for (int i = 1; i < 3000; i++) {
			if (x == 0 && y == 0) {
				break;
			}else if (x < y){
				System.out.println(x + " " + y);
			}else if (x > y){
				System.out.println(y + " " + x);
			}
		}
	}
}

