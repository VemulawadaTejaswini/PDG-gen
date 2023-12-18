import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int A1 = sc.nextInt();
    		final int A2 = sc.nextInt();
    		final int A3 = sc.nextInt();

    		if (A1 + A2 + A3 >= 22) {
    			System.out.println("bust");
    		} else {
    			System.out.println("win");
    		}

    	} finally {
    		sc.close();
    	}
    }
}
