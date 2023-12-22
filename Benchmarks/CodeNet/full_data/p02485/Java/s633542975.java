/* 各桁の総和を表示 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	while (scan.hasNext()) {
	    int n = scan.nextInt();
	    int sum = 0;

	    if (n == 0)
		break;
	    
	    while (n > 0) {
		sum += n % 10;
		n = n / 10;
	    }
	    System.out.println(sum);
	}
    }
}