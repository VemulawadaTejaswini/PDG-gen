/* 成績を表示 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int m, f, r;
	while (scan.hasNext()) {
	    m = scan.nextInt();
	    f = scan.nextInt();
	    r = scan.nextInt();
	    
	    if (m==-1 && f==-1 && r==-1)
		break;

	    if (m==-1 || f==-1) {
		System.out.println("F");
	    } else if (m+f >= 80) {
		System.out.println("A");
	    } else if (m+f >= 65) {
		System.out.println("B");
	    } else if (m+f >= 50) {
		System.out.println("C");
	    } else if (m+f >= 30) {
		if (r >= 50) {
		    System.out.println("C");
		} else {
		    System.out.println("D");
		}
	    } else {
		System.out.println("F");
	    }
	}
    }
}