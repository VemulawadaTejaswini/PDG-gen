import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int A = sc.nextInt();
    		final int B = sc.nextInt();

    		for (int i=1; i<=20; i++) {
    			if ((A-1)*i+1>=B) {
    				System.out.println(i);
    				System.exit(0);
    			}
    		}

    	} finally {
    		sc.close();
    	}
    }
}

