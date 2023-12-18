import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = x;

		if(x == 2) {
			System.out.println(2);
			System.exit(0);
		}else if(x == 3) {
			System.out.println(3);
			System.exit(0);
		}

		if(y % 2 == 0) {
			y++;
		}

		int n = 3;
		while(n <= x) {
			boolean b = true;
			for(int i = 3; i * i < y; i += 2) {
				if(y % i == 0) {
					b = false;
					break;
				}
			}
			if(b) {
				System.out.println(y);
				System.exit(0);
			}
			y += 2;
		}
		sc.close();
	}
}
