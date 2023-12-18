// int型のオーバーフローに注意
// 文字列の比較は==ではなく.equalsを使おう
// Stringの入力はnext();が丸い

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		    Scanner sc = new Scanner(System.in);

		    int n = sc.nextInt();
		    long[] luca = new long[87];
		    
		    luca[0] = 2;
		    luca[1] = 1;
		    for(int i = 2; i < 87; i++) {
		    	luca[i] = luca[i-1] + luca[i-2];
		    }
		    System.out.println(luca[n]);
		    
		    sc.close(); }

	public static  int gcd(int a, int b) {
	    if (a < b) {
	        int tmp = a;
	        a = b;
	        b = tmp;
	    }

	    int r = -1;
	    while (r != 0) {
	        r = a % b;
	        a = b;
	        b = r;
	    }

	    return a;
	}
}
