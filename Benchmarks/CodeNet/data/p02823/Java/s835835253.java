import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;

		while(a != b) {
			if(a > b) {
				if((a - b) % 2 == 0) {
					count++;
					a--;
					b++;
				}else {
					System.out.println(a-1);
					return;
				}
			}else {
				if((b - a) %2 == 0) {
					count++;
					b--;
					a++;
				}else {
					System.out.println(b - 1);
					return;
				}
			}
		}
		System.out.println(count);

	}

}