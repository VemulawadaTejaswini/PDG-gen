import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int yen = sc.nextInt();
		int fukuzawa = -1;
		int higuchi = -1;
		int noguchi = -1;

		for(int i = 0;i <= n;i++) {
			if(i * 10000 > yen) {
				break;
			}
			for(int j = 0;j <= n-i;j++) {
				if(10000 * i + 5000 * j > yen) {
					break;
				}
				if((yen - (10000 * i + 5000 * j)) % 1000 == 0
						&& (yen - (10000 * i + 5000 * j)) / 1000 == n-i-j ) {
					fukuzawa = i;
					higuchi = j;
					noguchi = n-i-j;
					break;
				}
			}
		}
		System.out.println(fukuzawa + " "+ higuchi +" " + noguchi);
	}
}