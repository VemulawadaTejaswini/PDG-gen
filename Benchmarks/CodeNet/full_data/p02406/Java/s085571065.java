import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		call(N);
		sc.close();
	}

	public static void call(int n) {
		int i = 1;
		while(i <= n) {
			if(i % 3 == 0) {  // 3の倍数かどうか
				System.out.print(" " + i);
			}else {  // 3を含む数かどうか（例：13, 31, 322）
				int x = i;
				while(x > 0) {
					if(x % 10 == 3) {
						System.out.print(" " + i);
						break;
					}
					x /= 10;
				}
			}
			i++;
		}
		System.out.println();
	}
}
