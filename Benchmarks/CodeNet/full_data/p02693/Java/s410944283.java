import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = Integer.parseInt(sc.nextLine());
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int g = 0;

		for(int i = a; i <= b; i++) {
			if(i % k == 0) {
				g = 1;
				break;
			}
		}
		if(g == 1) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
	}
}
