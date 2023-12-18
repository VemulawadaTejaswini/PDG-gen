import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int M = sc.nextInt();
    		final int D = sc.nextInt();

    		int count = 0;
    		for (int m=1; m<=M; m++) {
    			for (int d=11; d<=D; d++) {
    				int d1  = d%10;
    				int d10 = d/10;
    				int multi = d1 * d10;
    				if (d1 >=2 && d10 >= 2 && m == multi) {
    					// System.out.println(String.format("%d/%d, %d %d", m, d, d1, d10));
    					count++;
    				}
    			}
    		}

    		System.out.println(count);

    	} finally {
    		sc.close();
    	}
    }
}

