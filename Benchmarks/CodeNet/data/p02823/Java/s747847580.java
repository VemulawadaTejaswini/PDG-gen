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
					if(n - b > a && n - b > a- b) {
						System.out.println(a - 1);
						return;
					}else {
						System.out.println(n - b);
						return;
					}
				}
			}else {
				if((b - a) %2 == 0) {
					count++;
					b--;
					a++;
				}else {
					if(n - a > b && n - a > b - a) {
						System.out.println(b - 1);
						return;
					}else {
						System.out.println(n - b);
						return;
					}
				}
			}
		}
		System.out.println(count);

	}

}