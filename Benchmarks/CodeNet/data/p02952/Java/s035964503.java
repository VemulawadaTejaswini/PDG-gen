import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		scan.close();
		int div = 10;
		int add = 9;
		int result = 0;
		while(true) {
			// n/divの結果がdivより大きい場合
			if(n / div >= 1) {
				result += add;
			}else {
				if(n / (div / 10) > 0) {
					result += n % (div / 10) + 1;
					break;
				}else {
					break;
				}
			}
			add *= 100;
			div *= 100;
		}
		System.out.println(result);
	}

}
