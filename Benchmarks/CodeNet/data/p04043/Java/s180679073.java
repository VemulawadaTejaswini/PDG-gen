import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		for(int i = 0 ; i < 3; i++) {
			int num = sc.nextInt();

			if(num == 5 || num == 7) {
				total += num;
			}else {
				System.out.println("NO");
				return;
			}
		}

		if(total == 17) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
