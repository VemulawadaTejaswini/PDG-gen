/* 入力された数値の組の大きさの長方形を表示 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int H, W;
	while (scan.hasNext()) {
	    H = scan.nextInt();
	    W = scan.nextInt();

	    for (int i=0; i<H; i++) {
		for (int j=0; j<W; j++) {
		    System.out.print("#");
		}
		System.out.print("\n");
	    }
	    System.out.print("\n");
	}
    }
}