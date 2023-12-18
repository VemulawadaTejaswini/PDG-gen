import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int N = sc.nextInt();
    		final int K = sc.nextInt();

    		double value = Math.log(N) / Math.log(K);
    		System.out.println((int) Math.ceil(value));

    	} finally {
    		sc.close();
    	}
    }
}
