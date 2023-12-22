import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		for(int i = 1; i <= N; i++) {
			int n = i;
			int count = 0;
			int tm = (int)Math.floor(n / 2);
			int tmp = (int)Math.floor(Math.sqrt(tm));
			for(int j = 1; j <= tmp; j++) {
				n = i;
				n -= 2 * j * j;
				if(n > 0) {
					double check = Math.sqrt(n);
					if(check == Math.floor(check) && check != 1) {
						if(check - j == 0) {
							count += 0;
						}else if(check - j == j) {
							count += 1;
						}else {
							count += 3;
						}
					}
				}else {
					continue;
				}
			}
			System.out.println(count);
		}
	}

}