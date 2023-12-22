import java.util.Scanner;

public class Main {
	private static int nowSosuu = 1;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		System.out.printf(n + ":");

		while(n != 1) {
			setNextSosuu();
			while(n % nowSosuu == 0) {
				System.out.printf(" %d", nowSosuu);

				n /= nowSosuu;
			}
		}
		System.out.println("");

		scan.close();
	}

	private static void setNextSosuu() {
		while(true) {
			nowSosuu++;
			for(int i = 2; i <= nowSosuu; i++) {
				if(i == nowSosuu) {
					return;
				}
				else if(nowSosuu % i == 0) {
					break;
				}
			}
		}
	}
}
